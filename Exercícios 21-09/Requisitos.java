package requisitos;
import javax.swing.JOptionPane;

public class Requisitos {
    public static void main(String[] args) {
        int cont = 0;
        String continuar = "S";
        for ( ; continuar.equalsIgnoreCase("S"); ) {
            String sexo = JOptionPane.showInputDialog("Digite o sexo (M/F):");
            String idadeTexto = JOptionPane.showInputDialog("Digite a idade:");
            int idade = Integer.parseInt(idadeTexto);
            String estadoCivil = JOptionPane.showInputDialog("Digite o estado civil (S - Solteiro / C - Casado):");


            if (sexo.equalsIgnoreCase("F") && idade < 21 && estadoCivil.equalsIgnoreCase("S")) {
                cont++; 
            }
            continuar = JOptionPane.showInputDialog("Deseja continuar inserindo dados? (S/N)");
        }

        // 4. Mostra o resultado final
        JOptionPane.showMessageDialog(null, "Quantidade de pessoas que atendem aos requisitos: " + cont);
    }
}
