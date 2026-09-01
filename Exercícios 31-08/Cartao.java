package cartao;
import javax.swing.JOptionPane;
import java.util.Scanner;
public class Cartao {
    public static void main(String[] args) {
      String entrada = JOptionPane.showInputDialog("Qual o saldo do cartão?:"
      );
      float saldo = Float.parseFloat(entrada);
      if (saldo>0){
          JOptionPane.showMessageDialog(null, "O saldo é POSITIVO.");
      }
    }
    
}
