/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package etecjava.pkgif.pkgelse;

/**
 *
 * @author Aluno CA
 */
public class EtecJavaIfElse {
    public static void main(String[] args) {
     int r, n=3;
     if (n>2&&n<0){
         r=(n+1)*(n-2);
     System.out.println("Resultados: " + r);
     }
     else
     {
         r=(n+2)*(n-1);
          System.out.println("Resultados: " + r);
          System.exit(0);
     }
    }  
    
}
