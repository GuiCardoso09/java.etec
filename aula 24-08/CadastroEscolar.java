/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cadastroescolar;

/**
 *
 * @author Aluno CA
 */
public class CadastroEscolar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
    CadAluno aluno = new CadAluno();
    aluno.cadastrarAluno("Guilherme Cardoso", "24/08/2026", 263187, "guilherme.santos229@aluno.cps.sp.gov.br", "93309-6424");
    aluno.exibirDados(); 
    aluno.excluiDados(); 
    aluno.exibirDados();
    System.exit(0);
    }
    
}
