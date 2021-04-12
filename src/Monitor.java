
public class Monitor {
        private boolean a = true;
        private boolean b = false;
        private boolean c = false;
        Object objeto = new Object();
        String objetoString = "null";

        public  synchronized void imprimirA(){
                while (!a)   //GuardaBoolena
                    try {
                        this.wait();
                    } catch (Exception e) {
                    }
                System.out.println(Thread.currentThread().getName() + ": A");
                b = true;
                this.notifyAll();
        }

        public  void imprimirB(){
            synchronized (this) {
                while (!b)
                    try {
                        this.wait();
                    } catch (Exception e) {
                    }
                System.out.println(Thread.currentThread().getName() + ": B");
                c = true;

                synchronized (objetoString) {
                    objetoString.notifyAll();
                }
            }
        }


        public  void imprimirC(){
            synchronized (objetoString) {
                System.out.println("Entrando a C");
                while (!c) {
                    try {
                        objetoString.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                System.out.println(Thread.currentThread().getName() + ": C");
            }
        }
}
