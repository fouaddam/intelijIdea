package hilosAndres;

public class Otro_hilo extends Thread{


        public Otro_hilo(String nombre){
            super(nombre);
            setPriority(MIN_PRIORITY);
        }



    @Override
    public void run() {
        System.out.println("EJECUCION DEL HILO ... " + getName());
        System.out.println("FINALIZACION DEL HILO ... " + getName());

    }
}
