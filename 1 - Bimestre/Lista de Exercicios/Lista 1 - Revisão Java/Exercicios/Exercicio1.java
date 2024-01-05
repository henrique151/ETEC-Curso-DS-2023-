import javax.swing.JOptionPane;
public class Exercicio1 {
    public static void main(String[] args) {
        int MaiorNumero, MaiorNumero2 = 0;
     
        MaiorNumero = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número:"));
        MaiorNumero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número"));
        
        if (MaiorNumero >   MaiorNumero2) {
            System.out.println("O primeiro número que foi digitado é maior. O seu valor é " + MaiorNumero);
        } else {
             System.out.println("O segundo número que foi digitado é maior. O seu valor é " + MaiorNumero2);
        }
    }
}
