package Dead_Lock;


public class principal {


    public static void main(String[] args) throws InterruptedException {
        A a=new A();
        B b=new B();

        Hilo1 hilo1=new Hilo1(a,b,"hilo 1");
        Hilo2 hilo2=new Hilo2(a,b,"hilo 2");

        hilo1.setPriority(Thread.MAX_PRIORITY);
        hilo2.setPriority(Thread.MIN_PRIORITY);

        hilo1.start();
        hilo2.start();
        Tester tester=new Tester(hilo1,hilo2);
        tester.start();

        hilo1.join();
        hilo2.join();



    }





}
