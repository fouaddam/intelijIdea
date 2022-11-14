package vide2disco;

public class Contador implements Runnable{

    private String nombre;
    private int limite;
    private int contador=0;

    public Contador(String nombre, int limite) {
        this.nombre = nombre;
        this.limite = limite;
    }

    @Override
    public void run() {
        while (contador<=limite){

            System.out.println("el hilo "+this.nombre+" : " +contador);
            contador++;
        }
        System.out.println("el hilo"+this.nombre+" : se ha acabado");

    }

}
