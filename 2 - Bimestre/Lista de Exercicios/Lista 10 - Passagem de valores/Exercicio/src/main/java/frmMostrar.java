import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class frmMostrar extends javax.swing.JFrame {
    JLabel lblNome, lblMatric, lblRestr, lblPeriod, lblCurso, lblSerie;
    JLabel TxtNome, TxtMatric, TxtRestr, TxtPeriod, TxtCurso, TxtSerie;
    JButton voltar, sair;

    
    public frmMostrar(String nome, String matr, String restr, String period, String curso, String serie) {
        super("Apresentado Dados.");
        initComponents();
        lblNome.setText(nome);
        lblMatric.setText(matr);
        lblPeriod.setText(period);
        lblCurso.setText(curso);
        lblSerie.setText(serie);
        lblRestr.setText(restr);
       
    }

    public void initComponents() {
        
        ImageIcon icone = new ImageIcon("img/form.png");
        setIconImage(icone.getImage());
        
        Container tela = getContentPane();
        tela.setLayout(null);

        lblNome = new JLabel("");
        lblMatric = new JLabel("");
        lblCurso = new JLabel("");
        lblSerie = new JLabel("");
        lblPeriod = new JLabel("");
        lblRestr = new JLabel("");

       
        TxtNome = new JLabel("Nome: ");
        TxtMatric = new JLabel("Matrícula: ");
        TxtCurso = new JLabel("Cruso: ");
        TxtSerie = new JLabel("Série: ");
        TxtPeriod = new JLabel("Periodo: ");
        TxtRestr = new JLabel("Restrições Médicas: ");
       
        voltar = new JButton("Voltar");
        sair = new JButton("Sair");
        
        voltar.setMnemonic(KeyEvent.VK_V);
        sair.setMnemonic(KeyEvent.VK_S);
        
        
        TxtNome.setFont(new Font("Arial", Font.BOLD, 14));
        TxtNome.setForeground(new Color(76, 139, 217));
        TxtMatric.setFont(new Font("Arial", Font.BOLD, 14));
        TxtMatric.setForeground(new Color(76, 139, 217));
        TxtCurso.setFont(new Font("Arial", Font.BOLD, 14));
        TxtCurso.setForeground(new Color(76, 139, 217));
        TxtSerie.setFont(new Font("Arial", Font.BOLD, 14));
        TxtSerie.setForeground(new Color(76, 139, 217));
        TxtPeriod.setFont(new Font("Arial", Font.BOLD, 14));
        TxtPeriod.setForeground(new Color(76, 139, 217));
        TxtRestr.setFont(new Font("Arial", Font.BOLD, 14));
        TxtRestr.setForeground(new Color(76, 139, 217));
        voltar.setFont(new Font("Arial", Font.BOLD, 11));
        voltar.setForeground(new Color(76, 139, 217));
        sair.setForeground(new Color(76, 139, 217));
        sair.setFont(new Font("Arial", Font.BOLD, 11));
        


        /* ================= LBL ================= */

        lblNome.setBounds(90, 30, 200, 40);
        lblMatric.setBounds(115, 50, 100, 40);

        lblCurso.setBounds(110, 100, 100, 40);
        lblSerie.setBounds(110, 120, 100, 40);
        lblPeriod.setBounds(110, 140, 100, 40);

        lblRestr.setBounds(190, 200, 400, 40);
        
        /* ================= Txt ================= */

        TxtNome.setBounds(40, 30, 200, 40);
        TxtMatric.setBounds(40, 50, 100, 40);

        TxtCurso.setBounds(40, 100, 100, 40);
        TxtSerie.setBounds(40, 120, 100, 40);
        TxtPeriod.setBounds(40, 140, 100, 40);

        TxtRestr.setBounds(40, 200, 200, 40);

        voltar.setBounds(80, 300, 70, 25);
        sair.setBounds(320, 300, 70, 25);

        voltar.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
        dispose();
        
        Formulario formulario = new Formulario();
        formulario.setVisible(true);
            }
        });
        
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

        tela.add(lblNome);
        tela.add(lblMatric);
        tela.add(lblCurso);
        tela.add(lblSerie);
        tela.add(lblPeriod);
        tela.add(lblRestr);

        tela.add(TxtNome);
        tela.add(TxtMatric);
        tela.add(TxtCurso);
        tela.add(TxtSerie);
        tela.add(TxtPeriod);
        tela.add(TxtRestr);

        tela.add(voltar);
        tela.add(sair);

        setSize(500, 400);
        setLocationRelativeTo(null);
        setVisible(true);
    }

  
}
