package controle;

import java.awt.*;
import java.text.*;
import javax.swing.*;
import javax.swing.text.MaskFormatter;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import conexao.Conexao;

import javax.swing.table.DefaultTableModel; // Para reconhecimento de Jtable

import java.sql.*;
import javax.swing.border.Border;

public class Main extends JFrame {
    
    Conexao con_cliente;
    
    JLabel codigo, nome, data, telefone,email, pesqu;
    JTextField tcodigo, tnome, temail, tpesquisa;
    JFormattedTextField tel, dat;
    MaskFormatter mTel, mData;
    JButton primeiro, anterior, proximo, ultimo, gravar, alterar, excluir, limpar, bpesquisa, sair;
    
    JTable tblClientes; // Datagrid
    JScrollPane scp_tabela; // Container para a datagrid
    
    
    
    
    public Main() {
        Container tela = getContentPane();
        ImageIcon icone = new ImageIcon("img/perfil.png");
        setIconImage(icone.getImage());
        tela.setLayout(null);
        
        con_cliente = new Conexao(); // Inicialização do objeto
        con_cliente.conecta();
        
        setTitle("Conexão Java com MySQL");
        setResizable(false);
  
        codigo = new JLabel("Código: ");
        nome = new JLabel("Nome: ");
        data = new JLabel("Data: ");
        telefone = new JLabel("Telefone: ");
        email = new JLabel("Email: ");
        pesqu = new JLabel("Pesquisa por nome do Cliente:");
        
        primeiro = new JButton("Primeiro");
        anterior = new JButton("Anterior");
        proximo = new JButton("Próximo");
        ultimo = new JButton("Último");
        limpar = new JButton("Novo Registro");
        gravar = new JButton("Gravar");
        alterar = new JButton("Alterar");
        excluir = new JButton("Excluir");
        bpesquisa = new JButton("Pesquisar");
        sair = new JButton("Sair");
                
        tcodigo = new JTextField(5);
        tnome = new JTextField(20); 
        temail = new JTextField(25); 
        tpesquisa = new JTextField(30);
        
        codigo.setBounds(50,-50,100,200);
        nome.setBounds(50,-20,100,200);
        data.setBounds(50,10,100,200);
        telefone.setBounds(50,40,100,200);
        email.setBounds(50,70,100,200);
        pesqu.setBounds(50, 520, 250, 20);
         
        tcodigo.setBounds(150, 45, 40, 20);
        tnome.setBounds(150, 70, 160, 20);
        temail.setBounds(150, 160, 180, 20);
        tpesquisa.setBounds(225, 520, 250, 20);
        
        primeiro.setBounds(50, 200, 115, 20);
        anterior.setBounds(190, 200, 100, 20);
        proximo.setBounds(310, 200, 100, 20);
        ultimo.setBounds(430, 200, 100, 20);        
        limpar.setBounds(50, 250, 115, 20);
        gravar.setBounds(190, 250, 100, 20);
        alterar.setBounds(310, 250, 100, 20);
        excluir.setBounds(430, 250, 100, 20);
        bpesquisa.setBounds(480, 520, 100, 20);
        sair.setBounds(650, 520, 80, 20);
        
        
        tela.setBackground(new Color(52,53,56));
        
        codigo.setForeground(new Color(55, 122, 235));
        nome.setForeground(new Color(55, 122, 235));
        data.setForeground(new Color(55, 122, 235));
        telefone.setForeground(new Color(55, 122, 235));
        email.setForeground(new Color(55, 122, 235));
        pesqu.setForeground(new Color(55, 122, 235));
        
        primeiro.setForeground(new Color(55, 122, 235));
        primeiro.setBorderPainted(false);
        
        anterior.setForeground(new Color(55, 122, 235));
        anterior.setBorderPainted(false);
        
        proximo.setForeground(new Color(55, 122, 235));
        proximo.setBorderPainted(false);
        
        ultimo.setForeground(new Color(55, 122, 235));
        ultimo.setBorderPainted(false);
        
        limpar.setForeground(new Color(55, 122, 235));
        limpar.setBorderPainted(false);
        
        gravar.setForeground(new Color(55, 122, 235));
        gravar.setBorderPainted(false);
        
        alterar.setForeground(new Color(55, 122, 235));
        alterar.setBorderPainted(false);
        
        excluir.setForeground(new Color(55, 122, 235));
        excluir.setBorderPainted(false);
        
        bpesquisa.setForeground(new Color(55, 122, 235));
        bpesquisa.setBorderPainted(false);
       
        sair.setForeground(new Color(55, 122, 235));
        sair.setBorderPainted(false);
        
        tcodigo.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        tnome.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        temail.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        tpesquisa.setBorder(javax.swing.BorderFactory.createEmptyBorder());
       
            
        // Configuração da JTable
        tblClientes = new javax.swing.JTable();
        scp_tabela = new javax.swing.JScrollPane();
           
     
        tblClientes.setBounds(50,300,700,200);
        scp_tabela.setBounds(50,300,700,155);
        
        // tblClientes.setBackground(new Color(55, 122, 235));
        scp_tabela.setBackground(new Color(52,53,56));
        
        tblClientes.setForeground(new Color(52,53,56));
        scp_tabela.setForeground(new Color(52,53,56));
        try {
            mTel = new MaskFormatter("(##) ####-####");
            mData = new MaskFormatter("##/##/####");
            mTel.setPlaceholderCharacter('_');
            mData.setPlaceholderCharacter('_');
        }   catch(ParseException excp){}
        
        tel = new JFormattedTextField(mTel);
        dat = new JFormattedTextField(mData);
        
        tel.setBounds(150, 100, 90, 20);
        dat.setBounds(150, 130, 70, 20);
        
        tel.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        dat.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        
        
        primeiro.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               try {
                   if(!con_cliente.resultset.isFirst()) {
                        con_cliente.resultset.first();
                        mostrar_Dados();
                   } else {
                       JOptionPane.showMessageDialog(null, "Já é o primeiro registro!", "Mesangem do Programa", JOptionPane.INFORMATION_MESSAGE);
                   }
                 
               } catch(SQLException erro) {
                   JOptionPane.showMessageDialog(null, "Não foi possível acessar o primeiro registrao: "+ erro, "Mesangem do Programa", JOptionPane.INFORMATION_MESSAGE);
               }
            }
        });
        
        anterior.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               try {
                   if(!con_cliente.resultset.isFirst()) {
                         con_cliente.resultset.previous();
                         mostrar_Dados();
                   } else {
                       JOptionPane.showMessageDialog(null, "Já é o primeiro registro!", "Mesangem do Programa", JOptionPane.INFORMATION_MESSAGE);
                   }
                  
               } catch(SQLException erro) {
                   JOptionPane.showMessageDialog(null, "Não foi possível acessar o primeiro registrao: "+ erro, "Mesangem do Programa", JOptionPane.INFORMATION_MESSAGE);
               }
            }
        });
        
        proximo.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               try {
                    if(!con_cliente.resultset.isLast()) {
                        con_cliente.resultset.next();
                        mostrar_Dados();
                   } else {
                       JOptionPane.showMessageDialog(null, "Já é o ultimo registro!", "Mesangem do Programa", JOptionPane.INFORMATION_MESSAGE);
                   }
               } catch(SQLException erro) {
                   JOptionPane.showMessageDialog(null, "Não foi possível acessar o primeiro registrao: "+ erro, "Mesangem do Programa", JOptionPane.INFORMATION_MESSAGE);
               } 
            }
        });
        
        ultimo.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               try {
                   if(!con_cliente.resultset.isLast()) {
                        con_cliente.resultset.last();
                        mostrar_Dados();
                   } else {
                       JOptionPane.showMessageDialog(null, "Já é o ultimo registro!", "Mesangem do Programa", JOptionPane.INFORMATION_MESSAGE);
                   }
               } catch(SQLException erro) {
                   JOptionPane.showMessageDialog(null, "Não foi possível acessar o primeiro registrao: "+ erro, "Mesangem do Programa", JOptionPane.INFORMATION_MESSAGE);
               }
            }
        });
        
        limpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpatwoActionPerformed(evt);
            }
        });
        
        gravar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gravatwoActionPerformed(evt);
            }
        });
        
        alterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alterartwoActionPerformed(evt);
            }
        });
        
        excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                excluirtwoActionPerformed(evt);
            }
        });
        
        bpesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
               bpesquisatwoActionPerformed(evt);
            }
        });
      
     
        sair.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        int res = JOptionPane.showConfirmDialog(rootPane,"Deseja sair do programa?! ", "Confirmar Para Sair Do Programa!!", JOptionPane.YES_NO_OPTION);
                        if (res == 0) {
                            System.exit(0);
                        }
                        
                    }
                }
            );  
        
        
       
        
        tela.add(tel);
        tela.add(dat);
        
        tela.add(codigo);
        tela.add(nome);
        tela.add(email);
        tela.add(telefone);
        tela.add(data);
        tela.add(pesqu);
        
        tela.add(tcodigo);
        tela.add(tnome);
        tela.add(temail);
        tela.add(tpesquisa);
        
        tela.add(primeiro);
        tela.add(anterior);
        tela.add(proximo);
        tela.add(ultimo);
        tela.add(gravar);
        tela.add(alterar);
        tela.add(excluir);
        tela.add(bpesquisa);
        tela.add(sair);
        tela.add(limpar);
         
        tela.add(tblClientes);
        tela.add(scp_tabela);
        
        scp_tabela.setBackground(new Color(122,122,122));
        
        tblClientes.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(52,53,56)));
        
        tblClientes.setFont(new java.awt.Font("Poppins", 1, 12));
        tblClientes.setForeground(new Color(122,122,122));
        
        tblClientes.setModel(new javax.swing.table.DefaultTableModel (
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null} 
            },
           new String [] {"Código", "Nome", "Data De Nascimento", "Telefone", "Email"})
        {
            boolean[] canEdit = new boolean[] {false, false, false, false, false};
           
        public boolean isCellEditable(int rowIndex, int columnIndex) {
            return canEdit [columnIndex];}
        });
        
        scp_tabela.setViewportView(tblClientes);
        tblClientes.setAutoCreateRowSorter(true); // Ativa a classificação ordenada da tabela
        
        // Fim da config da jtable
       
        
        setSize(800,600);
        setVisible(true);
        setLocationRelativeTo(null);
        
        con_cliente.executaSQL("select * from tbclientes order by cod");
        preencherTabela();
        posicionarRegistro();
       
    }
    
    private void limpatwoActionPerformed(java.awt.event.ActionEvent evt) {
         tcodigo.setText("");
         tcodigo.requestFocus();
         tnome.setText("");
         temail.setText("");
         tel.setText("");
         dat.setText("");
    }
    
     private void gravatwoActionPerformed(java.awt.event.ActionEvent evt) {
           String nome = tnome.getText();
                String email = temail.getText();
                String telefone = tel.getText();
                String data_nasc = dat.getText();

            try {
                String insert_sql = "insert into tbclientes (nome, telefone, email, dt_nasc) values ('" + nome + "','" + telefone + "','" + email + "','" + data_nasc + "')";
                con_cliente.statement.executeUpdate(insert_sql);
                JOptionPane.showMessageDialog(null, "Gravação realizada com sucesso!!", "Mensagem do Programa", JOptionPane.INFORMATION_MESSAGE);

                con_cliente.executaSQL("select * from tbclientes order by cod");
                preencherTabela();
            } catch (SQLException errosql) {
                JOptionPane.showMessageDialog(null, "\n Erro na gravação :\n " + errosql, "Mensagem do Programa", JOptionPane.INFORMATION_MESSAGE);
            }
    }
     
     private void alterartwoActionPerformed(java.awt.event.ActionEvent evt) {
           String nome = tnome.getText();
                String email = temail.getText();
                String telefone = tel.getText();
                String data_nasc = dat.getText();
                String sql;
                String msg = "";
                
                try {
                    if(tcodigo.getText().equals("")) {
                        sql = "insert into tbclientes (nome, telefone, email, dt_nasc) values ('" + nome + "','" + telefone + "','" + email + "','" + data_nasc + "')";
                        msg = "Gravação de um novo registro";
                    } else {
                        sql="update tbclientes set nome='" + nome + "',telefone='" + telefone + "', email='" + email + "', dt_nasc='" + data_nasc + "' where cod = " + tcodigo.getText();
                        msg = "Alteração de um novo registro";
                    }
                    
                    con_cliente.statement.executeUpdate(sql);
                    JOptionPane.showMessageDialog(null, "Gravação realizada com sucesso!!", "Mensagem do Programa", JOptionPane.INFORMATION_MESSAGE );
                    
                    con_cliente.executaSQL("select * from tbclientes order by cod");
                    preencherTabela();
                } catch(SQLException errosql) {
                     JOptionPane.showMessageDialog(null, "\n Erro na gravação :\n " + errosql, "Mensagem do Programa", JOptionPane.INFORMATION_MESSAGE);
                }
    }
     
     private void excluirtwoActionPerformed(java.awt.event.ActionEvent evt) {
              String sql = "";
              try {
                  int resposta = JOptionPane.showConfirmDialog(rootPane,"Deseja excluir o registro: ", "Confirmar Exclusão", JOptionPane.YES_NO_CANCEL_OPTION, 3);
                  if (resposta == 0) {
                      sql = "delete from tbclientes where cod = " + tcodigo.getText();
                      int excluir = con_cliente.statement.executeUpdate(sql);
                      if (excluir == 1) {
                          JOptionPane.showMessageDialog(null, "Exclusão realizada com sucesso!!", "Mensagem do Programa", JOptionPane.INFORMATION_MESSAGE );
                          con_cliente.executaSQL("select * from tbclientes order by cod");
                          con_cliente.resultset.first();
                          preencherTabela();
                          posicionarRegistro();
                      } else {
                          JOptionPane.showMessageDialog(null, "Operação cancelada pelo usuário!!", "Mensagem Do Programa", JOptionPane.INFORMATION_MESSAGE);
                      }
                  }
              } catch(SQLException excecao) {
                  JOptionPane.showMessageDialog(null, "Erro na exclusão: ", "Mensagem Do Programa", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
     
      private void bpesquisatwoActionPerformed(java.awt.event.ActionEvent evt) {
              try {
                    String pesquisa = "select * from tbclientes where nome like '" + tpesquisa.getText() + "%'";
                    con_cliente.executaSQL(pesquisa);
                    
                    if(con_cliente.resultset.first()) {
                        preencherTabela();
                    } else {
                        JOptionPane.showMessageDialog(null, "Não existe dados com este paramêtro!!", "Mensagem Do Programa", JOptionPane.INFORMATION_MESSAGE);
                    }
                } catch (SQLException errosql) {
                    JOptionPane.showMessageDialog(null, "Os dados digitados não foram localizados!! :\n " + errosql, "Mensagem Do Programa", JOptionPane.INFORMATION_MESSAGE);
                }
    }
     
    public void preencherTabela() {
      tblClientes.getColumnModel().getColumn(0).setPreferredWidth(30);
      tblClientes.getColumnModel().getColumn(1).setPreferredWidth(150);
      tblClientes.getColumnModel().getColumn(2).setPreferredWidth(100);
      tblClientes.getColumnModel().getColumn(3).setPreferredWidth(90);
      tblClientes.getColumnModel().getColumn(4).setPreferredWidth(150);
      
      DefaultTableModel modelo = (DefaultTableModel) tblClientes.getModel();
      modelo.setNumRows(0);
     
      try {
          con_cliente.resultset.beforeFirst();
          while(con_cliente.resultset.next()) {
              modelo.addRow(new Object[] {
                  con_cliente.resultset.getString("cod"), con_cliente.resultset.getString("nome"), con_cliente.resultset.getString("dt_nasc"), con_cliente.resultset.getString("telefone"), con_cliente.resultset.getString("email")
              });
          }
      } catch(SQLException erro) {
          JOptionPane.showMessageDialog(null, "\n Erro ao listar dados da tabela!!!" + erro, "Mesangem do Programa", JOptionPane.INFORMATION_MESSAGE);
      }
    }
    

    public void posicionarRegistro() {
        try {
            con_cliente.resultset.first(); // Posiciona no 1° registro da tabela
            mostrar_Dados(); // Chama o método que irá buscar o dado da tabela
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Não foi possivel posicionar no primeiro registro:" + erro, "Mesangem do Programa", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
    public void mostrar_Dados() {
      try {
            tcodigo.setText(con_cliente.resultset.getString("cod")); // Associar a caixa de texto ao campo cod
            tnome.setText(con_cliente.resultset.getString("nome")); // Associar a caixa de texto ao campo nome
            tel.setText(con_cliente.resultset.getString("telefone"));
            dat.setText(con_cliente.resultset.getString("dt_nasc"));
            temail.setText(con_cliente.resultset.getString("email"));
          
      } catch(SQLException erro) {
          JOptionPane.showMessageDialog(null, "\n Não localizou dados: " + erro, "Mesangem do Programa", JOptionPane.INFORMATION_MESSAGE);
      }
    }
    
    public static void main(String[] args) {
        Main app = new Main();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
