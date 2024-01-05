import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Atividade3PT5 extends JFrame{
    JLabel rotulo1, rotulo2;
    JButton ocultar,exbir;
    public Atividade3PT5() {
        super("AtividadePT3 8.5: Exemplo de ocultar e exibir componente");
        Container tela = getContentPane();
        setLayout(null);
        rotulo1 = new JLabel("Rótulo 1"); 
        rotulo2 = new JLabel("Rótulo 2");
        
        ocultar = new JButton("Ocultar "); 
        exbir = new JButton("Exibir ");
        
        rotulo1.setBounds(50,20,100,20);
        rotulo2.setBounds(50,60,100,20);
        ocultar.setBounds(100,100,80,20); 
        exbir.setBounds(250,100,80,20);
        
        ocultar.addActionListener(
            new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    rotulo1.setVisible(false);
                    rotulo2.setVisible(false);
                }
            }
        );
        
        exbir.addActionListener(
            new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    rotulo1.setVisible(true);
                    rotulo2.setVisible(true);
                }
            }
        );
        tela.add(rotulo1);
        tela.add(rotulo2);
        tela.add(ocultar);
        tela.add(exbir);
        setSize(400, 250);
        setVisible(true);
        setLocationRelativeTo(null);
    }
    public static void main(String args[]){
        Atividade3PT5 app = new Atividade3PT5();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
