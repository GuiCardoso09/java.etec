package mediaaluno;
import javax.swing.JOptionPane;
public class MediaAluno {
    
    public static void main(String[] args) {
      double[] notas = new double[4];
        double soma = 0;
        double media;

        for (int i = 0; i < 4; i++) {
            notas[i] = Double.parseDouble(
                JOptionPane.showInputDialog(
                    "Digite a nota do " + (i + 1) + "º bimestre:"
                )
            );
            soma = soma + notas[i];
        }
        media = soma / 4;
        if (media >= 7){
            JOptionPane.showMessageDialog(null,"Média: " + media + "\nAprovado!");
        } else if (media >= 5) {
            JOptionPane.showMessageDialog(null,"Média: " + media + "\nRecuperação!");
        }{
            JOptionPane.showMessageDialog(null,"Média: " + media + "\nReprovado!");
        }
    }}