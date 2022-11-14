package hilosCoches;

public class Lavado extends Thread{

    private Buffer buffer;

    public Lavado(Buffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        while (true){
            try {
                Coche coche=buffer.Consumir();
                System.out.println("se ha lavado el coche "+coche.getMatricula());
                System.out.println("coche pagado :)))"+coche.getMatricula());

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            try {
                sleep((int)Math.random()*6000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}
