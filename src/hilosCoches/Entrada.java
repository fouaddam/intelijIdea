package hilosCoches;

import java.util.List;

public class Entrada extends Thread{

    private Buffer buffer;
    private List<Coche>listCoches;

    public Entrada(Buffer buffer,List<Coche>listCoches) {
        this.buffer = buffer;
        this.listCoches=listCoches;
    }

    @Override
    public void run() {
        while (true){

            Coche coche=listCoches.get((int)(Math.random()* listCoches.size()));
            try {
                buffer.Producir(coche);
                System.out.println("<<Se ha Entrado el coche>>-- "+coche.getMatricula());

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            try {
                sleep((int)Math.random()*6000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("El coche se esta lavando ----> "+coche.getMatricula());
        }
    }
}
