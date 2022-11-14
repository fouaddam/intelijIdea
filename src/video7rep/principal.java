package video7rep;

public class principal {


    public static void main(String[] args) {

        Buffer buffer=new Buffer(6);

        Productor productor1=new Productor(buffer);

        Consumir consumir1=new Consumir(buffer);


        productor1.start();
        consumir1.start();


    }
}
