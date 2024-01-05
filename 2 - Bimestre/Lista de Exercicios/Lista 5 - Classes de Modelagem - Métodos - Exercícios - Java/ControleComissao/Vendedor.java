import javax.swing.JOptionPane;

public class Vendedor {
    private String nome;
    private double SalarioBase;

     public Vendedor() {
        this("", 0);    
    }
    
    public Vendedor(String nome, double SalarioBase) {
        this.nome = nome;
        this.SalarioBase = SalarioBase;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void setSalarioBase(double SalarioBase) {
        this.SalarioBase = SalarioBase;
    }

    public String getNome() {
        return nome;
    }
    
    public double getSalarioBase() {
        return SalarioBase;
    }
   

    double CacluloComissao(double valorvem) {
       this.setNome(JOptionPane.showInputDialog("Digite seu nome: "));  
       this.setSalarioBase(Double.parseDouble(JOptionPane.showInputDialog("Digite seu salario base: ")));
       
       double cominovo = valorvem * 0.1; // Como que a comissão e 10% já podemos fazer direito a divisão quer seria 10/100 é igual a 0.1
       double salarionovo = this.getSalarioBase() + cominovo;
       return salarionovo;
    }


   
    
   
          
}
