import javax.swing.JOptionPane;
public class Cadastro {
    private String nome;
    private String datana;
    private String endereco;  
    private String telefone; 
    private String email;  
    private String rg;
    private String cpf;
    
    public Cadastro() {
        this("","","","","","","");
    }
    
    public Cadastro(String nome, String datana, String endereco, String telefone, String email, String rg, String cpf) {
            this.nome = nome;
            this.datana = datana;
            this.endereco = endereco;
            this.telefone = telefone;
            this.email = email;
            this.rg = rg;
            this.cpf = cpf;
    }
     
    public String getNome() {
        return nome;
    }
   
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getDatana() {
        return datana;
    }
   
    public void setDatana(String datana) {
        this.datana = datana;
    }
    
    public String getEndereco() {
        return endereco;
    }
   
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    
    public String getTelefone() {
        return telefone;
    }
   
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
    public String getEmail() {
        return email;
    }
   
    public void setEmail(String email) {
        this.email = email;
    }
    
    public String getRG() {
        return rg;
    }
   
    public void setRG(String rg) {
        this.rg = rg;
    }
    
    public String getCPF() {
        return cpf;
    }
   
    public void setCPF(String cpf) {
        this.cpf = cpf;
    }
    
    public void inserirDados() {
       setNome(JOptionPane.showInputDialog("Digite seu nome: "));
       setDatana(JOptionPane.showInputDialog("Digite sua data de nascimento: "));
       setEndereco(JOptionPane.showInputDialog("Digite seu endereco: "));
       setTelefone(JOptionPane.showInputDialog("Digite seu telefone: "));
       setEmail(JOptionPane.showInputDialog("Digite seu email: "));
       setRG(JOptionPane.showInputDialog("Digite seu RG"));
       setCPF(JOptionPane.showInputDialog("Digite seu CPF"));
    }
    
    public void apresentar() {
       JOptionPane.showMessageDialog(null, "Olá, seu nome é " + this.getNome());
       JOptionPane.showMessageDialog(null, "Olá, sua data de nascimento é " + this.getDatana());
       JOptionPane.showMessageDialog(null, "Olá, seu endereço  é " + this.getEndereco());
       JOptionPane.showMessageDialog(null, "Olá, seu telefone é " + this.getTelefone());
       JOptionPane.showMessageDialog(null, "Olá, seu email  é " + this.getEmail());
       JOptionPane.showMessageDialog(null, "Olá, seu RG é " + this.getRG());
       JOptionPane.showMessageDialog(null, "Olá, seu CPF é " + this.getCPF());
    }
}
