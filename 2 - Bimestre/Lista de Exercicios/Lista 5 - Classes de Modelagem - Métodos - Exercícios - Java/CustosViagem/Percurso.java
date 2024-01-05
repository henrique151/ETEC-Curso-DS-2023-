import javax.swing.JOptionPane;

public class Percurso {
    private double kmPercorrida;
    private double valorCombustivel;
    private double valorPedagio;

    public Percurso() {
          this(0,0,0);
    }
    
    public Percurso(double kmPercorrida, double valorCombustivel, double valorPedagio ) {
        this.kmPercorrida = kmPercorrida;
        this.valorCombustivel = valorCombustivel;
        this.valorPedagio = valorPedagio;
    }

    public void setKmPercorrida(double kmPercorrida) {
        this.kmPercorrida = kmPercorrida;
    }

    public void setValorCombustivel(double valorCombustivel) {
        this.valorCombustivel = valorCombustivel;
    }

    public void setValorPedagio(double valorPedagio) {
        this.valorPedagio = valorPedagio;
    }
    
    public double getKmPercorrida() {
        return kmPercorrida;
    }

    public double getValorCombustivel() {
        return valorCombustivel;
    }

    public double getValorPedagio() {
        return valorPedagio;
    }
    
    public void cadastarPercurso() {
        this.setKmPercorrida(Double.parseDouble(JOptionPane.showInputDialog("Digite quantos quilometros (km) você Percorreu: ")));
        this.setValorCombustivel(Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do Combustivel: ")));
        this.setValorPedagio(Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do Pedagio: ")));
    }
    
    public void listarPercurso() {
       JOptionPane.showMessageDialog(null, "Você percorreu " + this.getKmPercorrida() + " km");
       JOptionPane.showMessageDialog(null, "O valor do Combustivel é R$ " + this.getValorCombustivel());
       JOptionPane.showMessageDialog(null, "O valor do Pedagio é R$ " + this.getValorPedagio());
    }
}    
