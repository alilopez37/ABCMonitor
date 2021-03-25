public class HiloC extends Thread{
    Monitor monitor;
    public HiloC(Monitor monitor, String name) {
        super(name);
        this.monitor = monitor;
    }

    @Override
    public void run(){
        monitor.imprimirC();
    }
}
