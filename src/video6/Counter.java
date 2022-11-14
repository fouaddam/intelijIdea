package video6;

public class Counter {

    private boolean sync;

    public Counter(boolean sync){
        this.sync=sync;
    }

    public boolean isSync(){
        return sync;
    }

    public synchronized void mostrarNumerosSync(int id,int size){
        System.out.println("inicio del hilo "+id);
        for (int i = 0; i < size; i++) {
            System.out.println(i);
        }
        System.out.println("fin del hilo "+id);
    }

    public  void mostrarNumerosNoSync(int id,int size){
        System.out.println("inicio del hilo "+id);
        for (int i = 0; i < size; i++) {
            System.out.println(i);
        }
        System.out.println("fin del hilo "+id);
    }









}
