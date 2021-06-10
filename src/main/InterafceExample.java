package main;

interface Vehicle{
    default void changeGear(){
        System.out.println("hello");
    }
    void speedUp(int a);
    void applyBrakes();
}

class Interface implements Vehicle{
    private int speed;
    private int gear;

    public Interface(int speed, int gear) {
        this.speed = speed;
        this.gear = gear;
    }

    // since we are overriding the changeGear() function the default version will be taken back from the interface
    @Override
    public void changeGear() {
        System.out.println("Gear previously was "+gear);
        System.out.println("Gear Changed to "+(++gear));
    }

    @Override
    public void speedUp(int a) {
        System.out.println("Speed previously was "+speed);
        speed+=a;
        System.out.println("Speed Changed to "+(speed+a));
    }

    @Override
    public void applyBrakes() {
        System.out.println("Speed previously was "+speed);
        speed=0;
        System.out.println("Speed after applying brakes  "+speed);
    }
}


public class InterafceExample{
    public static void main(String[] args) {
        Interface anInterfaceObj = new Interface(60,2);
        anInterfaceObj.changeGear();
        anInterfaceObj.speedUp(10);
        anInterfaceObj.applyBrakes();
    }
}
