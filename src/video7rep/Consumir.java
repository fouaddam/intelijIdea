package video7rep;

public class Consumir extends Thread {

    private Buffer buffer;

    public Consumir(Buffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        super.run();
        while (true){

            try {
                char c=buffer.consumir();
                System.out.println("se ha consumido la letra "+c);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            try {
                sleep((int)Math.random()*4000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}
