package multipicacao;
import javax.swing.JOptionPane;
public class Multipicacao {

    public static void main(String[] args) {
        int[] A = new int[5];
        int[] B = new int[5];
        int[] C = new int[5];

        for (int i = 0; i < 5; i++) {
            A[i] = Integer.parseInt(
                JOptionPane.showInputDialog(
                    "Vetor A - Digite o " + (i + 1) + "º número:")
            );
        }
        for (int i = 0; i < 5; i++) {
            B[i] = Integer.parseInt(
                JOptionPane.showInputDialog(
                    "Vetor B - Digite o " + (i + 1) + "º número:"
                )
            );
        }
        for (int i = 0; i < 5; i++) {
            C[i] = A[i] * B[i];
        }
        String resultado = "Vetor C:\n";
        
        for (int i = 0; i < 5; i++) {
            resultado = resultado + C[i] + " ";
        }
        JOptionPane.showMessageDialog(null,resultado);
    }
}
    
