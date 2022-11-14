package video6;

public class Hilo extends  Thread{

    private int id;
    private int n;
    private Counter counter;

    public Hilo(int id, int n, Counter counter) {
        this.id = id;
        this.n = n;
        this.counter = counter;
    }

    @Override
    public void run() {
        if(this.counter.isSync()){
            this.counter.mostrarNumerosSync(id, n);
        }else {
            this.counter.mostrarNumerosNoSync(id,n);
        }
    }
}
