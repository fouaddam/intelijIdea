package video7rep;

public class Productor extends Thread{

    private Buffer buffer;
    String letras="abcdefghigklmnpxzw";

    public Productor(Buffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        super.run();

        while (true){
            char c=letras.charAt((int)(Math.random()*letras.length()));
            try {
                buffer.Produce(c);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("se ha Producido el caracter "+c);
            try {
                sleep((int)Math.random()*4000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
