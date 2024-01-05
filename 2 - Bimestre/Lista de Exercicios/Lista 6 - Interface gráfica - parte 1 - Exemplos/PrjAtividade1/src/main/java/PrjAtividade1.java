import javax.swing.*;
import java.awt.*;
public class PrjAtividade1 extends JFrame {
    public PrjAtividade1() {
        
        super("Atividade 1");
        Container tela = getContentPane();
        tela.setBackground(new Color(121253)); // Também funcionar em forma de decimal  Exemplo: #000 = black 
        ImageIcon icone = new ImageIcon("img/iconAnime.jpg");
        setIconImage(icone.getImage());
        setSize(700, 450);
        setResizable(false);
        setLocationRelativeTo(null);
        setVisible(true);
        
    }
    public static void main(String[] args) {
        PrjAtividade1 exec = new PrjAtividade1();
        exec.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

   
}

