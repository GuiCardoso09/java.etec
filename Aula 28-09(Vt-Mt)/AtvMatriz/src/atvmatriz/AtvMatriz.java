package atvmatriz;
import javax.swing.JOptionPane;

public class AtvMatriz {

    public static void main(String[] args) {
              int n;
        int f = 1;
        String st = "Digite um número: ";

        st = JOptionPane.showInputDialog(null, st);
        n = Integer.parseInt(st);

        for (int i = 1; i <= n; i++) {
            f = f * i;
        }

        st = "O fatorial é: " + f;
        JOptionPane.showMessageDialog(null, st);
    }
}


