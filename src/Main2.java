class Printer{
    public void printDocuments(String name){
        for(int i=0;i<10;i++){
            System.out.println(name +" document number: "+ i + "printing");
        }
    }
}

class MyThread extends Thread{
    Printer printer;
    MyThread(Printer pref){
        printer = pref;
    }

    @Override
    public void run() {
        printer.printDocuments("Shankar");
    }
}

class YourThread extends Thread{
    Printer printer;
    YourThread(Printer pref){
        printer = pref;
    }

    @Override
    public void run() {
        printer.printDocuments("Sahib");
    }
}

public class Main2 {
    public static void main(String[] args) {
        System.out.println("Application Started");
        Printer printer = new Printer();

        MyThread myThread = new MyThread(printer);
        YourThread yourThread = new YourThread(printer);
        myThread.start();

        yourThread.start();

        System.out.println("Application Finished");
    }
}
