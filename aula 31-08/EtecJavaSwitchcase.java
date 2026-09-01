/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package etecjava.switchcase;

import javax.swing.JOptionPane;

/**
 *
 * @author Aluno CA
 */
public class EtecJavaSwitchcase 
{   public static void main(String[] args) 
{    String st = "Informe um número entre 1 e 2: ";
        st = JOptionPane.showInputDialog(null, st);
        //Conversão de String para int
        int mes = Integer.parseInt(st);
        switch(mes)
        {    case 1:
                st = "PAGAMENTO EM DIA";
                break;
        case 2:
                st = "PAGAMENTO ATRASADO";
                break;
        default:
                st = "DIA INVÁLIDO";
        JOptionPane.showMessageDialog(null,st,"ERRO",0);
        System.exit(0);
        }
        st = "VOCÊ ESCOLHEU O MÊS DE "+st;
        JOptionPane.showMessageDialog(null,st,"MENSAGEM",1);
        System.exit(0);
}
}

        

    
