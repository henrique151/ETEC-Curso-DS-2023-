import javax.swing.JOptionPane;
public class Salario {
    private double salario;
    private double aumento;
    private double res;

    public Salario() {
        this(0, 0, 0);
    }
    public Salario(double salario, double aumento, double res) {
        this.salario = salario;
        this.aumento = aumento;
        this.res = res;
    }

    public void setAumento(double aumento) {
        this.aumento = aumento;
    }

    public double getAumento() {
        return aumento;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getRes() {
        return res;
    }

    public void setRes(double res) {
        this.res = res;
    }
     
    public double Conta(double sal, double au) {  
        this.setSalario(sal);
        this.setAumento(au);
        double mais = this.getAumento() / 100;
        double aumeto = this.getSalario() * mais;
        this.setRes(aumeto + this.salario);
        return this.getRes();
  
    }
    
    
    
    
}
