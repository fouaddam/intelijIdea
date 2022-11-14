package Methodo_run;

public class Hilo extends Thread{


    @Override
    public void run() {
        super.run();
        System.out.println("soy el hilo "+currentThread().getName());
    }
}
