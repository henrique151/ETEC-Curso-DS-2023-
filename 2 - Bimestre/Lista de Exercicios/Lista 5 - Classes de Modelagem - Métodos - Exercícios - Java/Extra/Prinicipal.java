//Professora, me desculpe por não ter conseguido criar o sistema de cadastro da forma correta de acordo com a questão.
//E é muito mais complexo do que eu pensei. Com o tempo, eu vou tentar novamente e fazer esse cadastro da escola melhor.

import javax.swing.JOptionPane;
public class Prinicipal {
    public static void main(String[] args) {
        
        Aluno Aluno1 = new Aluno();
        Curso Curso1 = new Curso();
        Turma Turma1 = new Turma();
        
        int menu = 0;
        
        JOptionPane.showMessageDialog(null, "Olá, bem-vindo ao sistema dos cadastrar os alunos.");
        do {
            
        menu = Integer.parseInt(JOptionPane.showInputDialog(null, "Primeiramente, escolha uma das opções abaixo: \n 1 - Cadastrar um Aluno \n 2 - Ver o Cadastro do Aluno \n 0 - Finalizar o programa."));
         
        switch (menu) {
                case 1:
                    Aluno1.CadastrarAluno(); 
                    JOptionPane.showMessageDialog(null, "Agora escolha um curso para o aluno");
                    Curso1.ApresntaCurso1();
                    JOptionPane.showMessageDialog(null, "Agora você vai definir o horário do aluno.");
                    Turma1.CadastrarTurma();
                    JOptionPane.showMessageDialog(null, "Cadastro feito com sucesso.");
                    break;
                case 2:
                    Aluno1.AprsentaAluno();                
                    Curso1.Visualizar();
                    Turma1.ApresentaTurma();;
                    break;
                case 0:
                    JOptionPane.showMessageDialog(null, "Finalizando o Programa.");
                    break;                 
                default:
                   JOptionPane.showMessageDialog(null, "Número inválido."); 
            }                   
        }  while(menu != 0);
    }
}


       

