import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Atividade3PT4 extends JFrame {
    JLabel rotulo1, rotulo2;
    JTextField texto1, texto2;
    JButton limpar;
    
    public Atividade3PT4() {
        super("AtividadePT3 8.4: Exemplo Limpar");
        Container tela = getContentPane();
        setLayout(null);
        
        rotulo1 = new JLabel("1° Número: ");
        rotulo2 = new JLabel("2° Número: ");
          
        texto1 = new JTextField(5);
        texto2 = new JTextField(5);
        
        limpar = new JButton("Limpar");
        
        rotulo1.setBounds(50, 20, 100, 20);
        rotulo2.setBounds(50, 60, 100, 20);
        
        texto1.setBounds(120, 20, 200, 20);
        texto2.setBounds(120, 60, 200, 20);
        
        limpar.setBounds(150, 100, 80, 20);
        
        limpar.addActionListener(
            new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    texto1.setText(null);
                    texto2.setText(null);
                    texto1.requestFocus();
                }
            }
        );
        
        tela.add(rotulo1);
        tela.add(rotulo2);
        tela.add(texto1);
        tela.add(texto2);
        tela.add(limpar);
        setSize(400, 250);
        setVisible(true);
        setLocationRelativeTo(null);
    }
    
    public static void main(String args[]){
            Atividade3PT4 app = new Atividade3PT4();
            app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
