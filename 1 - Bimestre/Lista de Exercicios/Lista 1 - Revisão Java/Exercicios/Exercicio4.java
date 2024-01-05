import javax.swing.JOptionPane;
public class Exercicio4 {
    public static void main (String [] args) {
        int numA, troca, numB = 0;
        
        
           numA = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número:"));
           numB = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número:"));
           System.out.println("A ordem original é " + numA + " " + numB);
          
           troca = numA;
           numB = troca;  
           numA = numB;
           
            System.out.println("A ordem invesa é " + numA + " " + numB);
          
             
    }
}
