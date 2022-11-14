package VideoDiscoDuro6;

public class Principal {

    public static void main(String[] args) throws InterruptedException {
        Counter counter=new Counter(false);
        Hilo hilo=new Hilo(1, 5, counter);
        Hilo hilo1=new Hilo(2, 10, counter);
        Hilo hilo2=new Hilo(3, 4, counter);
        Hilo hilo3=new Hilo(4, 3, counter);

        hilo.start();
        hilo1.start();
        hilo2.start();
        hilo3.start();



        hilo.join();
        hilo1.join();
        hilo2.join();
        hilo3.join();


    }
}
