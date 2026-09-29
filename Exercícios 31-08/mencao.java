package mencao;

import javax.swing.JOptionPane;

public class mencao{
    public static void main(String[] args) {
        
        String entrada = JOptionPane.showInputDialog(
                "Digite a menção do aluno:\n"
                + "MB - Muito bom\n"
                + "B - Bom\n"
                + "R - Regular\n"
                + "I - Irregular"
        );
        
        String mencao = entrada.toUpperCase();
        
        switch (mencao) {
            case "MB":
                mencao = "Muito bom";
                break;
                
            case "B":
                mencao = "Bom";
                break;
                
            case "R":
                mencao = "Regular";
                break;
                
            case "I":
                mencao = "Irregular";
                break;
                
            default:
                JOptionPane.showMessageDialog(null,
                        "Menção INV�?LIDA",
                        "ERRO", 0);
                System.exit(0);
        }
        
        JOptionPane.showMessageDialog(null,
                "A menção do aluno é: " + mencao,
                "Menção", 1);
        
        System.exit(0);
    }
}

