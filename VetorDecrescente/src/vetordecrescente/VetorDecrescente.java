package vetordecrescente;
import javax.swing.JOptionPane;
public class VetorDecrescente {

    public static void main(String[] args) {
        int[] vetA = new int[10];
        int[] vetB = new int[10];
        int aux;

        for (int i = 0; i < 10; i++) {
            vetA[i] = Integer.parseInt(
                JOptionPane.showInputDialog(
                    "Digite o " + (i + 1) + "º valor:"));
        }

        for (int i = 0; i < 10; i++) {
            vetB[i] = vetA[i];
        }

        for (int i = 0; i < 9; i++) {

            for (int j = i + 1; j < 10; j++) {

                if (vetB[i] > vetB[j]) {

                    aux = vetB[i];
                    vetB[i] = vetB[j];
                    vetB[j] = aux;
                }
            }
        }
        String resultado = "Vetor em ordem crescente:\n";
        for (int i = 0; i < 10; i++) {
            resultado = resultado + vetB[i] + " ";
        }
        JOptionPane.showMessageDialog(
            null,
            resultado
        );
    }
    
}
