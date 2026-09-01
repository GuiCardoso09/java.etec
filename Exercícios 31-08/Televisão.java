package televisão;
import javax.swing.JOptionPane;

public class Televisão {
    public static void main(String[] args) {
        String cn = "Escolha um dos canais para assistir: \n"
                 +"2 - Cultura\n" + "4 - SBT\n" + "5 - Globo\n"
                + "7-Record\n" + "9-Manchete\n" +"11-Gazeta\n"
                + "13-Band";
        cn = JOptionPane.showInputDialog(null, cn);
        int canal = Integer.parseInt(cn);
        switch(canal){
            case 2: cn = "Cultura";
            break;
            case 4: cn = "SBT"; break;
            case 5: cn = "Globo"; break;
            case 7: cn = "Record"; break;
            case 9: cn = "Manchete"; break;
            case 11: cn = "Gazeta"; break;
            case 13: cn = "Bandeirantes"; break;
            default: cn = "Canal INDISPONÍVEL";
            JOptionPane.showMessageDialog(null,cn,"ERRO",0);
            System.exit(0);
        }
        cn = "Você selecionou " + cn;
        JOptionPane.showMessageDialog(null,cn, "Canal", 1);
        System.exit(0);
        }
    }
    

