import javax.swing.JOptionPane;
public class Prinicipal {
    public static void main(String[] args) {
        Percurso curso = new Percurso();
        Custos custos1 = new Custos();
        int but = 0;
        
        do {
            but = Integer.parseInt(JOptionPane.showInputDialog("Escolha umas desta opções: "
                    + "\n\n 1 - Cadastrar Percurso"
                    + "\n 2 - Listar Percurso"
                    + "\n 3 - Calular Viagem"
                    + "\n 0 - Finalizar programa"));
            switch (but) {
                case 1:
                    curso.cadastarPercurso() ;
                    break;
                case 2:
                    curso.listarPercurso();
                    break;
                case 3:
                    custos1.calularViagem(curso);
                    break;  
               case 0 :
                    JOptionPane.showMessageDialog(null, "Finaliza o Programa.");
                    break;  
                default:
                   JOptionPane.showMessageDialog(null, "Número inválida."); 
            }
        } while(but != 0);
        
        
        
        
        
  
    }
}
