import javax.swing.*;
import java.awt.*;
public class AtividadePT1 extends JFrame {
    JLabel rotulo1, rotulo2, rotulo3, rotulo4;
    JLabel imagem;
    JTextField texto1, texto2, texto3, texto4;
    public AtividadePT1() {
        super("Atividade Parte 1");
        Container tela = getContentPane();
        tela.setBackground(new Color(01010101));
        ImageIcon icone = new ImageIcon("src/img/iconAnime.jpg");
        imagem = new JLabel(icone);
        
        setLayout(null);
        
            rotulo1 = new JLabel("Nome");
            rotulo2 = new JLabel("Idade");
            rotulo3 = new JLabel("Telefone");
            rotulo4 = new JLabel("Celular");
            
            texto1 = new JTextField(50); 
            texto2 = new JTextField(3);
            texto3 = new JTextField(10); 
            texto4 = new JTextField(10);
            
            rotulo1.setBounds(50,20,80,20);
            rotulo2.setBounds(50,60,80,20);
            rotulo3.setBounds(50,100,80,20);
            rotulo4.setBounds(50,140,80,20);
            
            texto1.setBounds(160,20,200,20);
            texto2.setBounds(160,60,20,20);
            texto3.setBounds(160,100,80,20);
            texto4.setBounds(160,140,80,20);
              
            imagem.setBounds(500, 20, 250, 250);
            
            rotulo1.setForeground(new Color(125, 206, 251));
            rotulo2.setForeground(new Color(60, 181, 242));
            rotulo3.setForeground(new Color(0, 156, 233));
            rotulo4.setForeground(new Color(0, 133, 238));
            
            rotulo1.setFont(new Font("Arial", Font.BOLD, 14));
            rotulo2.setFont(new Font("Comic Sans MS", Font.BOLD, 16));
            rotulo3.setFont(new Font("Courier New", Font.BOLD, 17));
            rotulo4.setFont(new Font("Times New Roman", Font.BOLD, 20));
            
            tela.add(rotulo1);
            tela.add(rotulo2);
            tela.add(rotulo3);
            tela.add(rotulo4);
            
            tela.add(texto1);
            tela.add(texto2);
            tela.add(texto3);
            tela.add(texto4);  
            
            tela.add(imagem);
            
            setSize(800,500);
            setVisible(true);
            setLocationRelativeTo(null);
    }
    
    public static void main(String[] args) {
        AtividadePT1 exec = new AtividadePT1();
        exec.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

   
}