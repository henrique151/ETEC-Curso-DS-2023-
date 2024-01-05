import javax.swing.JOptionPane;
public class Exercicio1 {
    public static void main(String[] args) {
    String nome;
    double nofi,nofi2, total;
    nome = JOptionPane.showInputDialog("Digite o nome do aluno (a).");
   
    nofi=Lernota();
    nofi2=Lernota();
    
    total=calcularMedia(nofi, nofi2);
    
    if(total >= 7) {
         System.out.print("Olá " + nome + " você foi aprovado com uma média de " + total);
    } else {
         System.out.print("Olá " + nome + " você foi reporvado com uma média de " + total);
    }
     
    }
    
    static double Lernota() {
        double n1 = 0;
        n1 = Double.parseDouble(JOptionPane.showInputDialog("Digite um nota: "));
        return n1;
    }  
    static double calcularMedia(double nofia1, double nofia2) {
        return (nofia2 + nofia1) / 2 ;
    }
}

