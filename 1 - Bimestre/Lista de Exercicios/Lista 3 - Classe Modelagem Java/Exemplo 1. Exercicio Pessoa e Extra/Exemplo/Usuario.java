public class Usuario {
    // Atributos
    private String nome;
    private String email;  
    private String login;  
    private String senha;
    
    // Construtires
    // Inicializa os atributos vazios
    
    public Usuario() {
       this("","","","");
       // Se caso for alguem número é para colocar inicia com 0.
    }
    
    // Inicializa os atributos com valores passados por parametro
    public Usuario(String nome, String email, String login, String senha) {
        this.nome = nome;
        this.email = email;
        this.login = login;
        this.senha = senha;
    }
    // Getters e Setters
    public String getNome() {
        return nome;
    }
    // Implemetação dos demais getters e setters
    public void setNome(String nome) {
        this.nome = nome;
    }
    
     // Métodos especificos da classe
    public void provarExistencia() {
        System.out.println("Oi, meu nome é " + this.getNome() + ", e eu existo!");
    }
}
