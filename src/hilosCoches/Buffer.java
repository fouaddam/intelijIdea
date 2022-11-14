package hilosCoches;

public class Buffer {

            private Coche []coches;
            private int position;
            private boolean full;
            private boolean empty;

            public Buffer(int size) {
                this.coches = new Coche[size];
                this.position = 0;
                this.full = false;
                this.empty = true;
            }

            public synchronized void Producir(Coche coche) throws InterruptedException {

                while(this.full){
                    wait ();
                }
                coches[position]=coche;
                position++;
                this.empty=false;
                if(position==coches.length){
                    this.full=true;
                }
                notifyAll();
            }

            public synchronized Coche Consumir() throws InterruptedException {
                while (this.empty){
                    wait();
                }
                position--;
                this.full=false;
                if(position==0){
                    empty=true;
                }
                notifyAll();
                return coches[position];
            }






}
