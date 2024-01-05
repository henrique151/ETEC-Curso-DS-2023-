import javax.swing.JOptionPane;
public class Exercicio5 {
    public static void main(String[] args) {
        double base, altu, hipo ; 
        /*Double hipoval = 0*/
        base = Double.parseDouble(JOptionPane.showInputDialog("Digite a base do triângulo: "));
        altu = Double.parseDouble(JOptionPane.showInputDialog("Digite a altura do triângulo: "));
      
        
        hipo = hipotenusa(base, altu);
        /* hipoval */ 
        // hipo = Math.sqrt(Math.pow(bas1, 2) + Math.pow(alt1, 2)); 
        System.out.print("O valor da hipotenusa é " + hipo);

    }

    static double hipotenusa(double bas1, double alt1) {
        // double res
       return Math.sqrt(Math.pow(bas1, 2) + Math.pow(alt1, 2));
    }
}
