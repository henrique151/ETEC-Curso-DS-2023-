import javax.swing.JOptionPane;

public class exemplo1 {

    public static void main(String[] args) {
        int a;
        digite();
        a = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
        dobro(a); /*chamando o método dobro, sem retorno pois não tem variavel atribuida, variável 'a' é um parametro do método */
    }
    
    static void digite() { //método sem retorno por causa do 'void'
        JOptionPane.showMessageDialog(null, "Digite um número::");
    }
    
    static void dobro (int n)  { // 'n' é instancia do 'a'
        int d = n * 2;
        JOptionPane.showMessageDialog(null, "O dobro de " +n+ " é "+ d);
    }
}
