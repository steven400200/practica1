package parcial2.programacio3.hilos;

public class Main implements Runnable{
    float numero;

    Thread s4;
    Thread s5;



    private static int promedio;


    public static void main(String[] args) throws InterruptedException {
        Main hilos = new Main();

        t1 hilo1 = new t1();
        t2 hilo2 = new t2();

        hilo1.start();
        hilo2.start();
        hilo1.join();
        hilo2.join();
        hilos.run();




    }

    private void ejecutars4() {

        System.out.println("Inicia s4");
        System.out.println("multiplicamos (a*b)");
        System.out.println(t2.promedio);
        this.numero = (t1.num*t2.promedio);
        System.out.println("finaliza s4");

    }
    public void starHiloS4() {
        s4= new Thread(this);
        s4.start();
    }
    private void ejecutars5() {
        System.out.println("Inicia s5");

        System.out.println("imprimimos c que es el resultado de la multiplicacion  ="+this.numero);
        System.out.println("finaliza s5");


    }
    public void starHiloS5() {
        s5= new Thread(this);
        s5.start();
    }



    @Override
    public void run() {
        ejecutars4();
        ejecutars5();

    }
}
