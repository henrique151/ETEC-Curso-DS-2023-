import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Atividade3PT6 extends JFrame{
    JLabel rotulo1, rotulo2;
    JButton desabilitar,habilitar;;
    
    public Atividade3PT6() {
        super("AtividadePT3 8.6: Exemplo de Desabilitar e Habilitar componentes");
        Container tela = getContentPane();
        setLayout(null);
        rotulo1 = new JLabel("Rótulo 1"); 
        rotulo2 = new JLabel("Rótulo 2");
        
        desabilitar = new JButton("Desabilitar");
        habilitar = new JButton("Habilitar");
        
        rotulo1.setBounds(50,20,100,20); 
        rotulo2.setBounds(50,60,100,20);

        desabilitar.setBounds(80,100,100,20); 
        habilitar.setBounds(250,100,100,20);
        
        desabilitar.addActionListener(
            new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    rotulo1.setEnabled(false);
                    rotulo2.setEnabled(false);
                }
            }
        );
        
        habilitar.addActionListener(
            new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    rotulo1.setEnabled(true);
                    rotulo2.setEnabled(true);
                }
            }
        );
        
        tela.add(rotulo1);
        tela.add(rotulo2);
        tela.add(desabilitar);
        tela.add(habilitar);
        setSize(400, 250);
        setVisible(true);
        setLocationRelativeTo(null);
    }
 
    public static void main(String args[]){
        Atividade3PT6 app = new  Atividade3PT6();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}