package imc;

import javax.swing.JOptionPane;

public class Imc {
    public static void main(String[] args) {
        
        String entPeso = JOptionPane.showInputDialog(
                "Digite o seu peso em kg:"
        );
        
        String entAltura = JOptionPane.showInputDialog(
                "Digite a sua altura em metros:"
        );
        
        float peso = Float.parseFloat(entPeso);
        float altura = Float.parseFloat(entAltura);
        
        float imc = peso / (altura * altura);
        
        String grau;
        
        if (imc < 18.5) {
            grau = "Abaixo do peso";
        } else if (imc <= 24.9) {
            grau = "Peso ideal";
        } else if (imc <= 29.9) {
            grau = "Sobrepeso";
        } else if (imc <= 34.9) {
            grau = "Obesidade Grau I";
        } else if (imc <= 39.9) {
            grau = "Obesidade Grau II";
        } else {
            grau = "Obesidade Grau III (ou Mórbida)";
        }
        
        JOptionPane.showMessageDialog(null,
                "Seu IMC é: " + imc
                + "\nClassificação: " + grau);
        
        System.exit(0);
    }
}

