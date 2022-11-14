package video7;

public class principal{

    public static void main(String[] args) throws InterruptedException {

        Buffer buffer=new Buffer(3);

        Productor productor=new Productor(buffer);
        Consumidor consumidor=new Consumidor(buffer);

        productor.start();
        consumidor.start();
        productor.join();
        consumidor.join();


    }


}
