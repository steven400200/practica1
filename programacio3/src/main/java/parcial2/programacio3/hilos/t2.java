package parcial2.programacio3.hilos;

public class t2 extends Thread {
    static float promedio;

    public t2() {
    }

    @Override
    public void run(){
        System.out.println("Inicia s2");

        promedioArray();
        System.out.println("Finaliza s2");


    }





    public void promedioArray() {
        float numeros=0;
        for (int i = 0; i < t1.numeros.length; i++) {

            for (int j = 0; j < t1.numeros.length; j++) {
                if (i == 0 || j == 3 || i == 3 || j == 0) {
                    numeros+= t1.numeros[i][j];

                }
            }

        }
        promedio=(numeros/12);


    }
}
