import javax.swing.JOptionPane;
public class Principal {
    public static void main(String[] args) {
        
        Salario dinh = new Salario();
        
        
        double money = Double.parseDouble(JOptionPane.showInputDialog("Digite o seu salario: "));
        double aume = Double.parseDouble(JOptionPane.showInputDialog("Digite o seu aumento em porcentagem: "));
        JOptionPane.showMessageDialog(null, "O seu salário atual é: " + money);
        double res = dinh.Conta(money, aume);
        JOptionPane.showMessageDialog(null, "O salário com o aumento deu: " + res);
        
    }
}
