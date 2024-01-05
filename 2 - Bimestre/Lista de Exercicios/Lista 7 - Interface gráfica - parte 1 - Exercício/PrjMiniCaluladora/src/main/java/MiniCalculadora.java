import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class MiniCalculadora extends JFrame {
    JButton soma, subt, mult, divi, limpa, habili, desa, oculta, exibir, sair;
    JLabel txt1, txt2, txtres, txtres2 ,aluno;
    JTextField num1, num2;

    
    public  MiniCalculadora() {
        super("Mini Calculadora");
        Container tela = getContentPane();
        
        ImageIcon icone = new ImageIcon("img/Em.png");
        setIconImage(icone.getImage());
        
        setLayout(null);
        
            txt1 = new JLabel("1° Número: ");
            txt2 = new JLabel("2° Número: ");
            txtres = new JLabel("Resultado:: ");
            txtres2 = new JLabel("");
            aluno = new JLabel("Desenvolvido por: Henrique Porto de Sousa - 2°DS Manhã ");    
            
            txt1.setBounds(50, 20, 100, 20);
            txt2.setBounds(50, 60, 100, 20);
            
            txtres.setBounds(50, 103, 100, 20);
            txtres2.setBounds(120, 103, 200, 20);
            
            aluno.setBounds(105, 300, 500, 20);
            txtres.setForeground(Color.red);
            
            num1 = new JTextField(10);
            num2 = new JTextField(10); 
            
            
            num1.setBounds(120, 22, 100, 20);
            num2.setBounds(120, 62, 100, 20);
            
            soma = new JButton("+");
            subt = new JButton("-");
            mult = new JButton("*");
            divi = new JButton("/");
            limpa = new JButton("Limpar");
            
            num1.setForeground(new Color(7, 106, 128));
            num2.setForeground(new Color(7, 106, 128));
            aluno.setForeground(new Color(7, 106, 128));
            
            soma.setBounds(360, 22, 50, 20);
            subt.setBounds(360, 42, 50, 20);
            mult.setBounds(360, 62, 50, 20);
            divi.setBounds(360, 82, 50, 20);
            limpa.setBounds(360, 102, 80, 20);
            
            habili = new JButton("Habilitar");
            desa = new JButton("Desbabilitar");
            oculta = new JButton("Ocultar");
            exibir = new JButton("Exibir");     
            
            habili.setBounds(50, 200, 100, 20);
            desa.setBounds(150, 200, 130, 20);
            oculta.setBounds(280, 200, 80, 20);
            exibir.setBounds(360, 200, 80, 20);
            
            sair = new JButton("Sair");
            
            habili.setMnemonic(KeyEvent.VK_H); // ALT + H
            desa.setMnemonic(KeyEvent.VK_D); // ALT + D
                                     
            sair.setBounds(360, 240, 80, 20);
            
            soma.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        double n1, n2, soma2;
                        soma2 = 0;
                        n1 = Double.parseDouble(num1.getText());
                        n2 = Double.parseDouble(num2.getText());
                        soma2 = n1 + n2; 
                        txtres2.setText("A soma é: " + soma2);
                    }
                } 
            );
            
            subt.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        double n1, n2, soma2;
                        soma2 = 0;
                        n1 = Double.parseDouble(num1.getText());
                        n2 = Double.parseDouble(num2.getText());
                        soma2 = n1 - n2; 
                        txtres2.setText("A subtração é: " + soma2);
                    }
                } 
            );
            
            mult.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        double n1, n2, soma2;
                        soma2 = 0;
                        n1 = Double.parseDouble(num1.getText());
                        n2 = Double.parseDouble(num2.getText());
                        soma2 = n1 * n2; 
                        txtres2.setText("A multiplicação é: " + soma2);
                    }
                } 
            );
            
            divi.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        double n1, n2, soma2;
                        soma2 = 0;
                        n1 = Double.parseDouble(num1.getText());
                        n2 = Double.parseDouble(num2.getText());
                        soma2 = n1 / n2; 
                        txtres2.setText("A divisão é: " + soma2);
                    }
                } 
            );
            
           
            limpa.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        num1.setText(null);
                        num2.setText(null);
                        num1.requestFocus();
                    }
                }
            );
            
            habili.addActionListener(
                new ActionListener(){
                    public void actionPerformed(ActionEvent e){
                        txtres.setEnabled(true);
                        txtres2.setEnabled(true);
                    }
                }
            );
            
            desa.addActionListener(
                new ActionListener(){
                    public void actionPerformed(ActionEvent e){
                        txtres.setEnabled(false);
                        txtres2.setEnabled(false);
                }
                }
            );
            
            oculta.addActionListener(
                new ActionListener(){
                    public void actionPerformed(ActionEvent e){
                        txtres.setVisible(false);
                        txtres2.setVisible(false);
                    }
                }
            );
            
            exibir.addActionListener(
                new ActionListener(){
                    public void actionPerformed(ActionEvent e){
                        txtres.setVisible(true);
                        txtres2.setVisible(true);
                }
                }
            );
                
            sair.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        System.exit(0);
                    }
                }
            );  
            
            tela.add(txt1);
            tela.add(txt2);
            tela.add(txtres);
            tela.add(txtres2);
            tela.add(aluno);
            
            tela.add(num1);
            tela.add(num2);
            
            tela.add(soma);
            tela.add(subt);
            tela.add(mult);
            tela.add(divi);
            tela.add(limpa);
            
            tela.add(habili);
            tela.add(desa);
            tela.add(oculta);
            tela.add(exibir);
            
            tela.add(sair);
            
            setResizable(false);
            setSize(560, 400);
            setVisible(true);
            setLocationRelativeTo(null);
        
    }
    public static void main(String args[]){
            MiniCalculadora app = new MiniCalculadora();
            app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
