package canaFilosofos;

public class Principal {



    public static void main(String[] args) {

        Silla silla=new Silla();
        Filosofo [] filosofo=new Filosofo[5];
        Palillo [] palillos=new Palillo[5];

        for (int i = 0; i < palillos.length; i++) {
            palillos[i]=new Palillo(i);
        }

        for (int i = 0; i < filosofo.length; i++) {
            filosofo[i]=new Filosofo(i,palillos[i],palillos[(i+1)%5],silla);
        }

        for (int i = 0; i < filosofo.length; i++) {
            filosofo[i].start();
        }

    }

}
