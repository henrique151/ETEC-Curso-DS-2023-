import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Atividade1 extends JFrame {
    JLabel nome, idade, sexo, inte, estadoci, rodape;
    JTextField nometxt, idadetxt;
    JCheckBox auto, barco, avioes;
    JComboBox estado;
    String civil[] = {"Soleitro(a)", "Casado(a)", "Divorciado(a)", "Viúvo(a)"};
    JRadioButton Mas, Fem;
    JButton limpar, enviar, sair;
    ButtonGroup grupo;
    
    public Atividade1() {
        super("Lista 9 - Interface Gráfica - Parte 2");
        
        ImageIcon icone = new ImageIcon("img/cadastro.png");
        setIconImage(icone.getImage());
        
        Container tela = getContentPane();
        tela.setLayout(null);
        
        JOptionPane.showMessageDialog(null, "Olá seja bem-vinda(o) ao Cadastro do Banco Jovem. Cadastre o seus dados.");
        
        nome = new JLabel("Nome: ");
        idade = new JLabel("Idade: ");
        sexo = new JLabel("Sexo: ");
        inte = new JLabel("Interesses: ");
        estadoci = new JLabel("Estado Civil: ");
        rodape = new JLabel("Henrique Porto de Sousa 2°DS A Manhã ");
        
        nometxt = new JTextField(15);
        idadetxt = new JTextField(5);
        
        Mas = new JRadioButton("Masculino");
        Fem = new JRadioButton("Feminino");
        
        grupo = new ButtonGroup();
        grupo.add(Mas);
        grupo.add(Fem);
        
        auto = new JCheckBox("Automóveis");
        barco = new JCheckBox("Barcos");
        avioes = new JCheckBox("Aviões");
        
        estado = new JComboBox(civil);
        
        limpar = new JButton("Limpar os dados");
        enviar = new JButton("Enviar os dados");
        sair = new JButton("Sair");
        
        sair.setToolTipText("Clique para fazer finalizar o programa.");
       
        rodape.setForeground(new Color(0, 206, 209));
        nome.setForeground(new Color(0, 191, 255));
        idade.setForeground(new Color(0, 191, 255));
        sexo.setForeground(new Color(0, 191, 255));
        inte.setForeground(new Color(0, 191, 255));
        limpar.setForeground(new Color(0, 191, 255));
        enviar.setForeground(new Color(0, 191, 255));
        estadoci.setForeground(new Color(0, 191, 255));
        sair.setForeground(new Color(0, 191, 255));
      
        
        nome.setBounds(50,20,70,20);
        idade.setBounds(50,60,70,20);
        sexo.setBounds(50,100,70,20);
        rodape.setBounds(190,430,400,20);
        estadoci.setBounds(50,260,100,20);
        inte.setBounds(50,140,70,20);
        limpar.setBounds(140,360,150,20);
        enviar.setBounds(300,360,150,20);
        sair.setBounds(220, 400, 150, 20);
        
        nometxt.setBounds(90,20,170,20);
        idadetxt.setBounds(90,60,70,20);
     
        Mas.setBounds(90,100,90,20);
        Fem.setBounds(180,100,200,20);
        
        auto.setBounds(50, 170, 120, 20);
        barco.setBounds(50, 200, 120, 20);
        avioes.setBounds(50, 230, 120, 20);
          
        estado.setBounds(130, 260, 100, 20);
      
        
        limpar.setMnemonic(KeyEvent.VK_L);
        
        limpar.addActionListener(
            new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    int opcao;
                       Object[]botoes={"Sim","Não"};
                       opcao = JOptionPane.showOptionDialog(null,"Deseja mesmo limpar seu cadastro?","Limpar",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,null,botoes,botoes[0]);
                       if(opcao==JOptionPane.YES_OPTION){
                       nometxt.setText(null);
                       idadetxt.setText(null);
                       auto.setSelected(false);
                       barco.setSelected(false);
                       avioes.setSelected(false);
                       Mas.setSelected(false);
                       Fem.setSelected(false);
                       estado.setSelectedItem(null);
                       grupo.clearSelection();
                       JOptionPane.showMessageDialog(null, "Seu cadastro foi limpo com sucesso!");
                    }                   
                }
            }
        );
        
        enviar.addActionListener(
            new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    int opcao;
                        Object[]botoes={"Sim","Não"};
                        opcao = JOptionPane.showOptionDialog(null,"Deseja mesmo enviar seu cadastro?","Enviar",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,null,botoes,botoes[0]);
                        if(opcao==JOptionPane.YES_OPTION){
                            JOptionPane.showMessageDialog(null, "Seu cadastro foi enviado com sucesso!");
                        }
                }
            }
        );
        
        sair.addActionListener(
                new ActionListener() {
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
        
        tela.add(nome);
        tela.add(idade);
        tela.add(sexo);
        tela.add(inte);
        tela.add(estadoci);
        tela.add(limpar);
        tela.add(enviar);
        
        tela.add(nometxt);
        tela.add(idadetxt);
        
        tela.add(Mas);
        tela.add(Fem);
        
        tela.add(auto);
        tela.add(barco);
        tela.add(avioes);
        
        tela.add(estado);
        tela.add(rodape);
        tela.add(sair);
        
        setSize(620, 520);
        setLocationRelativeTo(null);
        setVisible(true);
        
      
    }
        
    public static void main(String[] args) {
        Atividade1 app = new Atividade1();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
