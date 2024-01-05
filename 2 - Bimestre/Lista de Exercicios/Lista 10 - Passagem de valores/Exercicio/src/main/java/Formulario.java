import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Formulario extends JFrame{
    JLabel nome, matr,LabelCur,LabelRestri, rodape, titulo;
    JTextField txt1, txt2;
    JTextArea AreaText;
    JScrollPane painelrolagem;
    JComboBox lista;
    String turno[] = {"Selecione","Matutino","Vespertino","Noturno"};
    JButton limpar, apresentar, sair;
    ButtonGroup grupo, grupo2;
    JRadioButton EtimTencico,MetTencico,Tecnico, serie1, serie2, serie3;
    JPanel painel;
    
    
    public Formulario(){
        super("Dados Do Aluno");
        
        ImageIcon icone = new ImageIcon("img/form.png");
        setIconImage(icone.getImage());
        
        Container tela = getContentPane();
        tela.setLayout(null);
        
        titulo = new JLabel("Dados Cadastrais do Aluno");
        nome = new JLabel ("Nome::");
        matr = new JLabel ("Matrícula::");
        LabelCur = new JLabel("Informe os dados do seu curso::");
        LabelRestri = new JLabel("Restrições Médicas::");
        rodape = new JLabel("Desenvolvido por: Henrique Porto de Sousa 2°DS A Manhã");
        
        limpar = new JButton("Limpar");
        apresentar = new JButton("Apresentar Dados");
        sair = new JButton("Sair");
        
        txt1 = new JTextField(25);
        txt2 = new JTextField(5);
        
        titulo.setFont(new Font("Arial", Font.PLAIN, 20){
        });
        limpar.setFont(new Font("Arial", Font.BOLD, 14));
        apresentar.setFont(new Font("Arial", Font.BOLD, 14));
        sair.setFont(new Font("Arial", Font.BOLD, 14));
        
        AreaText = new JTextArea(6,17);
        painelrolagem = new JScrollPane(AreaText);
        painelrolagem.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        painelrolagem.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        painel = new JPanel();
           
        EtimTencico = new JRadioButton("Etim");
        MetTencico = new JRadioButton("MetT");
        Tecnico = new JRadioButton("Técnico");
        grupo = new ButtonGroup();
            
        serie1 = new JRadioButton("1º série");
        serie2 = new JRadioButton("2º série");
        serie3 = new JRadioButton("3º série");
        grupo2 = new ButtonGroup();
          
        lista = new JComboBox(turno);
        JScrollPane painelRolagem = new JScrollPane(lista);
              
        titulo.setBounds(200, 15, 350, 40);
        nome.setBounds(50, 60, 100, 20); 
        txt1.setBounds(120, 60, 200, 20);
        txt2.setBounds(120, 90, 80, 20);
        matr.setBounds(50, 90, 100, 20);
        LabelCur.setBounds(50, 140, 300, 20);
        EtimTencico.setBounds(50, 180, 90, 20);
        serie1.setBounds(150, 180, 80, 20);
        MetTencico.setBounds(50, 200, 100, 20); 
        serie2.setBounds(150, 200, 80, 20);
        painelRolagem.setBounds(240, 180, 140, 30);
        Tecnico.setBounds(50, 220, 100, 20);
        serie3.setBounds(150, 220, 80, 20);
        LabelRestri.setBounds(60, 270, 300, 20);
        AreaText.setBounds(170, 250, 150, 130);
        painel.setBounds(170,270,250,250);
        rodape.setBounds(150, 500, 400, 20);
        apresentar.setBounds(50, 430, 150, 25);
        limpar.setBounds(270, 430, 80, 25);
        sair.setBounds(450,430,80,25);
        sair.setToolTipText("Botão que finaliza a janela.");
        
        nome.setFont(new Font("Arial", Font.BOLD, 13));
        nome.setForeground(new Color(76, 139, 217));
        matr.setFont(new Font("Arial", Font.BOLD, 13));
        matr.setForeground(new Color(76, 139, 217));
        LabelCur.setFont(new Font("Arial", Font.BOLD, 13));
        LabelCur.setForeground(new Color(76, 139, 217));
        LabelRestri.setFont(new Font("Arial", Font.BOLD, 13));
        LabelRestri.setForeground(new Color(76, 139, 217));
        apresentar.setFont(new Font("Arial", Font.BOLD, 12));
        apresentar.setForeground(new Color (48, 106, 170));
        limpar.setFont(new Font("Arial", Font.BOLD, 12));
        limpar.setForeground(new Color (48, 106, 170));
        sair.setFont(new Font("Arial", Font.BOLD, 12));
        sair.setForeground(new Color (48, 106, 170));
    
        rodape.setForeground(new Color (48, 106, 170));
        
        
        
        limpar.setMnemonic(KeyEvent.VK_L);
        apresentar.setMnemonic(KeyEvent.VK_A);
        sair.setMnemonic(KeyEvent.VK_S);
        
        limpar.addActionListener(
                new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                txt1.setText(null);
                txt2.setText(null);
                grupo2.clearSelection();
                lista.setSelectedIndex(0);
                turno.equals(false);
                grupo.clearSelection();
                AreaText.setText(null);
            }
            }
        );
        
        apresentar.addActionListener(
            new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String cursoe = "", seriee = "";
                
                String nomee = txt1.getText();
                String matrice = txt2.getText();
                String restre = AreaText.getText();
                
                String perioe = lista.getSelectedItem().toString();
                
                if(serie1.isSelected())
                    seriee = serie1.getText();
                else
                    if(serie2.isSelected())
                      seriee = serie2.getText();
                    else
                      seriee = serie3.getText();
                
                if(EtimTencico.isSelected())
                    cursoe = EtimTencico.getText();
                else
                    if(MetTencico.isSelected())
                        cursoe = MetTencico.getText();
                    else
                        cursoe = Tecnico.getText();
      
                frmMostrar mostra = new frmMostrar(nomee, matrice, restre, perioe, cursoe, seriee);
                
                mostra.setVisible(true);
                dispose();
            }
            }
        );
        
        sair.addActionListener(
        new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                int opcao;
                Object[]botoes={"Sim","Não"};
                    opcao = JOptionPane.showOptionDialog(null,"Deseja mesmo fechar a janela?","Fechar",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,null,botoes,botoes[0]);
                    if(opcao==JOptionPane.YES_OPTION){
                    System.exit(0);
                    }
                }
            }
        );
        
        grupo2.add(serie1);
        grupo2.add(serie2);
        grupo2.add(serie3);
        painel.add(painelrolagem);
        grupo.add(EtimTencico); 
        grupo.add(MetTencico);
        grupo.add(Tecnico);
        
        tela.add(nome);
        tela.add(matr);
        tela.add(txt1);
        tela.add(txt2); 
        tela.add(rodape);
        tela.add(LabelCur);
        tela.add(LabelRestri);
        tela.add(limpar);
        tela.add(apresentar);
        tela.add(EtimTencico);
        tela.add(MetTencico);
        tela.add(sair);
        tela.add(Tecnico);
        tela.add(painelRolagem);
        tela.add(painel);
        tela.add(serie1);
        tela.add(serie2);
        tela.add(serie3);
        tela.add(titulo);
        
        setResizable(false);
        setSize(650, 600);
        setLocationRelativeTo(null);
        setVisible(true);
    }
    

public static void main(String[] args) {
       Formulario app = new Formulario();
       app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       java.awt.EventQueue.invokeLater(new Runnable() {
           public void run() {
             
           }
       });
    }
}