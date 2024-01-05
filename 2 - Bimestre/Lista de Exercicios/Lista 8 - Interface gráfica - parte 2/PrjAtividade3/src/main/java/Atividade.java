import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.text.DecimalFormat;
import javax.swing.Timer;


public class Atividade extends JFrame{
    JButton sair, botao2, erro,informacao,exclamacao,pergunta,nenhum, copiar,limpar, copiar2,limpar2;
    String nome;
    JLabel rotulonm, parte1, parte2, parte3, parte4, parte5, parte6,parte7, rotulo1, rotulo2, rotulo3, rotulo4, rotuloda1, rotuloda2, rotuhora, rodape;
    JTextField texto1,texto2, texto3, texto4;
    int ds, dia, mes, ano, hh,mm,ss,h;
    Calendar data, hora;
    DecimalFormat formato;
    String diasemana[]={"Domingo","Segunda-Feira","Terça-Feira","Quarta-Feira","Quinta-Feira","Sexta-Feira","Sábado"};
    String meses[]={"Janeiro","Fevereiro","Março","Abril","Maio","Junho","Julho","Agosto","Setembro","Outubro","Novembro","Dezembro"};
    
    
    public Atividade() {
        super("Exemplos 3 - Aula 6");
        Container tela = getContentPane();
        
        ImageIcon icone = new ImageIcon("img/153.jpg");
        setIconImage(icone.getImage());
        tela.setLayout(null);
        
        
        rotulo1 = new JLabel("Nome:");
        rotulo2 = new JLabel("Nome:");
        rotulo3 = new JLabel("Nome:");
        rotulo4 = new JLabel("Nome:");
        rotuloda1 = new JLabel("");
        rotuloda2 = new JLabel("");
        rotuhora = new JLabel("");
        rotulonm = new JLabel("");
        
        texto1 = new JTextField(20);
        texto2 = new JTextField(20);
        texto3 = new JTextField(20);
        texto4 = new JTextField(20);
        
        copiar = new JButton("Copiar"); 
        limpar = new JButton("Limpar");
        copiar2 = new JButton("Copiar"); 
        limpar2 = new JButton("Limpar");
        
        parte1 = new JLabel("Fechar a Janela ⬇");
        parte2 = new JLabel("Exemplo De Messagens ⬇");
        parte3 = new JLabel("Linguagens ⬇");
        parte4 = new JLabel("Exemplo Maiusculas ⬇");
        parte5 = new JLabel("Exemplo Minuscula ⬇");
        parte6 = new JLabel("Exemplo Data ⬇");
        parte7 = new JLabel("Exemplo de Hora ⬇");
        rodape = new JLabel("Henrique Porto de Sousa 2°DS A Manhã ");
         
        sair = new JButton("Sair");
        botao2 = new JButton("Linguagens");
        erro = new JButton("Erro");
        informacao = new JButton("Informação");
        exclamacao = new JButton("Exclamação");
        pergunta = new JButton("Pergunta");
        nenhum = new JButton("Nenhum");
        
        data = Calendar.getInstance();
        ds = data.get(Calendar.DAY_OF_WEEK);
        dia = data.get(Calendar.DAY_OF_MONTH);
        mes = data.get(Calendar.MONTH);
        ano = data.get(Calendar.YEAR);
        
        
        rotulonm.setBounds(300, 20, 600, 20);
        rotuloda1.setBounds(30,300,200,20);
        rotuloda2.setBounds(30,320,250,20);
        rotuhora.setBounds(335, 300, 100, 20);
        
        rotulo1.setBounds(560,90,50,20);
        rotulo2.setBounds(560,120,50,20);
        texto1.setBounds(600,90,180,20);
        texto2.setBounds(600,120,180,20);
        copiar.setBounds(600,160,80,20);
        limpar.setBounds(700,160,80,20);
        
        rotulo3.setBounds(560,290,50,20);
        rotulo4.setBounds(560,330,50,20);
        texto3.setBounds(600,290,180,20);
        texto4.setBounds(600,330,180,20);
        copiar2.setBounds(600,370,80,20);
        limpar2.setBounds(700,370,80,20);
        
        erro.setBounds(30,90,100,20);
        informacao.setBounds(30,120,100,20);
        exclamacao.setBounds(30,150,150,20);
        pergunta.setBounds(30,180,100,20);
        nenhum.setBounds(30,210,100,20);
          
        parte1.setBounds(600, 430, 200, 20);
        parte2.setBounds(30, 50, 200, 20);
        parte3.setBounds(350, 50, 100, 20);
        parte4.setBounds(600, 50, 200, 20);
        parte5.setBounds(600, 250, 200, 20);
        parte6.setBounds(30, 280, 100, 20);
        parte7.setBounds(335, 280, 200, 20);
        botao2.setBounds(340,90,100,20);   
        
        rodape.setBounds(280, 500, 400, 20);
        rodape.setForeground(new Color(125, 200, 100));
        sair.setBounds(600,460,100,20);
        
        
        erro.setToolTipText("Botão que vai mostrar a mensagem Erro.");
        informacao.setToolTipText("Botão que vai mostrar a mensagem Infromação.");
        exclamacao.setToolTipText("Botão que vai mostrar a mensagem Exclamação.");
        pergunta.setToolTipText("Botão que vai mostrar a mensagem Pergunta.");
        nenhum.setToolTipText("Botão que vai mostrar a mensagem Nenhum.");
         
        botao2.setToolTipText("Botão que mostar quais são suas linguagem favorita.");
        
        copiar.setToolTipText("Essa botão ser para copiar o que está escrito e converta para em Maiusculas");
        limpar.setToolTipText("Botão usado para limpar as duas caixas do Maiusculas");
        
        copiar2.setToolTipText("Essa botão ser para copiar o que está escrito e converta para em Minusculas");
        limpar2.setToolTipText("Botão usado para limpar as duas caixas do Minusculas");
       
        sair.setToolTipText("Botão que finaliza a janela");
        UIManager.put("ToolTip.foreground",Color.blue);
       
        rotuloda1.setText("Data: "+ds+" " +dia+"/"+(mes+1)+ "/" +ano);
        rotuloda2.setText("Data: "+diasemana[ds-1]+", "+dia+" de "+meses[mes]+" de "+ano);
        
        JOptionPane.showMessageDialog(null, "Seja-bem vinda ao programa.");
        nome = JOptionPane.showInputDialog("Primeiramente, entre com seu nome:");
        rotulonm.setText("Seja-bem vinda(o), Sra(o): " + nome.toUpperCase());
        rotulonm.setForeground(new Color(235,50,50));
        
        ActionListener tarefa = (new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                horas();
            }   
        });
        javax.swing.Timer time = new javax.swing.Timer(1000,tarefa);
        time.start();
        
        copiar2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
           String texto;
           texto = texto3.getText().toUpperCase();
           texto3.setText(texto);
           texto4.setText(texto3.getText().toLowerCase());
            }
        });
        
        limpar2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            texto3.setText("");
            texto4.setText("");
            texto3.requestFocus();
            }
        });
        
        
        copiar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            texto2.setText(texto1.getText().toUpperCase());
            }
        });
        
        limpar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            texto1.setText("");
            texto2.setText("");
            texto1.requestFocus();
            }
        });
        
        erro.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                JOptionPane.showMessageDialog(null,"Você escolheu erro","Mensagem de Erro", JOptionPane.ERROR_MESSAGE, null);
            };
        });
        
        informacao.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                JOptionPane.showMessageDialog(null,"Você escolheu informação","Mensagem de Informação", JOptionPane.INFORMATION_MESSAGE, null);
            };
        });
        
        exclamacao.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                JOptionPane.showMessageDialog(null,"Você escolheu exclamação","Mensagem de Exclamação", JOptionPane.WARNING_MESSAGE, null);
            };
        });
        
        pergunta.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                JOptionPane.showMessageDialog(null,"Você escolheu pergunta","Mensagem de Pergunta", JOptionPane.QUESTION_MESSAGE, null);
            };
        });
        
        nenhum.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                JOptionPane.showMessageDialog(null,"Você escolheu nenhum","Mensagem de Nenhum", JOptionPane.PLAIN_MESSAGE, null);
            };
        });
            
           
        sair.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int opcao;
                    Object[]botoes={"Sim","Não"};
                    opcao=JOptionPane.showOptionDialog(null,"Deseja mesmo fechar a janela?","Fechar",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,null,botoes,botoes[0]);
                    if(opcao==JOptionPane.YES_OPTION)
                System.exit(0);                
            }});
        
        botao2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int opcao2;
                Object linguagens[]={"Java","Delphi","C++","VisualBasic"};
                Object opcao= JOptionPane.showInputDialog(null,"Qual sua linguagem favorita?","Enquete",JOptionPane.QUESTION_MESSAGE,null,linguagens,linguagens[0]);
                JOptionPane.showMessageDialog(null,"Você escolheu: "+opcao);
                Object[]botoes={"Sim","Não"};
                opcao2=JOptionPane.showOptionDialog(null,"Deseja mesmo fechar a janela?","Fechar",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,null,botoes,botoes[0]);
                if(opcao2==JOptionPane.YES_OPTION) 
                System.exit(0);
            }
        });
            
        tela.add(rotulonm);
        
        tela.add(rotuloda1);
        tela.add(rotuloda2);
        tela.add(rotuhora);
        
        tela.add(rotulo1);
        tela.add(rotulo2);
        tela.add(texto1);
        tela.add(texto2);
        tela.add(copiar);
        tela.add(limpar);
        
        tela.add(rotulo3);
        tela.add(rotulo4);
        tela.add(texto3);
        tela.add(texto4);
        tela.add(copiar2);
        tela.add(limpar2);
        
        tela.add(parte1);
        tela.add(parte2);
        tela.add(parte3);
        tela.add(parte4);
        tela.add(parte5);
        tela.add(parte6);
        tela.add(parte7);
       
        tela.add(botao2);
        tela.add(sair);
        
        tela.add(erro);
        tela.add(informacao);
        tela.add(exclamacao);
        tela.add(pergunta);
        tela.add(nenhum); 
        
        tela.add(rodape);
        
        setSize(820,580);
        setVisible(true);
        setLocationRelativeTo(null);
    }
    
public static void main(String args[]){
    Atividade app = new Atividade();
    app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
    private void horas() {
       hora = Calendar.getInstance();
       hh = hora.get(Calendar.HOUR_OF_DAY);
       mm = hora.get(Calendar.MINUTE);
       ss = hora.get(Calendar.SECOND);
       formato = new DecimalFormat("00");
       rotuhora.setText("Hora:"+formatar(hh%24)+":"+formatar(mm)+":"+formatar(ss));
    }
    private String formatar(int num){
        formato = new DecimalFormat("00");
        return formato.format(num);
    }
}


    
        
          
           
        
    
    

