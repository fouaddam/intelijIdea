package video7;

public class Buffer {

    private char [] arrayCaracteres;
    private int next;
    private boolean empty;
    private boolean full;


    public Buffer(int size){
        this.arrayCaracteres=new char[size];
        this.next=0;
        this.empty=true;
        this.full=false;

    }


    public synchronized char Consumir() throws InterruptedException {

        while (this.empty){
            wait();

        }
        next--;
            this.full=false;
            if(next==0){
                this.empty=true;
            }
         notifyAll();
        return this.arrayCaracteres[this.next];
    }

    public  synchronized void Producir(char c) throws InterruptedException {

        while (this.full){
            wait();



        }
        arrayCaracteres[next]=c;
               next++;
                this.empty=false;
                if(next==arrayCaracteres.length){
                    this.full=true;
                }
                notifyAll();
    }





}
