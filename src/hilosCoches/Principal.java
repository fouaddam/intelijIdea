package hilosCoches;

import java.util.ArrayList;
import java.util.List;

public class Principal {
    public static void main(String[] args) {

        Buffer buffer=new Buffer(5);
        List<Coche>lista=new ArrayList<>();

        Coche coche1=new Coche(1, "H456454");
        Coche coche2=new Coche(2, "4546dd54");
        Coche coche3=new Coche(3, "79879dd");
        Coche coche4=new Coche(4, "dd56465ff");
        Coche coche5=new Coche(5, "5454645d");
        Coche coche6=new Coche(6, "6565kkk56");

                lista.add(coche1);
                lista.add(coche2);
                lista.add(coche3);
                lista.add(coche4);
                lista.add(coche5);
                lista.add(coche6);

        Entrada entrada=new Entrada(buffer,lista);
        Lavado lavado=new Lavado(buffer);

        entrada.start();
       lavado.start();








    }







}
