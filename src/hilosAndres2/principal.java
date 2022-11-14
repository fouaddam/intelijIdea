package hilosAndres2;

import hilosAndres.MiHilo;

public class principal {

    public static void main(String[] args) throws InterruptedException {

        Thread hilo1=new MiHilo("Hilo 1");
        System.out.println("Soy "+Thread.currentThread().getName());
        System.out.println(hilo1.getState()+" "+hilo1.getName());
        System.out.println(hilo1.isAlive()+" "+hilo1.getName());
        System.out.println("aqui se ejecuta el hilo "+" "+hilo1.getName());
        hilo1.start();
        System.out.println("+++"+hilo1.getState());
        System.out.println("----"+hilo1.isAlive());

        hilo1.join();
        System.out.println("+++"+hilo1.getState());
        System.out.println("----"+hilo1.isAlive());










    }

}
