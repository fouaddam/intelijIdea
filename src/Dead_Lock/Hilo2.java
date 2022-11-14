package Dead_Lock;

public class Hilo2 extends Thread{

    private A a;
    private B b;



    public Hilo2(A a,B b,String name){
        super(name);
        this.a=a;
        this.b=b;
    }

    @Override
    public void run() {
        super.run();
        try {
            b.m2(a);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
