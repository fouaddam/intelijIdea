package Dead_Lock;

public class Hilo1 extends Thread{

    private A a;
    private B b;



    public Hilo1(A a,B b,String name){
        super(name);
        this.a=a;
        this.b=b;
    }


    @Override
    public void run() {
        super.run();
        try {
            a.m1(b);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }
}
