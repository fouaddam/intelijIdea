package canaFilosofos;

public class Palillo {

    private int id;
    private boolean libre=true;


    public Palillo(int id){
        this.id=id;
    }


    public synchronized void  CogerPalillo(int id_filosofo) throws InterruptedException {
        while (!this.libre){
            wait();
        }


        System.out.println("el filosofo "+id_filosofo+ " coge el palillo "+this.id);
        libre=false;




    }

    public synchronized void  Dejarpalillo(int id_filosofo){
        libre=true;
        System.out.println("el filosofo con el id "+id_filosofo +" deja el palillo "+this.id);
        notify();

    }




}
