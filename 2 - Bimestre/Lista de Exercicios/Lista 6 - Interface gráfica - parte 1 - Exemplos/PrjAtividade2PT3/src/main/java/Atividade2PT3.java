import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Atividade2PT3 extends JFrame
{
    JLabel rotulo;
    JTextArea texto;
    JScrollPane painelrolagem;
    JPanel painel;
    
    public Atividade2PT3(){
        super("Exemplo com JTextField");
        Container tela = getContentPane();
        
        tela.setLayout(null);
        
        rotulo = new JLabel ("Endereço");
        rotulo.setBounds(50,20,100,20);
        
        texto = new JTextArea(10,20);
        
        texto.setLineWrap(true);
        texto.setWrapStyleWord(true);
           
        texto.setForeground(new Color(255, 255, 255));
        texto.setBackground(new Color(10, 225, 80));
        
        texto.setFont(new Font("Comic Sans MS",Font.BOLD+Font.ITALIC,14));
      
        painelrolagem = new JScrollPane(texto);
        painelrolagem.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        painelrolagem.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
                 
        painel = new JPanel();
        painel.add(painelrolagem);
        painel.setBounds(40,40,250,250);
        
        tela.add(rotulo);
        tela.add(painel);
        
        setSize(400, 320);
        setVisible(true);
        setLocationRelativeTo(null);
        
    }
    public static void main(String[] args) {
       Atividade2PT3 area = new Atividade2PT3();
       area.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    }

 
        
        

