package exibicaonome;

import javax.swing.JOptionPane;

public class ExibicaoNome {
   
    public static void main(String[] args) {
        String[] nome = new String[4];
      nome[0] = JOptionPane.showInputDialog("Digite seu primeiro nome: ");
      nome[1] = JOptionPane.showInputDialog("Digite seu segundo nome: ");
      nome[2] = JOptionPane.showInputDialog("Digite seu terceiro nome: ");
      
      JOptionPane.showMessageDialog(null, "As iniciais são: "+
              nome[0].substring(0,1)+
              nome[1].substring(0, 1)+
              nome[2].substring(0, 1));
      
      
    }
    
}
