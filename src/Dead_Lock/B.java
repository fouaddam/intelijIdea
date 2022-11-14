package Dead_Lock;

public class B {
    synchronized void m2(A a) throws InterruptedException {

        System.out.println("soy el hilo "+Thread.currentThread().getName());

        System.out.println("pausamos el hilo 4 s "+Thread.currentThread().getName());
        Thread.sleep(4000);

        System.out.println("el hilo  "+Thread.currentThread().getName()+" llama al metodo a.m1");
        a.m1(this);

        System.out.println("METODO b.m2() FINALIZADO");
        System.out.println("SALE EN METODO b.m2() EL HILO " + Thread.currentThread().getName());


    }
}
