package canaFilosofos;

public class Silla {

    private int silla_libres=4;


    public synchronized void OcuparSilla(int idFilosofo) throws InterruptedException {
        while (this.silla_libres==0){
            wait();
        }

        System.out.println("el filosofo con el id "+idFilosofo+ " se sienta a comer ");
        this.silla_libres--;


    }

    public synchronized void Librarilla(int idFilosofo){
            this.silla_libres++;
        System.out.println("el filosofo con el id "+idFilosofo+ " ha librado la silla ");
        notify();
    }

}
