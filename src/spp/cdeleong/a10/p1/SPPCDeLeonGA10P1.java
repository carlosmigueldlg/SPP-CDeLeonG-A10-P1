/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp.cdeleong.a10.p1;
import java.util.Scanner;
/**
 *
 * @author CarlosMiguel
 */
public class SPPCDeLeonGA10P1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    int tamaño = solicitartamaño();
        int [][] a = arreglo ("A", tamaño);
        int [][] b = arreglo ("B", tamaño);
        sumamatriz (a,b);
    }
    public static int solicitartamaño(){
        Scanner Teclado = new Scanner (System.in);
        boolean flag;
        int a = 0;
        do{
            try{
                System.out.println(" Bienvenido introduce el tamaño del arreglo: ");
                a = Teclado.nextInt();
                flag = false;
            }
            catch (Exception e){
                System.out.println(" Intente de nuevo ");
                Teclado.next();
                flag = true;
            }
        }
        while (flag);
        return a;
    }
    public static int solicitarentero(){
        Scanner Teclado = new Scanner (System.in);
        boolean flag;
        int A = 0;
        do{
            try{
                System.out.println("Escribe un entero: ");
                A = Teclado.nextInt();
                flag = false;
            }
            catch (Exception e){
                System.out.println(" Intente de nuevo");
                Teclado.next();
                flag = true;
            }
        }
        while (flag);
        return A;
    }
    public static int [][] arreglo (String a, int tamaño){
        int [][]arreglo = new int [tamaño][tamaño];
        System.out.println("Arreglo: " + a);
            for (int i = 0; i < arreglo.length; i++){
                for (int j = 0; j < arreglo[i].length; j++){
                    arreglo [i][j] = solicitarentero();
        }
        }
        return arreglo;
    }
    public static int [][] sumamatriz (int [][]a, int[][]b){
        int [][] r = new int [a.length] [a.length];
            System.out.println(" Su resulado es: ");
            for (int i = 0; i < a.length; i++){
                for (int j = 0; j < a[i].length; j++){
                    r[i][j] = a[i][j] - b[i][j];
        System.out.println("["+r[i][j]+"]");   
    }
       
    }
        return r; 
    }
    
}

    

