import javax.swing.JOptionPane;
public class Exercicio2 {
    public static void main ( String []args) {
        int NumeroDecrescente = 0;
        int z;
          
           NumeroDecrescente = Integer.parseInt(JOptionPane.showInputDialog("Digite um número:"));
           
           for(z=-1; z < NumeroDecrescente ; z++) {
               System.out.println("A ordem Descrescente do número é " + NumeroDecrescente);
               NumeroDecrescente = NumeroDecrescente - 1;
               z--;
           }        
    }
}
