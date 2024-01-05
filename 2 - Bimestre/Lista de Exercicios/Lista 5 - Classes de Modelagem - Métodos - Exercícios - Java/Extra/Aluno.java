import javax.swing.JOptionPane; 
     
public class Aluno {
    private String nome;
    private String datanasc;
    private String rg;
    private String telefone;
    private String endereco;
    private String matricula;
    private String situacao;
    
    public Aluno() {
        this("", "", "", "" , "", "", "");
    }
    
     public Aluno(String matricula, String situacao, String nome, String datanasc, String rg, String telefone, String endereco ) {
        this.nome = nome;
        this.datanasc = datanasc;   
        this.rg = rg;
        this.telefone = telefone;  
        this.endereco = endereco;
        this.matricula = matricula;
        this.situacao = situacao;  
    }

    public String getMatricula() {
        return matricula;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDatanasc() {
        return datanasc;
    }

    public void setDatanasc(String datanasc) {
        this.datanasc = datanasc;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    
    public void CadastrarAluno() {
        this.setNome(JOptionPane.showInputDialog(null, "Digite o nome do aluno: (Ex: Kevin, Odin, Paul...)"));
        this.setDatanasc(JOptionPane.showInputDialog(null, "Digite o ano de nascimento do aluno: (Ex: 30/04/2007) "));
        this.setRg(JOptionPane.showInputDialog(null, "Digite o RG do aluno: (Ex: 521.241.521-50)"));
        this.setTelefone(JOptionPane.showInputDialog(null, "Digite o telefone do aluno: (Ex: 99124-2412)"));
        this.setEndereco(JOptionPane.showInputDialog(null, "Digite o endereço do aluno: (Ex: Rua Santa da Folha)"));
        this.setMatricula(JOptionPane.showInputDialog(null, "Digite o número que será a matricula do aluno: (Ex: 99129) "));
        this.setSituacao(JOptionPane.showInputDialog(null, "Digite a situação do aluno: (Ex: 1° Manhã, Curso De Contabilidade.) "));
       
    }
    
    public void AprsentaAluno() {
       JOptionPane.showMessageDialog(null, "O nome do aluno(a) é " + this.getNome());
       JOptionPane.showMessageDialog(null, "A data de nascimento do aluno(a) é " + this.getDatanasc());
       JOptionPane.showMessageDialog(null, "O RG do aluno(a) é " + this.getRg());
       JOptionPane.showMessageDialog(null, "O número de telefone do aluno(a) é " + this.getTelefone());
       JOptionPane.showMessageDialog(null, "O endereço do aluno(a) é  " + this.getEndereco());
       JOptionPane.showMessageDialog(null, "O código da matricula do aluno(a) é  " + this.getMatricula());
       JOptionPane.showMessageDialog(null, "A situação do aluno(a) é  " + this.getSituacao());
    }
    
}

