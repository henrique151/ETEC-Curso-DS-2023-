import javax.swing.JOptionPane;
public class Exercicio2 {
    public static void main(String[] args) {
        double val1,val2;
        
        val1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o Primeiro número: "));
        val2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o Segundo número: "));
        
        diferenca(val1, val2);
  
    }
    static void diferenca(double v1, double v2) {
       if(v1 > v2) {
            System.out.print("O primeiro número digitado que foi " + v1 + " é maior que o segundo. " + v2);
       } else if (v2 > v1) {
            System.out.print("O segundo número digitado que foi " + v2 + " é maior que o segundo. " + v1);
       } else {
           System.out.print("Os dois valores digitados são iguais.");
       }
   }
}
