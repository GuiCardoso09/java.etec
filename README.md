# java.etec
class Main {
    public static void main(String[] args) {
     byte qtde = 10;
     short n_short;
     int n = 5;
     long n_L;
     double valor;
     float numero;
     char letra = 'a';
     String bairro;
     boolean cadastro;
    
    System.out.println(qtde);
    System.out.print(letra);
        
               
    }
}

import java.util.Scanner;
class main {
     public static void main(String[] args){
         Scanner entrada= new Scanner(System.in);
         System.out.print("Digite um numero: ");
         int numero = entrada.nextInt();
         System.out.println("Numero digitado: " + numero);
     entrada.close();    
     }
}

import java.util.Scanner;
class main {
     public static void main(String[] args){
         Scanner entrada= new Scanner(System.in);
         System.out.print("Aluno: ");
         String aluno = entrada.next();
         System.out.print("Nota1: ");
         float n1 = entrada.nextFloat();
         System.out.print("Nota2: ");
         float n2 = entrada.nextFloat();
         System.out.print("Nota3: ");
         float n3 = entrada.nextFloat();
         System.out.println("Aluno " + aluno);
         System.out.println("Notas: " + n1 + "; " + n2 + "; " + n3);
     entrada.close();
        float media;
        media = (n1 + n2 + n3) / 3;
         System.out.println("A media do(a) " + aluno + ":" + media);
     if (media>=6){
         System.out.println("Parabens, voce esta na media!");
     }
     else{
         System.out.println("Que pena, esta de recuperacao...");
     }
     }
}


