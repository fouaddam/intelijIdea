package hilosAndres2;

public class MiHilo extends Thread{

    private MiHilo(String name){
        super(name);

    }


    @Override
    public void run() {
        super.run();
        System.out.println("INICIO EJECUCION_______> "+Thread.currentThread().getName());
        System.out.println("FIN DE EJECUCION_______>"+Thread.currentThread().getName());


    }
}



