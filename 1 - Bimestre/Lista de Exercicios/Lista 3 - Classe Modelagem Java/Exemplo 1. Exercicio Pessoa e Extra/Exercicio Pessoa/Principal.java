
import javax.swing.JOptionPane;


public class Principal {
    public static void main(String[] args) {
        
        Pessoa pessoa1 = new Pessoa();
        
        int valido;
        
        valido = Integer.parseInt(JOptionPane.showInputDialog("Olá, Bem-vindo. \n\n Digite 1 para Inserir seu Dados. \n Digite 2 para Apresentar seus dados."));
   
            if(valido == 1) { 
                pessoa1.inserirDadosPessoa();
                pessoa1.apresentarPessoa();
            }
            else if (valido == 2 ){
                pessoa1.apresentarPessoa();
            } else 
                JOptionPane.showMessageDialog(null, "Número invalído.");
                          
    }
   
}
