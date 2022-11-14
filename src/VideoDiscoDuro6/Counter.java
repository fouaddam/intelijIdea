package VideoDiscoDuro6;

public class Counter {

    private boolean sync;

    public Counter(boolean sync){
        this.sync=sync;
    }

    public boolean isSync(){
        return sync;
    }

    public synchronized void numerosSyncronizados(int id,int size){
        System.out.println("inicio del hilo  "+id);

        for (int i = 0; i < size; i++) {
            System.out.println(i);
        }
        System.out.println("fin del hilo  "+id);

    }

    public  void numerosNoSyncronizados(int id,int size){
        System.out.println("inicio del hilo  "+id);

        for (int i = 0; i < size; i++) {
            System.out.println(i);
        }
        System.out.println("fin del hilo  "+id);

    }









}
