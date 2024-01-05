package controle;


import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

import conexao.Conexao;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class Login extends JFrame {
       Conexao con_cliente;
       
       JPasswordField tsen;
       JLabel rusu, rsen, rtit, img;
       JMenuBar barra1;
       JMenu desen;
       JMenuItem desen1;
       JTextField tusu;
       JButton blogar, bnovo;
       
       InicialDesen frmdesen;
       
       int contador = 1;
       

       private int tentativas = 0; // Variables para armazenar as tentativas
       
    public Login() {
        con_cliente = new Conexao(); // Inicialização do objeto
        con_cliente.conecta(contador);
        
        setTitle("Pets");
        Container tela = getContentPane();
        ImageIcon icone = new ImageIcon("img/logo-2.png");
        ImageIcon imagem = new ImageIcon("img/logo-2.png");
        setIconImage(icone.getImage());
        
        barra1 = new JMenuBar();
        desen = new JMenu("Desenvolvedor");
        barra1.add(desen);
        desen1 = new JMenuItem("Desenvolvedor. ");
        
        tela.setLayout(null);
        
        tela.setBackground(new Color(52,53,56));
        
        JLabel imagemLabel = new JLabel(); 
        rtit = new JLabel("Pets");
        rusu = new JLabel("Usuário:  ");
        rsen = new JLabel("Senha:  ");
        
       
        blogar = new JButton("Logar");
        bnovo = new JButton("Cadastrar Usuário");
        tusu = new JTextField(15);
        tsen = new JPasswordField(15);
        
        
       
        rtit.setBounds(500, 100, 250, 20); 
        rusu.setBounds(390, 140, 80, 20);
        rsen.setBounds(390, 181, 80, 20);
        tusu.setBounds(450, 140, 150, 23);
        tsen.setBounds(450, 180, 150, 23);
        blogar.setBounds(480, 220, 80, 25);
        bnovo.setBounds(451, 300, 138, 20);
        
        rtit.setFont(new Font("Arial", Font.BOLD, 22));
      
       
        rtit.setForeground(new Color(72, 191, 178));
        rusu.setForeground(new Color(72, 191, 178));
        rsen.setForeground(new Color(72, 191, 178));
        blogar.setForeground(new Color(72, 191, 178));
        bnovo.setForeground(new Color(72, 191, 178));
        bnovo.setBackground(new Color(52,53,56));
        blogar.setBackground(new Color(52, 53, 56));
        blogar.setBorder(javax.swing.BorderFactory.createLineBorder(new Color(72,191,178),2));
        bnovo.setBorderPainted(false);
        
        imagemLabel.setIcon(imagem);
        imagemLabel.setBounds(50, 50, 300, 300);
        
//        tusu.setBorder(javax.swing.BorderFactory.createEmptyBorder());;
//        tsen.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        
        tela.add(rusu);
        tela.add(tusu);
        tela.add(rsen);
        tela.add(tsen);
        tela.add(rtit);
        tela.add(blogar);
        tela.add(bnovo);
        tela.add(imagemLabel);
        tela.add(barra1);
        setJMenuBar(barra1);
        desen.add(desen1);
        
        
        blogar.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            String usuario = tusu.getText();
            String senha = tsen.getText();
            try {
                if (usuario.isEmpty() || senha.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Você não inseriu os dados.", "Mensagem do Programa", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    String pesquisa = "select * from cadastro where Usuario like '" + tusu.getText() + "' && Senha = " + tsen.getText() + "";
                    con_cliente.executaSQL(pesquisa);         
                    if (con_cliente.resultset.first()) {
                        Animais mostra = new Animais();
                        mostra.setVisible(true);
                        dispose();
                    }       
                    else {
                        tentativas++; // Incrementa o contador de tentativas incorretas
                        if (tentativas < 3) {
                            JOptionPane.showMessageDialog(null, "Usuário não cadastrado!!!! Você tem mais " + (3 - tentativas) + " tentativa(s).", "Mensagem do Programa", JOptionPane.INFORMATION_MESSAGE);
                        } else {
                            JOptionPane.showMessageDialog(null, "Você excedeu o limite de tentativas. O programa será encerrado.", "Mensagem do Programa", JOptionPane.INFORMATION_MESSAGE);
                            con_cliente.desconecta();
                            System.exit(0);
                        }
                    }
                }
            } catch (SQLException errosql) {
                JOptionPane.showMessageDialog(null, "Os dados digitados não foram localizados!! : " + errosql, "Mensagem do Programa", JOptionPane.INFORMATION_MESSAGE);
            }
        }
        });
        

        
        bnovo.addActionListener(new ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            String usuario = tusu.getText();
            String senha = tsen.getText();
            con_cliente.executaSQL("select * from cadastro order by Senha");
            try {
                con_cliente.executaSQL("select * from cadastro order by Senha");
                if (usuario.isEmpty() || senha.isEmpty()) {
                      JOptionPane.showMessageDialog(null, "Você não inseriu os dados.", "Mensagem do Programa", JOptionPane.INFORMATION_MESSAGE);                    
                    } else {
                      String insert_sql = "insert into cadastro (Senha, Usuario) values ('" + senha + "','" + usuario + "')";
                      con_cliente.statement.executeUpdate(insert_sql);
                      JOptionPane.showMessageDialog(null, "Gravação realizada com sucesso!!", "Mensagem do Programa", JOptionPane.INFORMATION_MESSAGE );
                    }               
                    con_cliente.executaSQL("select * from cadastro order by Senha");
                } catch(SQLException errosql) {
                     JOptionPane.showMessageDialog(null, "\n Erro na gravação :\n " + errosql, "Mensagem do Programa", JOptionPane.INFORMATION_MESSAGE);
                } 
            }
        });
        
        desen1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frmdesen = new InicialDesen(null, "Desenvolvedor", true);
                frmdesen.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                frmdesen.setVisible(true);
            }
        }
        );

        
        setSize(700,450);
        setVisible(true);
        setResizable(false);
        setLocationRelativeTo(null);
    }
    
    
    private class InicialDesen extends JDialog {
        
        JButton bvoltar, voltar;
        JLabel rotulo1, rotulo2, rotulo3;
        ImageIcon imagens[];

    public InicialDesen(Frame owner, String title, boolean modal) {
            super(owner, title, modal);
            Container tela3 = getContentPane();
            tela3.setLayout(null);
            
            tela3.setBackground(new Color(52,53,56));       
            
            String icones[]={"img/Voltar.png"};
            imagens = new ImageIcon[1];
            for(int i = 0;i < 1;i++){
            imagens[i] = new ImageIcon(icones[i]);}
            bvoltar = new JButton(imagens[0]);
            voltar = new JButton("Voltar");
                 
            //bvoltar.setBackground(new Color(52, 53, 56));

            rotulo1 = new JLabel("Desenvolvido Por:");
            rotulo2 = new JLabel("Henrique Porto");
            rotulo3 = new JLabel("Turma: 2°DS A Manhã");  
            rotulo1.setBounds(30, 40, 350, 20);
            rotulo2.setBounds(140,40, 300, 20);
            rotulo3.setBounds(230, 40, 350, 20);
            rotulo1.setForeground(new Color(72, 191, 178));
            rotulo2.setForeground(new Color(72, 191, 178));
            rotulo3.setForeground(new Color(72, 191, 178));
            voltar.setForeground(new Color(72, 191, 178));
            voltar.setBackground(new Color(52,53,56));
            voltar.setBorder(javax.swing.BorderFactory.createLineBorder(new Color(72,191,178),2));    
            voltar.setBounds(280, 120, 100, 20);
            
            voltar.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    frmdesen.setVisible(false);
                    frmdesen.dispose();
                }
            }
            );
               
            tela3.add(voltar);
            tela3.add(rotulo1);
            tela3.add(rotulo2);
            tela3.add(rotulo3);
            tela3.add(bvoltar);
            setSize(400, 200);
            setResizable(false);
            setLocationRelativeTo(null);
        } 
    }  
   
 
}

 



