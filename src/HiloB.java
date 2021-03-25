public class HiloB extends Thread{
    Monitor monitor;
    public HiloB(Monitor monitor,String name) {
        super(name);
        this.monitor = monitor;
    }

    @Override
    public void run(){
        monitor.imprimirB();
    }
}
