package Dead_Lock;

public class Tester extends Thread{

    Hilo1 hilo1;
    Hilo2 hilo2;

            public Tester(Hilo1 h1, Hilo2 h2) {
                this.hilo1 = h1;
                this.hilo2 = h2;
            }

    @Override
    public void run() {
        super.run();
        try {
            sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("el estado del hilo 1 "+hilo1.getState());
        System.out.println("el estado del hilo 2 "+hilo2.getState());

        System.out.println("\n>>>>>>>>>DEBES PARAR LA EJECUCIÃ“N A MANO ... NUNCA SE ACABA<<<<<<<");
    }
}
