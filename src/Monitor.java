
public class Monitor {
        private boolean a = true;
        private boolean b = false;
        private boolean c = false;
        Object objeto = new Object();

        public synchronized void imprimirA(){
            while (!a)   //GuardaBoolena
                try { this.wait();}
                catch(Exception e) {}
            System.out.println(Thread.currentThread().getName() +": A");
            b = true;
            this.notifyAll();
        }
        public synchronized void imprimirB(){
            while (!b)
                try { this.wait();}
                catch(Exception e) {}
            System.out.println(Thread.currentThread().getName() +": B");
            c = true;
            this.notifyAll();
        }
        public  void imprimirC(){
            synchronized (objeto) {
                while (!c)
                    try {
                        objeto.wait();
                    } catch (Exception e) {
                    }
                System.out.println(Thread.currentThread().getName() + ": C");
            }
        }
}
