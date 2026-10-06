package altdados;
import javax.swing.JOptionPane;

public class AltDados {

    public static void main(String[] args) {
    int v[] = new int[2];
    int n;
    String st="Digite o número para alterar: ";
    st=JOptionPane.showInputDialog(null,st);
    n=Integer.parseInt(st);
    for(int i=0;i<2;i++){
        if(v[i]==n){
           st="Digite um novo número: ";
           JOptionPane.showInputDialog(null, st);
           v[i]=Integer.parseInt(st);
        }
    else
        {st="Valor não encontrado";
        JOptionPane.showInputDialog(null, st);
        }
        System.exit(0);}
    }
}

