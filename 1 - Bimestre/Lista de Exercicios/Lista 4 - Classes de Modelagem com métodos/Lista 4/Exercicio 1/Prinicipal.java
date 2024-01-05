import javax.swing.JOptionPane;
public class Prinicipal {
    public static void main(String[] args) {
        Calculadora calu = new Calculadora();
        double a = 0, b = 0, res = 0;
        int but;
         do {
             but  = Integer.parseInt(JOptionPane.showInputDialog("Escolha umas dastas opções: \n1 - Somar  \n2 - Subtrair  \n3 -  Multipilicação \n4 -  Divisão \n0 - Sair"));
            switch(but) {
                case 1:
                    calu.Somar();
                    break;
                case 2:
                    a = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro número: "));
                    b = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo número: "));
                    calu.Subtrir(a, b);
                    break;
                case 3:
                    res = calu.Multipicar();
                    JOptionPane.showMessageDialog(null, "O resultado é " + res);
                    break;
                case 4:
                    a = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro número: "));
                    b = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo número: "));
                    res = calu.Divisao(a, b);
                    JOptionPane.showMessageDialog(null, "O resultado é " + res);
                    break;
                case 0:
                   JOptionPane.showMessageDialog(null, "Finalizando Porgrama!");
                    break;
                    default:
               JOptionPane.showMessageDialog(null, "Opção Invalida");
                   
        }    
        } while(but != 0);
    }
}

