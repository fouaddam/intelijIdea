package hilosAndres;

public class MiHilo extends Thread{

    public MiHilo(String nombre) {
        super(nombre);
        setPriority(MAX_PRIORITY);
    }

    @Override
    public void run() {
        super.run();
        System.out.println("soy el hilo "+currentThread().getName());
        System.out.println("Solicitude de ejecucion del otro hilo por parte de "+currentThread().getName());

        Thread.yield();//solicitud de comunication a otro hilo de la misma prioridad
        System.out.println("aqui me muerooooooo "+currentThread().getName());




    }
}
