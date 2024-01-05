import javax.swing.JOptionPane;

public class exemplo2 {
    public static void main(String[] args) {
        int t;
        String p;
        digite();
        p = JOptionPane.showInputDialog("digite uma palavra qualquer");
        t=tamanho(p); //método com retorno por causa da atribuição da variável 't'
        JOptionPane.showMessageDialog(null, p+" possui "+t+" caracteres");
    }
    static void digite() { //método sem retorno por causa do 'void'
        JOptionPane.showMessageDialog(null, "Digite uma palavra:");
    }
    
    static int tamanho (String x){ //retorna um valor inteiro à classe main
        return x.length(); //retorna o valor de 'x' para a variável 't'
    }
    
}
