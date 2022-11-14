package VideoDiscoDuro6;

public class Hilo extends Thread{

    private int id;
    private int size;
    private Counter counter;

    public Hilo(int id, int size, Counter counter) {
        this.id = id;
        this.size = size;
        this.counter = counter;
    }

    @Override
    public void run() {
        if(this.counter.isSync()){
            counter.numerosSyncronizados(id, size);
        }else {
            counter.numerosNoSyncronizados(id, size);
        }
    }
}
