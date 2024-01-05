import javax.swing.JOptionPane;
public class Exercicio5 {
    public static void main (String [] args ){
        int Num1 = 0;
        int Num2 = 0;
        
        Num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número:"));
        Num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número:"));
        
        if(Num1 == Num2) {
            System.out.print("Os números são iguais.");  
        } else {
            if(Num1 > Num2) {
                System.out.print("Os números são diferente" + " E a ordem é " + Num1 + " " + Num2);
            } else {
                System.out.print("Os números são diferente" + " E a ordem é " + Num2 + " " + Num1);
            }
          
        }
    }
}
