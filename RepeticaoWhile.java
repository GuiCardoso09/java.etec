/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package repeticaowhile;

/**
 *
 * @author Aluno CA
 */
public class RepeticaoWhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        //while
        /*   int cont= 1, r=0, num=5;
        System.out.println("Tabuada do n°: " +num);
        while (cont<=10)
        {r=num*cont;
            System.out.println(num+"x"+cont+"="+r);
             cont = cont + 1;}
        System.exit(0);
        }*/
        
      //do while
      /*  int cont= 1, r=0, num=5;
        System.out.println("Tabuada do n°: "+num);       
          do {
         r = num * cont;
        System.out.println(num+"x"+cont+"="+r);
        cont=cont+1;}
     while(cont<=9);
    System.exit(0);
    }*/
      //for 
      int i,cont=1, r=0, num=5;
        System.out.println("Tabuada do n°: "+num);
        for(i=0;i<=10;i++){
            r=num*cont;
            System.out.println(num+ "x"+ cont+"="+r);
            System.exit(0);
        }
}    

}
