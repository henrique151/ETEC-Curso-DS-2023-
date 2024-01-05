import javax.swing.*;
import java.awt.*;
import java.awt.event.*;



public class Menus extends JFrame {
    JMenuBar barra;
    JToolBar barra2;
    JPopupMenu popmenu;
    JTextArea texto;
  
    JButton soma, divi, sutra, multi;
    JMenu operações, sobre, sair;
    JMenuItem somar, subtra, multip, divisao, profito, exit, profito2, exit2;
    
    Inicial segundajanela;
    InicialSubtra terceirajanela;
    InicialMultip quartajanela;
    InicialDivisao quintajanela;
    InicialFormulario sextajanela;
    
    
    ImageIcon imagens[];

    public Menus() {
        super("Exercício De Menus Parte 2");
        Container tela = getContentPane();
        tela.setLayout(null);
        
        ImageIcon icone = new ImageIcon("imagens/logo.jpg");
        setIconImage(icone.getImage());
      
        String icones[]={"imagens/mais.png","imagens/menos.png","imagens/multi.png","imagens/divi.png"};
        imagens = new ImageIcon[4];
        
        for(int i=0;i<4;i++){
            imagens[i]=new ImageIcon(icones[i]);
        }
        
        
        soma = new JButton(imagens[0]);
        sutra = new JButton(imagens[1]);
        multi = new JButton(imagens[2]);
        divi = new JButton(imagens[3]);
        
        soma.setToolTipText("Soma(ALT+A)");
        sutra.setToolTipText("Subtração(ALT+T)");
        multi.setToolTipText("Multiplicação(ALT+I)");
        divi.setToolTipText("Divisão(ALT+V)");
 
        barra = new JMenuBar();
        
        operações = new JMenu("Operações");
        sobre = new JMenu("Sobre");
        sair = new JMenu("Sair");
        
        somar = new JMenuItem("Somar");
        subtra = new JMenuItem("Subtração");
        multip = new JMenuItem("Multiplicação");
        divisao = new JMenuItem("Divisão");
        profito = new JMenuItem("Desenvolvedor");
        profito2 = new JMenuItem("Desenvolvedor");
        exit = new JMenuItem("Sair");
        exit2 = new JMenuItem("Sair");
        
        barra2 = new JToolBar("Barra de Ferramentas");
        UIManager.put("ToolTip.background",SystemColor.info);
        UIManager.put("ToolTip.foreground",Color.blue);
        barra2.setBounds(1,1,2000,30);
        
        
        texto = new JTextArea(10,20);
        tela.addMouseListener(new MouseAdapter(){
            public void mouseReleased(MouseEvent e){
                if(e.isPopupTrigger())
                popmenu.show(e.getComponent(),e.getX(),e.getY()); 
            }
        }
        );
        
        popmenu = new JPopupMenu();

        soma.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                segundajanela = new Inicial(null, "Soma", true);
                segundajanela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                segundajanela.setVisible(true);
            }
        });
        
        sutra.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                terceirajanela = new InicialSubtra(null, "Subtração", true);
                terceirajanela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                terceirajanela.setVisible(true);
            }
        });
        
        multi.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                quartajanela = new InicialMultip(null, "Multiplicação", true);
                quartajanela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                quartajanela.setVisible(true);
            }
        });
        
        divi.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                quintajanela = new InicialDivisao(null, "Divisão", true);
                quintajanela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                quintajanela.setVisible(true);
            }
        });

        somar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                segundajanela = new Inicial(null, "Soma", true);
                segundajanela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                segundajanela.setVisible(true);
            }
        });

        subtra.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                terceirajanela = new InicialSubtra(null, "Subtração", true);
                terceirajanela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                terceirajanela.setVisible(true);
            }
        });

        multip.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                quartajanela = new InicialMultip(null, "Multiplicação", true);
                quartajanela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                quartajanela.setVisible(true);
            }
        });

        divisao.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                quintajanela = new InicialDivisao(null, "Divisão", true);
                quintajanela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                quintajanela.setVisible(true);
            }
        });
        
        profito.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            sextajanela = new InicialFormulario(null, "Desenvolvedor", true);
            sextajanela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            sextajanela.setVisible(true);
        }
        });
        profito2.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            sextajanela = new InicialFormulario(null, "Desenvolvedor", true);
            sextajanela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            sextajanela.setVisible(true);
        }
        });
        
        exit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int status = JOptionPane.showConfirmDialog(null, "Deseja realmente fechar o programa?", "Mensagem de saída", JOptionPane.YES_NO_OPTION);
                if (status == JOptionPane.YES_OPTION) {
                    System.exit(0);
                }
            }
        });
        
        
        exit2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int status = JOptionPane.showConfirmDialog(null, "Deseja realmente fechar o programa?", "Mensagem de saída", JOptionPane.YES_NO_OPTION);
                if (status == JOptionPane.YES_OPTION) {
                    System.exit(0);
                }
            }
        });
        
        barra.add(operações);
        barra.add(sobre);
        barra.add(sair);
        
        operações.add(somar);
        operações.add(subtra);
        operações.add(multip);
        operações.add(divisao);
        
        sobre.add(profito);
        sair.add(exit);
        
        
        popmenu.add(profito2);
        popmenu.add(exit2);
   
        somar.setMnemonic(KeyEvent.VK_O);
        subtra.setMnemonic(KeyEvent.VK_U);
        multip.setMnemonic(KeyEvent.VK_M);
        divisao.setMnemonic(KeyEvent.VK_D);
        
        soma.setMnemonic(KeyEvent.VK_A);
        subtra.setMnemonic(KeyEvent.VK_T);
        multip.setMnemonic(KeyEvent.VK_I);
        divisao.setMnemonic(KeyEvent.VK_V);
        
        sair.setMnemonic(KeyEvent.VK_S);

            
        barra2.setRollover(true);
        barra2.add(soma);
        barra2.add(sutra);
        barra2.add(multi);
        barra2.add(divi);
        barra2.addSeparator();
        
        tela.add(barra2);
        
        tela.add(texto);
        
        setJMenuBar(barra);
        setSize(500, 550);
        setVisible(true);
        setLocationRelativeTo(null);
    }

    public static void main(String args[]) {
        Menus app = new Menus();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    
    
    private class Inicial extends JDialog {
        JButton voltar, somar2n, limpar;
        JLabel rotulo1, rotulo2, exibir;
        JTextField texto1, texto2;

        public Inicial(Frame owner, String title, boolean modal) {
            super(owner, title, modal);
            Container tela1 = getContentPane();
            tela1.setLayout(null);

            rotulo1 = new JLabel("1º Número: ");
            rotulo2 = new JLabel("2º Número: ");

            texto1 = new JTextField(5);
            texto2 = new JTextField(5);

            exibir = new JLabel("");
            somar2n = new JButton("Somar");
            limpar = new JButton("Limpar");
            voltar = new JButton("Voltar");
            
            

            rotulo1.setBounds(50, 20, 100, 20);
            rotulo2.setBounds(50, 60, 100, 20);
            texto1.setBounds(120, 20, 200, 20);
            texto2.setBounds(120, 60, 200, 20);
            exibir.setBounds(50, 140, 200, 20);
            somar2n.setBounds(150, 100, 80, 20);

            somar2n.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    double numero1, numero2, soma;
                    soma = 0;
                    numero1 = Double.parseDouble(texto1.getText());
                    numero2 = Double.parseDouble(texto2.getText());
                    soma = numero1 + numero2;
                    exibir.setVisible(true);
                    exibir.setText("A soma é: " + soma);
                }
            });
            
            limpar.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                        texto1.setText(null);
                        texto2.setText(null);
                        exibir.setText(null);
                }
            });
            
            voltar.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    segundajanela.setVisible(false);
                    segundajanela.dispose();
                }
            }); 

            exibir.setVisible(false);
            
            rotulo1.setForeground(new Color(4, 159, 196));
            rotulo2.setForeground(new Color(4, 159, 196));
            somar2n.setForeground(new Color(4, 159, 196));
            limpar.setForeground(new Color(4, 159, 196));
            voltar.setForeground(new Color(4, 159, 196));

            tela1.add(rotulo1);
            tela1.add(rotulo2);
            tela1.add(texto1);
            tela1.add(texto2);
            tela1.add(exibir);
            tela1.add(somar2n);
            tela1.add(voltar);
            tela1.add(limpar);
            
            voltar.setBounds(50, 250, 100, 20);
            limpar.setBounds(230, 250, 100, 20);

            setSize(400, 400);
            setLocationRelativeTo(null);
        }
    }
    
   
    

    private class InicialSubtra extends JDialog {
        JButton voltar, subtra2n, limpar;
        JLabel rotulo1, rotulo2, exibir;
        JTextField texto1, texto2;

        public InicialSubtra(Frame owner, String title, boolean modal) {
            super(owner, title, modal);
            Container tela1 = getContentPane();
            tela1.setLayout(null);

            rotulo1 = new JLabel("1º Número: ");
            rotulo2 = new JLabel("2º Número: ");

            texto1 = new JTextField(5);
            texto2 = new JTextField(5);

            voltar = new JButton("Voltar");
            limpar = new JButton("Limpar");

            exibir = new JLabel("");
            subtra2n = new JButton("Subtração");

            rotulo1.setBounds(50, 20, 100, 20);
            rotulo2.setBounds(50, 60, 100, 20);
            texto1.setBounds(120, 20, 200, 20);
            texto2.setBounds(120, 60, 200, 20);
            exibir.setBounds(50, 140, 200, 20);
            subtra2n.setBounds(140, 100, 100, 20);
            
            rotulo1.setForeground(new Color(4, 159, 196));
            rotulo2.setForeground(new Color(4, 159, 196));
            subtra2n.setForeground(new Color(4, 159, 196));
            limpar.setForeground(new Color(4, 159, 196));
            voltar.setForeground(new Color(4, 159, 196));
            

            subtra2n.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    double numero1, numero2, subtracao;
                    subtracao = 0;
                    numero1 = Double.parseDouble(texto1.getText());
                    numero2 = Double.parseDouble(texto2.getText());
                    subtracao = numero1 - numero2;
                    exibir.setVisible(true);
                    exibir.setText("A subtração é: " + subtracao);
                }
            });
            
                
            limpar.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                        texto1.setText(null);
                        texto2.setText(null);
                        exibir.setText(null);
                }
            });
            
            voltar.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    terceirajanela.setVisible(false);
                    terceirajanela.dispose();
                }
            });

            exibir.setVisible(false);
   

            tela1.add(rotulo1);
            tela1.add(rotulo2);
            tela1.add(texto1);
            tela1.add(texto2);
            tela1.add(exibir);
            tela1.add(subtra2n);
            tela1.add(voltar);
            tela1.add(limpar);

            voltar.setBounds(50, 250, 100, 20);
            limpar.setBounds(230, 250, 100, 20);
            setSize(400, 400);
            setLocationRelativeTo(null);
        }
    }
        
    private class InicialMultip extends JDialog {
        JButton voltar, multipli2n, limpar;
        JLabel rotulo1, rotulo2, exibir;
        JTextField texto1, texto2;

        public  InicialMultip(Frame owner, String title, boolean modal) {
            super(owner, title, modal);
            Container tela1 = getContentPane();
            tela1.setLayout(null);

            rotulo1 = new JLabel("1º Número: ");
            rotulo2 = new JLabel("2º Número: ");

            texto1 = new JTextField(5);
            texto2 = new JTextField(5);

            voltar = new JButton("Voltar");
            limpar = new JButton("Limpar");

            exibir = new JLabel("");
            multipli2n = new JButton("Multiplicação");

            rotulo1.setBounds(50, 20, 100, 20);
            rotulo2.setBounds(50, 60, 100, 20);
            texto1.setBounds(120, 20, 200, 20);
            texto2.setBounds(120, 60, 200, 20);
            exibir.setBounds(50, 140, 200, 20);
            multipli2n.setBounds(140, 100, 115, 20);
            
            rotulo1.setForeground(new Color(4, 159, 196));
            rotulo2.setForeground(new Color(4, 159, 196));
            multipli2n.setForeground(new Color(4, 159, 196));
            limpar.setForeground(new Color(4, 159, 196));
            voltar.setForeground(new Color(4, 159, 196));
            
            multipli2n.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    double numero1, numero2, multi;
                    multi = 0;
                    numero1 = Double.parseDouble(texto1.getText());
                    numero2 = Double.parseDouble(texto2.getText());
                 
                    multi = numero1 * numero2;
                    exibir.setVisible(true);
                    exibir.setText("A Multiplicação é: " + multi);
                }
            });
            
            limpar.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                        texto1.setText(null);
                        texto2.setText(null);
                        exibir.setText(null);
                }
            });
            
            voltar.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    quartajanela.setVisible(false);
                    quartajanela.dispose();
                }
            });

            exibir.setVisible(false);

            tela1.add(rotulo1);
            tela1.add(rotulo2);
            tela1.add(texto1);
            tela1.add(texto2);
            tela1.add(exibir);
            tela1.add(multipli2n);
            tela1.add(voltar);
            tela1.add(limpar);

            voltar.setBounds(50, 250, 100, 20);
            limpar.setBounds(230, 250, 100, 20);

            setSize(400, 400);
            setLocationRelativeTo(null);
        }
    }
        
        private class InicialDivisao extends JDialog {
        JButton voltar, divisao2n, limpar;
        JLabel rotulo1, rotulo2, exibir;
        JTextField texto1, texto2;

        public InicialDivisao(Frame owner, String title, boolean modal) {
            super(owner, title, modal);
            Container tela1 = getContentPane();
            tela1.setLayout(null);

            rotulo1 = new JLabel("1º Número: ");
            rotulo2 = new JLabel("2º Número: ");

            texto1 = new JTextField(5);
            texto2 = new JTextField(5);

            voltar = new JButton("Voltar");
            limpar = new JButton("Limpar");

            exibir = new JLabel("");
            divisao2n = new JButton("Divisão");

            rotulo1.setBounds(50, 20, 100, 20);
            rotulo2.setBounds(50, 60, 100, 20);
            texto1.setBounds(120, 20, 200, 20);
            texto2.setBounds(120, 60, 200, 20);
            exibir.setBounds(50, 140, 200, 20);
            divisao2n.setBounds(140, 100, 115, 20);
            
            
            rotulo1.setForeground(new Color(4, 159, 196));
            rotulo2.setForeground(new Color(4, 159, 196));
            divisao2n.setForeground(new Color(4, 159, 196));
            limpar.setForeground(new Color(4, 159, 196));
            voltar.setForeground(new Color(4, 159, 196));

            divisao2n.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    double numero1, numero2, divisao;
                    divisao = 0;
                    numero1 = Double.parseDouble(texto1.getText());
                    numero2 = Double.parseDouble(texto2.getText());
                    divisao = numero1 / numero2;
                    exibir.setVisible(true);
                    exibir.setText("A Divisão é: " + divisao);
                }
            });
            
            limpar.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                        texto1.setText(null);
                        texto2.setText(null);
                        exibir.setText(null);
                }
            });
            
        
            
            voltar.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    quintajanela.setVisible(false);
                    quintajanela.dispose();
                }
            });
            

            exibir.setVisible(false);

            tela1.add(rotulo1);
            tela1.add(rotulo2);
            tela1.add(texto1);
            tela1.add(texto2);
            tela1.add(exibir);
            tela1.add(divisao2n);
            tela1.add(voltar);
            tela1.add(limpar);
            
            limpar.setBounds(230, 250, 100, 20);
            voltar.setBounds(50, 250, 100, 20);

            setSize(400, 400);
            setLocationRelativeTo(null);
        }
    }
    private class InicialFormulario extends JDialog {
        JButton voltar;
        JLabel rotulo1, rotulo2, rotulo3;

        public InicialFormulario(Frame owner, String title, boolean modal) {
            super(owner, title, modal);
            Container tela1 = getContentPane();
            tela1.setLayout(null);

            rotulo1 = new JLabel("Henrique Porto de Sousa ");
            rotulo2 = new JLabel("Lista 12 - Menu: Vence 27 Junho de 2023 ás 23:59");
            rotulo3 = new JLabel("2°DS A Manhã / Laboratório 4 / Sala 17");
             
            voltar = new JButton("Voltar");

            rotulo1.setBounds(50, 20, 250, 20);
            rotulo2.setBounds(50, 60, 300, 20);
            rotulo3.setBounds(50, 100, 300, 20);
            voltar.setBounds(50, 250, 100, 20);
            
            
            rotulo1.setForeground(new Color(4, 159, 196));
            rotulo2.setForeground(new Color(4, 159, 196));
            rotulo3.setForeground(new Color(4, 159, 196));
            voltar.setForeground(new Color(4, 159, 196));
            
            voltar.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    sextajanela.setVisible(false);
                    sextajanela.dispose();
                }
            });
            
            
            tela1.add(rotulo1);
            tela1.add(rotulo2);
            tela1.add(rotulo3);
            tela1.add(voltar);
      

            setSize(400, 400);
            setLocationRelativeTo(null);
        } 
    }
   }


