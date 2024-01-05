import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Atividade3PT3 extends JFrame {
    JLabel rotulo1, rotulo2, exibir;
    JTextField texto1, texto2;
    JButton somar;
        
        public Atividade3PT3() {
            super("AtividadePT3 8.3: Exemplo de Soma");
            Container tela = getContentPane();
            setLayout(null);
            
            rotulo1 = new JLabel("1° Número: ");
            rotulo2 = new JLabel("2° Número: ");
            
            texto1 = new JTextField(5);
            texto2 = new JTextField(5);
            
            exibir = new JLabel("");
            somar = new JButton("Somar");
            
            rotulo1.setBounds(50, 20, 100, 20);
            rotulo2.setBounds(50, 60, 200, 20);
            
            texto1.setBounds(120, 20, 200, 20);
            texto2.setBounds(120, 60, 200, 20);
            
            exibir.setBounds(50, 120, 200, 20);
            exibir.setForeground(Color.red);
            somar.setBounds(150, 100, 80, 20);
            
            somar.addActionListener(
                new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    int numero1, numero2, soma;
                    soma = 0;
                    numero1 = Integer.parseInt(texto1.getText());
                    numero2 = Integer.parseInt(texto2.getText());
                    soma = numero1 + numero2;
                    exibir.setVisible(true);
                  
                    exibir.setText("A soma é: " +soma);
                    }
                }
            );
            exibir.setVisible(false);
            
            tela.add(rotulo1);
            tela.add(rotulo2);
            tela.add(texto1);
            tela.add(texto2);
            tela.add(exibir);
            tela.add(somar);
            
            setSize(400, 250);
            setVisible(true);
            setLocationRelativeTo(null);
    }
    public static void main(String args[]){
        Atividade3PT3 app = new Atividade3PT3();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
