package Methodo_run;

public class principal {

    public static void main(String[] args) {

        Hilo hilo=new Hilo();

        hilo.start();
        System.out.println("------------>"+hilo.getState());

        hilo.run();
        System.out.println("------------>"+hilo.getState());

    }
}
