import javax.swing.JOptionPane; 
public class Caixa {    
    // Atributo
    
    private double saldo;
    
    // Construtuores
    // Inicializando o atruiboto zerado
    
    public Caixa() {
        this(0);
    }
    
    // Inicializando o atributo com o parâmetro
    
    public Caixa(double saldo) {
        this.saldo = saldo;
    }
    
    // Getter e setter
    public double getSaldo(){
        return saldo;
    }
    
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    public void entrar() {
        // Lê um valor, converte de String para double e atribui a variável valor
        double valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da entrada: "));
        /* Soma o conteúdo do atributo saldo com o a variável valor e passa o resultado por paramentro para o método setSetSaldo() */
        this.setSaldo(this.saldo + valor);
    }
    public void retirar() {
        // Lê um valor, converte de String para double e atribui a variável valor
        double valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da entrada: "));
         /* Subtrai o conteúdo do atributo saldo com o a variável valor e passa o resultado por paramentro para o método setSetSaldo() */
        this.setSaldo(this.saldo - valor);
    }
}
