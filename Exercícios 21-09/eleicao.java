package atividaderepeticao;
import javax.swing.JOptionPane;

public class eleicao{

  
    public static void main(String[] args) {
       int cand1=0,cand2=0,cand3=0,cand4=0,branco=0, nulo=0;
       String vota = "Vote em um candidato à presidência de 1 a 4.\n"
               + "Votos em Branco: 5;\n"+ "Qualquer outro número para nulo\n"
               + "Para encerrar, 0";
       vota = JOptionPane.showInputDialog(null, vota);
       int voto = Integer.parseInt(vota);
       while(voto !=0){
           if(voto == 1){
               cand1++;
           }else if(voto ==2){
               cand2++;
           }else if(voto==3){
               cand3++;
           }else if(voto==4){
               cand4++;
           }else if(voto==5){
               branco++;
           }else{
               nulo++;
           } 
           vota = JOptionPane.showInputDialog(null, vota);
           voto = Integer.parseInt(vota);
       }
        System.out.println("Votação ENCERRADA");

        System.out.println("\n=== RESULTADO DA ELEIÇÃO ===");
        System.out.println("Candidato 1: " + cand1 + " voto(s)");
        System.out.println("Candidato 2: " + cand2 + " voto(s)");
        System.out.println("Candidato 3: " + cand3 + " voto(s)");
        System.out.println("Candidato 4: " + cand4 + " voto(s)");
        System.out.println("Votos em Branco: " + branco);
        System.out.println("Votos Nulos: " + nulo);
    }
    
}
    

