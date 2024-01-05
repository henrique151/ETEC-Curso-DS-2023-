import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Atividade3PT1 extends JFrame {
    JButton botaosair;
    public Atividade3PT1() {
        super("AtividadePT3 8.1: Exemplo com JButton");
        Container tela = getContentPane();
        setLayout(null);
        
        botaosair = new JButton("Sair");
        botaosair.setBounds(100,40,100,20);
        
        botaosair.setBackground(new Color(125, 125, 125));
        botaosair.setForeground(new Color(255, 66, 66));
        
        botaosair.addActionListener(
            new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    System.exit(0);
                }
            }
        );
        
        tela.add(botaosair);
        setSize(300,150);
        setVisible(true);
        setLocationRelativeTo(null);
    }        
    
    public static void main(String args[]){
            Atividade3PT1 app = new Atividade3PT1();
            app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
