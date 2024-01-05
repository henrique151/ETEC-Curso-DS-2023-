import javax.swing.JOptionPane;
        
public class Custos {
    
    private double totalPercurso;
     
    public Custos() {
        this(0);
    }
    
    public Custos(double totalPercurso) {
        this.totalPercurso = totalPercurso;
    }

    public void setTotalPercurso(double totalPercurso) {
        this.totalPercurso = totalPercurso;
    }

    public double getTotalPercurso() {
        return totalPercurso;
    }
    
    public void calularViagem(Percurso p) {
        setTotalPercurso(p.getKmPercorrida() * p.getValorCombustivel() + p.getValorPedagio());
        JOptionPane.showMessageDialog(null, "O preço final percorido foi é R$" + this.getTotalPercurso());
    }

}

    