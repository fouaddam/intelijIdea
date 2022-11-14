package vide2disco;

public class principal {

    public static void main(String[] args) throws InterruptedException {

        Contador contador1=new Contador("contador 1 ", 10);
        Contador contador2=new Contador("contador 2 ", 5);
        Contador contador3=new Contador("contador 3 ", 3);
        Contador contador4=new Contador("contador 4 ", 7);

        Thread T1=new Thread(contador1);
        Thread T2=new Thread(contador2);
        Thread T3=new Thread(contador3);
        Thread T4=new Thread(contador4);

        T1.start();
        T2.start();
        T3.start();
        T4.start();

        T1.join();
        T2.join();
        T3.join();
        T4.join();

        System.out.print("el programa ha terminado  ");




    }
}
