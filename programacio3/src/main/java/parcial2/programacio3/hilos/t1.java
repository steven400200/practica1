package parcial2.programacio3.hilos;

import java.util.ArrayList;

public class t1 extends Thread{

    static int   numeroMayor=9;


    static int  numeros[] []= {{1,2,3,4},
                       {5,6,7,8},
                       {9,10,11,12},
                       {13,14,15,16}};


    /**public int numeroMayor(int numeros[][]){
        if (){

        }else{
            numeroMayor()
        }

    }*/

    public t1() {
    }

    public void run(){
        System.out.println("Inicia s1");

        recorrerMatriz(t1.numeros,0,0);
        System.out.println(this.num);


        System.out.println("Finaliza s1");


    }
    static int num=0;
    private static void recorrerMatriz(int [][] matriz, int i, int j){
        if(i <= matriz.length-1){
            if(j <=matriz[i].length-1){

                if(matriz[i][j]>num){
                    num=matriz[i][j];
                }

                if(j == matriz[i].length-1)	{
                    i++;
                    j=0;
                }else{
                    j++;
                }
                recorrerMatriz(matriz, i, j);
            }
        }
    }
}
