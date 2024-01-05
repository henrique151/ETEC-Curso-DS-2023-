import javax.swing.JOptionPane;
public class Prinicipal {
    public static void main(String[] args) {
        
        double valorVendido = 0;
        
        Vendedor comissa = new Vendedor();
       
        
        valorVendido = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do produto: "));
        double res = comissa.CacluloComissao(valorVendido);
       
        JOptionPane.showMessageDialog(null, "Olá " + comissa.getNome() + ". O seu novo salario é " + res );
              
    }
}
