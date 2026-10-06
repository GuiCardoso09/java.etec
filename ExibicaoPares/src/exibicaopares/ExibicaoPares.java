package exibicaopares;
import javax.swing.JOptionPane;
public class ExibicaoPares {

    public static void main(String[] args) {
       int[] valor = new int [10];
       String pares = "";
   for (int i = 0; i < 10; i++) {

            valor[i] = Integer.parseInt(
                JOptionPane.showInputDialog("Digite um valor:")
            );
        }

        for (int i = 0; i < 10; i++) {
            if (valor[i] % 2 == 0) {
                pares = pares + valor[i] + " ";
            }
        }
        JOptionPane.showMessageDialog(null, "Valores pares: " + pares);
    }
}
