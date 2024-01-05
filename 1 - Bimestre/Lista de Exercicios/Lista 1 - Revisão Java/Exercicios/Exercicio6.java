import javax.swing.JOptionPane;
public class Exercicio6 {
    public static void main (String [] args) {
        String Name;
        double note1, note2, note3, note4 = 0;
        double Media = 0;
        
        Name = JOptionPane.showInputDialog("Digite seu nome");
      
        note1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a sua nota do primeiro bimestre: "));
        note2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a sua nota do segundo bimestre: "));
        note3 = Double.parseDouble(JOptionPane.showInputDialog("Digite a sua nota do teceiro bimestre: "));
        note4 = Double.parseDouble(JOptionPane.showInputDialog("Digite a sua nota do quarto bimestre: "));
        
        Media = (note1 + note2 + note3 + note4) / 4;
        
        System.out.println("O Aluno (a) " + Name + " ficou com a medía: " + Media + " em matemática.");
        
    }    
}

