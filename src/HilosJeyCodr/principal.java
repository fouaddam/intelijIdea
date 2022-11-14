package HilosJeyCodr;

import java.util.stream.LongStream;

public class principal {

    public static void main(String[] args) {
        var hiloConLambda=new Thread(()->Suma(),"Andres ");
        var hiloConLambda2=new Thread(()->Suma(),"Fouad ");
            hiloConLambda2.setPriority(Thread.MAX_PRIORITY);
                hiloConLambda.start();
                hiloConLambda2.start();
    }

    private static void Suma(){
        System.out.println("Ha finalizado el Hilo "+Thread.currentThread().getName()+ " la suma" +
                " es "+ LongStream.rangeClosed(0, 10).summaryStatistics());
    }
}
