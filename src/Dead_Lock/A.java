package Dead_Lock;

public class A {

    synchronized void m1(B b) throws InterruptedException {

        System.out.println("soy el hilo "+Thread.currentThread().getName()+"Entra en el metodo A.m1(b)");

        System.out.println("pausamos elhilo  4 s el hilo :"+Thread.currentThread().getName());
        Thread.sleep(4000);

        System.out.println("soy el hilo "+Thread.currentThread().getName()+"llamo al metodo A.m1(b)");
        b.m2(this);

        System.out.println("METODO a.m1() FINALIZADO");
        System.out.println("SALE DEL METODO a.m1() EL HILO " + Thread.currentThread().getName());

    }
}
