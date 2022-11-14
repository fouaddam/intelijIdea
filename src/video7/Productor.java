package video7;

public class Productor extends Thread{

    private Buffer buffer;

    String frase="abcdefghijklmnxz";

    public Productor(Buffer buffer) {
        this.buffer = buffer;
    }


    @Override
    public void run() {
        super.run();
        while (true){
            char c=frase.charAt((int)(Math.random()*frase.length()));
            try {
                buffer.Producir(c);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("se ha depositado el caracter "+c);

            try {
                sleep((int)Math.random()*4000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }


    }
}
