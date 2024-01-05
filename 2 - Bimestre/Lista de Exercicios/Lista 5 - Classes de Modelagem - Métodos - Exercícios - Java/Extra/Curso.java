import javax.swing.JOptionPane;
public class Curso {
    private int codigo;
    private String cursos;
    int mas = 0;
    public Curso() {
        this(0, "");
    }
    
    public Curso(int codigo, String cursos) {
        this.codigo = codigo;
        this.cursos = cursos;
    }

    public String getCursos() {
        return cursos;
    }

    public void setCursos(String cursos) {
        this.cursos = cursos;
    }


    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
    
    public void ApresntaCurso1() {

        mas = Integer.parseInt(JOptionPane.showInputDialog(null, "Agora escolha um Curso:" + "\n "
                    + "\n 1 - DS Desenvolvimento de sistemas."
                    + "\n 2 - LOG Logistica."
                    + "\n 3 - ADM Administração."
                    + "\n 4 - COB Contabilidade."));   
        if(mas == 1) {
            JOptionPane.showMessageDialog(null, "O Curso escolhido foi: Desenvolvimento de sistemas.");
            this.setCursos("O Curso escolhido foi: Desenvolvimento de sistemas.");
            this.setCodigo(Integer.parseInt(JOptionPane.showInputDialog(null, " Digite o código do curso: Ex(123)")));
        } else if(mas == 2) {
            JOptionPane.showMessageDialog(null, "O Curso escolhido foi: Logistica.");
            this.setCursos("Bem o curso escolhido foi: Logistica.");
            this.setCodigo(Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o código do curso: Ex(123)")));
        } else if (mas == 3) {
             JOptionPane.showMessageDialog(null, "O Curso escolhido foi: Administração.");
            this.setCursos("Bem o curso escolhido foi:Administração.");
            this.setCodigo(Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o código do curso: Ex(123)")));
        } else if (mas == 4) {
            JOptionPane.showMessageDialog(null, "O Curso escolhido foi: Contabilidade.");
            this.setCursos("Bem o curso escolhido foi: Contabilidade.");
            this.setCodigo(Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o código do curso: Ex(R123)")));
        } else {
            JOptionPane.showMessageDialog(null, "Número invalído");
        }
       
        
    }
    
       public void Visualizar() {
      
           JOptionPane.showMessageDialog(null, "" + this.getCursos());
           JOptionPane.showMessageDialog(null, "O código escolhido foi: " + this.getCodigo());
       }



 
   

}
        


