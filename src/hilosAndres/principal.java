package hilosAndres;

public class principal {



    public static void main(String[] args) {
        Thread hilo1=new MiHilo("mihilo");
        Thread hilo2=new Otro_hilo("Otro_hilo");

        hilo1.start();
        hilo2.start();


    }
}
