package totalvetor;

import javax.swing.JOptionPane;
public class TotalVetor {

    public static void main(String[] args) {
        int[]valor = new int[5];
        int total = 0;
        
        for(int i=0;i<5;i++){
            valor[i]=Integer.parseInt(JOptionPane.showInputDialog("Digite um valor: "));
            total = total + valor[i];
        }
        JOptionPane.showMessageDialog(null, "O valor total é: " + total);
    }
    
}
