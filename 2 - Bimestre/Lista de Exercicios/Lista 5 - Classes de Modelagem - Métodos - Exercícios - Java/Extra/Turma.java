import javax.swing.JOptionPane;
public class Turma {
    private int ano;
    private int semestre;
    private String diaSemana;
    private String horarios;
    
    public Turma() {
        this(0, 0, "", "");
    }
    
     public Turma(int ano, int semestre, String diaSemana, String horarios ) {
        this.ano = ano;
        this.semestre = semestre;  
        this.diaSemana = diaSemana;   
        this.horarios = horarios;   
    }

    public int getAno() {
        return ano;
    }

    public int getSemestre() {
        return semestre;
    }

    public String getDiaSemana() {
        return diaSemana;
    }

    public String getHorarios() {
        return horarios;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    public void setDiaSemana(String diaSemana) {
        this.diaSemana = diaSemana;
    }

    public void setHorarios(String horarios) {
        this.horarios = horarios;
    }
     
    public void CadastrarTurma() {
        this.setAno(Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o ano atual: (Ex: O ano que ele(a) vai entra na escola. (2023)")));
        this.setSemestre(Integer.parseInt(JOptionPane.showInputDialog(null, "Digite quantos semestres vão durar? (Ex: 6 semestres (2 Semestres = 1 ano) ")));
        this.setDiaSemana(JOptionPane.showInputDialog(null, "Digite os nomes dos dias da semana: (Ex: Segundo, Terça, Quinta e Sexta)"));
        this.setHorarios(JOptionPane.showInputDialog(null, "Digite os horários: Ex(as 7:00 até 13:00)"));
    }
    
    public void ApresentaTurma() {
        JOptionPane.showMessageDialog(null, "O ano em que o aluno(a) vai começar a estudar é" + this.getAno());
        JOptionPane.showMessageDialog(null, "A quantidade de semestres é " + this.getSemestre());
        JOptionPane.showMessageDialog(null, "Os dias da semana vão ser " + this.getDiaSemana());
        JOptionPane.showMessageDialog(null, "O horário de entrada e de saída é " + this.getHorarios());
    }
    
    
    
}
