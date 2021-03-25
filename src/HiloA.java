public class HiloA extends Thread{
    Monitor monitor;
    public HiloA(Monitor monitor, String name) {
        super(name);
        this.monitor = monitor;
    }

    @Override
    public void run(){
        monitor.imprimirA();
    }
}
