package salario;
import javax.swing.JOptionPane;

public class salario {
    public static void main(String[] args) {
        
        String entrada = JOptionPane.showInputDialog(
                "Digite seu salário:"
        );
        
        float salario = Float.parseFloat(entrada);
        float aliq;
        float parc;
        float imp;
        
        if (salario <= 2428.80) {
            aliq = 0;
            parc = 0;
            imp = 0;
        } else if (salario <= 2826.65) {
            aliq = 7.5f;
            parc= 182.16f;
            imp = (salario * aliq / 100) - parc;
        } else if (salario <= 3751.05) {
            aliq = 15;
            parc= 394.16f;
            imp = (salario * aliq / 100) - parc;
        } else if (salario <= 4664.68) {
            aliq = 22.5f;
            parc = 675.49f;
            imp = (salario * aliq/ 100) - parc;
        }{
            aliq= 27.5f;
            parc = 908.73f;
            imp = (salario * aliq / 100) - parc;
        }
        
        JOptionPane.showMessageDialog(null,
                "Salário: R$ " + salario
                + "\nAlíquota: " + aliq+ "%"
                + "\nValor do imposto: R$ " + imp);
        
        System.exit(0);
    }
}
