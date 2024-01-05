package controle;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

import conexao.Conexao;
import java.sql.*;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class Login extends JFrame {
       Conexao con_cliente;
       
       JPasswordField tsen;
       JLabel rusu, rsen, rtit;
       JTextField tusu;
       JButton blogar;
       
       private int tentativas = 0; // Variables para armazenar as tentativas
       
    public Login() {
        
        con_cliente = new Conexao(); // Inicialização do objeto
        con_cliente.conecta();
        
        setTitle(" ¨*** Login de Acesso ***");
        Container tela = getContentPane();
        ImageIcon icone = new ImageIcon("img/perfil.png");
        setIconImage(icone.getImage());
        tela.setLayout(null);
        
        tela.setBackground(new Color(52,53,56));
        
        rtit = new JLabel("Acesso ao Sistema ");
        rusu = new JLabel("Usuário:  ");
        rsen = new JLabel("Senha:  ");
       
        blogar = new JButton("Logar");
        tusu = new JTextField();
        tsen = new JPasswordField();
        
        rtit.setBounds(147, 40, 250, 20); 
        rusu.setBounds(100, 100, 80, 20);
        rsen.setBounds(100, 140, 80, 20);
        tusu.setBounds(180, 100, 150, 20);
        tsen.setBounds(180, 140, 150, 20); 
        blogar.setBounds(200, 200, 80, 25);
        
        rtit.setFont(new Font("Poppins", Font.BOLD, 22));
      
        
        rtit.setForeground(new Color(55, 122, 235));
        rusu.setForeground(new Color(55, 122, 235));
        rsen.setForeground(new Color(55, 122, 235));
        blogar.setForeground(new Color(55, 122, 235));
        
        tusu.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        tsen.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        
        tela.add(rusu);
        tela.add(tusu);
        tela.add(rsen);
        tela.add(tsen);
        tela.add(rtit);
        tela.add(blogar);
        
        blogar.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                String usuario = tusu.getText();
                String senha = tusu.getText();
  
                try{
                    if(usuario.isEmpty() || senha.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "\n Você não inseriu os dados.","Mensagem do Programa", JOptionPane.INFORMATION_MESSAGE);
                    }else{
                String pesquisa = "select * from tblusuario where usuario like '" + tusu.getText() + "' && senha = " + tsen.getText() + "";
                con_cliente.executaSQL(pesquisa);
                
                if (con_cliente.resultset.first()){
                    Main mostra = new Main();
                    mostra.setVisible(true);
                    dispose();
                } else {
                        tentativas++; // Incrementa o contador de tentativas incorretas
                        if (tentativas < 3) {
                            JOptionPane.showMessageDialog(null, "\n Usuário não cadastrado!!!! Você tem mais " + (3 - tentativas) + " tentativa(s).", "Mensagem do Programa", JOptionPane.INFORMATION_MESSAGE);
                        } else {
                            JOptionPane.showMessageDialog(null, "\n Você excedeu o limite de tentativas. O programa será encerrado.", "Mensagem do Programa", JOptionPane.INFORMATION_MESSAGE);
                            con_cliente.desconecta();
                            System.exit(0);
                        }
                    } 
            } 
            }
                catch(SQLException errosql){
            JOptionPane.showMessageDialog(null,"\n Os dados digitados não foram localizados!! :\n "+errosql, "Mensagem do Programa", JOptionPane.INFORMATION_MESSAGE );
        }
        }});
       
        
        setSize(500,400);
        setVisible(true);
        setLocationRelativeTo(null);
    }
    
    public static void main(String[] args) {
        Login app = new Login();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}


