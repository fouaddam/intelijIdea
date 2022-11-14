package video6;

public class principal {



    public static void main(String[] args) throws InterruptedException {

        Counter counter=new Counter(true);
        Hilo hilo=new Hilo(1, 5,counter );
        Hilo hilo2=new Hilo(2, 10,counter );

        hilo.start();
        hilo2.start();

        hilo.join();
        hilo2.join();






    }
}

