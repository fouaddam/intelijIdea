package video7rep;

public class Buffer {

    private  char row [];
    private int position;
    private boolean full;
    private boolean empty;


        public Buffer(int size){
            row=new char[size];
            position=0;
            full=false;
            empty=true;

        }

        public synchronized char consumir() throws InterruptedException {

            while (this.empty){
               wait();
            }
            position--;

            this.full=false;
            if(position==0){
                this.empty=true;
            }
            notifyAll();
            return row[position];
        }

     public synchronized void Produce(char c) throws InterruptedException {
            while (this.full){
                wait();
            }

            position++;
            this.empty=false;
            if (position==row.length){
                this.full=true;
            }
            notifyAll();
     }






}
