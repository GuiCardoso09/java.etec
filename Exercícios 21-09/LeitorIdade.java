package leitoridade;

import javax.swing.JOptionPane;

public class LeitorIdade {

 
    public static void main(String[] args) {
        String id; int cont=1,i=0,maiorId=Integer.MIN_VALUE,menorId=Integer.MAX_VALUE;
        int soma=0;
        System.out.println("Idade do aluno: ");
        do{
            id = JOptionPane.showInputDialog(null, "Digite a idade do aluno: ");
             int idade = Integer.parseInt(id);
             cont=cont+1;
             
             soma += idade;
             
             if(idade<menorId){
                 menorId=idade;
             }else if (idade>maiorId){
                 maiorId=idade;
             }
            
             
        }while(cont<=20);
         double media = soma/20.0;
        
        System.out.println("Maior idade: "+maiorId);
        System.out.println("menor idade: "+menorId);
        System.out.println("Média das idades: " + media);
    }
    
}
