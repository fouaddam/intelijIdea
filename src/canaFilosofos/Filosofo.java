package canaFilosofos;

public class Filosofo extends Thread{

    private int id_filososfo;
    private Palillo palilloIZQ,palilloDER;
    private Silla silla;


    public Filosofo(int id_filososfo, Palillo palilloIZQ, Palillo palilloDER, Silla silla) {
        this.id_filososfo = id_filososfo;
        this.palilloIZQ = palilloIZQ;
        this.palilloDER = palilloDER;
        this.silla = silla;
    }


    public void run(){
        while (true){

            try {
                silla.OcuparSilla(this.id_filososfo);
                palilloIZQ.CogerPalillo(this.id_filososfo);
                palilloDER.CogerPalillo(id_filososfo);

                palilloDER.Dejarpalillo(id_filososfo);
                palilloIZQ.Dejarpalillo(id_filososfo);
                silla.Librarilla(id_filososfo);
            } catch (InterruptedException e) {

                e.printStackTrace();
            }

        }


    }







}
