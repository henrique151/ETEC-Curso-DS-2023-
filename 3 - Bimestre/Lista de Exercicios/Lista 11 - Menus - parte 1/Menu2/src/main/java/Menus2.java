import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Menus2 extends JFrame{
    JPopupMenu opcoes;
    JMenuItem recortar,copiar,colar;
    JTextArea texto; 
    JToolBar barra;
    JButton direita,esquerda,centralizar, recortar2, copiar2, colar2;
    ImageIcon imagens[];
    JMenuBar barra2;
    JMenu opcoes2;
    JMenuItem somar,sair;
    JButton btnSair;
    Inicial segundajanela;
    
    public Menus2(){
       super("Exemplos 20, 21, 22");
       Container tela = getContentPane();
       tela.setLayout(null);
    
       barra2 = new JMenuBar();
       setJMenuBar(barra2);
       opcoes2 = new JMenu("Opções");
       barra2.add(opcoes2);
       somar = new JMenuItem("Somar");
       sair = new JMenuItem("Sair");
       somar.setMnemonic(KeyEvent.VK_O);
       sair.setMnemonic(KeyEvent.VK_S);
       opcoes2.add(somar);
       opcoes2.add(sair);
       
       somar.addActionListener(new ActionListener(){
           public void actionPerformed(ActionEvent e){
               segundajanela = new Inicial(null,"Segunda Janela",true);
               segundajanela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
               segundajanela.setVisible(true);
           }});
       btnSair = new JButton("Sair");btnSair.setBounds(400,450,80,20);btnSair.addActionListener(new ActionListener(){
           public void actionPerformed(ActionEvent e){
               int status = JOptionPane.showConfirmDialog(null,"Deseja realmente fechar o programa?","Mensagem de saida",JOptionPane.YES_NO_OPTION); if (status == JOptionPane.YES_OPTION){System.exit(0);}}});
       
       tela.add(btnSair);
       setSize(500, 550);
       setVisible(true);
       setLocationRelativeTo(null);
       
       String icones[]={"imagens/direita.png","imagens/esquerda.png","imagens/centro.png","imagens/cortar.png","imagens/copiar.png","imagens/colar.png"};
       imagens= new ImageIcon[6];
       for(int i=0;i<6;i++){
           imagens[i] = new ImageIcon(icones[i]);
       }
       direita = new JButton(imagens[0]);
       esquerda = new JButton(imagens[1]);
       centralizar = new JButton(imagens[2]);
       recortar2 = new JButton(imagens[3]);
       copiar2 = new JButton(imagens[4]);
       colar2 = new JButton(imagens[5]);
       
       direita.setToolTipText("Direita(Ctrl+d)");
       esquerda.setToolTipText("Esquerda(Ctrl+e)");
       centralizar.setToolTipText("Centralizar(Ctrl+z)");
       recortar2.setToolTipText("Recortar(Ctrl+x)");
       copiar2.setToolTipText("Copiar(Ctrl+c)");
       colar2.setToolTipText("Colar(Ctrl+v)");
       
       barra = new JToolBar("Barra de Ferramentas");
       
       UIManager.put("ToolTip.background",SystemColor.info);
       UIManager.put("ToolTip.foreground",Color.blue);
       barra.setRollover(true);
       
       barra.add(direita);
       barra.add(esquerda);
       barra.add(centralizar);
       barra.addSeparator();
       barra.add(recortar2);
       barra.add(copiar2);
       barra.add(colar2);
       barra.setBounds(30,10,200,30);
       tela.add(barra);
       
       texto = new JTextArea(10,20);
       texto.setBounds(30,60,250,250);
       texto.addMouseListener(new MouseAdapter(){
            public void mouseReleased(MouseEvent e){
                if(e.isPopupTrigger())
                opcoes.show(e.getComponent(),e.getX(),e.getY()); 
            }
       }
       );
       
       Tratador tratmenu = new Tratador();
       
       opcoes = new JPopupMenu();
       recortar = new JMenuItem("Recortar");
       copiar = new JMenuItem("Copiar");
       colar = new JMenuItem("Colar");
       
       recortar.setMnemonic(KeyEvent.VK_R);
       copiar.setMnemonic(KeyEvent.VK_C);
       colar.setMnemonic(KeyEvent.VK_L);
       
       recortar.addActionListener(tratmenu);
       copiar.addActionListener(tratmenu);
       colar.addActionListener(tratmenu);
       
       opcoes.add(recortar);
       opcoes.add(copiar);
       opcoes.addSeparator();
       opcoes.add(colar);
       
       tela.add(texto);
 
       
       setSize(600, 500);
       setLocationRelativeTo(null);
       setVisible(true);
    }
    
    public static void main (String args[]){
        Menus2 app = new Menus2();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    private class Inicial extends JDialog{
        JButton sair;
        JLabel rotulo1, rotulo2, exibir;
        JTextField texto1, texto2;
        JButton somar2n;
        public Inicial(Frame owner, String title,boolean modal){
            super(owner,title,modal);
            Container tela1 = getContentPane();tela1.setLayout(null); 
            // layout do formulário 
            rotulo1 = new JLabel("1º Número: ");
            rotulo2 = new JLabel("2º Número: ");
            texto1 = new JTextField(5);
            texto2 = new JTextField(5);
            exibir = new JLabel("");
            somar2n = new JButton("Somar");
            
            rotulo1.setBounds(50,20,100,20);
            rotulo2.setBounds(50,60,100,20);
            
            texto1.setBounds(120,20,200,20);
            texto2.setBounds(120,60,200,20);
            exibir.setBounds(50,140,200,20);
            somar2n.setBounds(150,100,80,20);
            
            somar2n.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                int numero1, numero2, soma;
                soma = 0;
                numero1 = Integer.parseInt(texto1.getText());
                numero2 = Integer.parseInt(texto2.getText());
                soma = numero1 + numero2;
                exibir.setVisible(true);
                exibir.setText("A soma é: "+soma);}
            }
            );      
                exibir.setVisible(false);
                tela1.add(rotulo1);
                tela1.add(rotulo2);
                tela1.add(texto1);
                tela1.add(texto2);
                tela1.add(exibir);
                tela1.add(somar2n);
                sair = new JButton("Sair");
                sair.setBounds(50,250,100,20);
                TBsair tsair = new TBsair();
                sair.addActionListener(tsair);
                tela1.add(sair);
                setSize(400,400);
                setLocationRelativeTo(null);
        }
    }
    
    private class TBsair implements ActionListener{
        public void actionPerformed(ActionEvent evento){
        segundajanela.setVisible(false);
        segundajanela.dispose();
    }
    }
    private class Tratador implements ActionListener{
        public void actionPerformed(ActionEvent e){
            if(e.getSource()==recortar)
                texto.cut();
            if(e.getSource()==copiar)
                texto.copy();
            if(e.getSource()==colar)
                texto.paste(); 
        }
    }
}
   
    

    




