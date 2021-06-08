class Thread1 implements Runnable{
    @Override
    public void run() {
        for(int i = 0; i < 10; i++){
            System.out.println("i: "+i);
        }
    }
}

public class Main {
    public static void main(String args[]){
        System.out.println("Hello");

//        Runnable thread1 = new Thread1();
//        Thread thread = new Thread(thread1);
//        thread.start();

        Thread1 thread1 = new Thread1();
        Thread thread = new Thread(thread1);
        thread.start();

        for(int j=0;j<10;j++){
            System.out.println("j: "+j);
        }
    }
}
