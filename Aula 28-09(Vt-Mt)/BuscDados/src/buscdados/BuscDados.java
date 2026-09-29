package buscdados;
import javax.swing.JOptionPane;
public class BuscDados {

    public static void main(String[] args) {
       int v[] = new int[2];
       int n;
       String st = "Digite o número para a busca: ";
       st = JOptionPane.showInputDialog(null,st);
       n =Integer.parseInt(st);
       for(int i=0;i<2;i++){
           if(v[i]==n){
               st="Valor encontrado";
               JOptionPane.showMessageDialog(null, st);
           }
           {
               st="Valor não encontrado";
               JOptionPane.showMessageDialog(null, st);
           }
           System.exit(0);
       }
    }
    
}
