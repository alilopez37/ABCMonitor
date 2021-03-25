public class Main {

    public static void main(String[] args){
        Monitor monitor = new Monitor();

        HiloA hiloA = new HiloA(monitor,"HiloA");
        HiloB hiloB = new HiloB(monitor,"HiloB");
        HiloC hiloC = new HiloC(monitor,"HiloC");

        hiloC.start();
        hiloA.start();
        hiloB.start();
    }
}
