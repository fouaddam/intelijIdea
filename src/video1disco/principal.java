package video1disco;

public class principal {

    public static void main(String[] args) {

        NumerosLetras hilo1=new NumerosLetras(1);
        NumerosLetras hilo2=new NumerosLetras(2);

        Thread T1=new Thread(hilo1);
        Thread T2=new Thread(hilo2);

        T1.start();
        T2.start();



    }
}
