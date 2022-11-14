package video7;

public class Consumidor extends Thread{

    private Buffer buffer;

    public Consumidor(Buffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {

        while (true){
            try {
                char c= buffer.Consumir();
                System.out.println("se ha consumido el caracter "+c);

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
