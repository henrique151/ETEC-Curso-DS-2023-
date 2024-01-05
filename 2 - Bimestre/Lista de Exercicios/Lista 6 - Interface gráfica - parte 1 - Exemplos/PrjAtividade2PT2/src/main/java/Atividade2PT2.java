import javax.swing.*;
import javax.swing.text.*;
import java.awt.*;
import java.awt.event.*;
import java.text.*;


public class Atividade2PT2 extends JFrame {
    JLabel rotulocep, rotulotel, rotulocpf,  rotulodata;
    JFormattedTextField cep, tel, cpf, data;
    MaskFormatter mascaracep, mascaratel, mascaracpf, mascaradata;
    
    public Atividade2PT2()  {
        super("Atvidade Parte 2: Mascara");
        Container tela = getContentPane();
        
        setLayout(null);
        
        rotulocep = new JLabel("CEP: ");
        rotulotel = new JLabel("Telefone: ");
        rotulocpf = new JLabel("CPF: ");
        rotulodata = new JLabel("DATA: ");
        
        rotulocep.setBounds(50, 40, 100, 20);
        rotulotel.setBounds(50, 80, 100, 20);
        rotulocpf.setBounds(50, 120, 100, 20);
        rotulodata.setBounds(50, 160, 100, 20);
        
        try {
            
        mascaracep = new MaskFormatter("#####-###");
        mascaratel = new MaskFormatter("(##)####-####");
        mascaracpf = new MaskFormatter("###.###.###-##");
        mascaradata = new MaskFormatter("##/##/####");
        mascaracep.setPlaceholderCharacter('_');
        mascaratel.setPlaceholderCharacter('_');
        mascaracpf.setPlaceholderCharacter('_');
        mascaradata.setPlaceholderCharacter('_');


        }
        catch(ParseException excp){}
        
        cep = new JFormattedTextField(mascaracep);
        tel = new JFormattedTextField(mascaratel);
        cpf = new JFormattedTextField(mascaracpf);
        data = new JFormattedTextField(mascaradata);
        
        cep.setBounds(150, 40, 100, 20);
        tel.setBounds(150, 80, 100, 20);
        cpf.setBounds(150, 120, 100, 20);
        data.setBounds(150, 160, 100, 20);
        
        // Mudar cores.
        cep.setForeground(new Color(255, 255, 255));
        tel.setForeground(new Color(0, 0, 0));
        cpf.setForeground(new Color(204, 0, 0));
        data.setForeground(new Color(69,129, 142));
        
        cep.setBackground(new Color(160, 79, 244));
        tel.setBackground(new Color(121, 68, 243));
        cpf.setBackground(new Color(60,60,242));
        data.setBackground(new Color(0,55,241));
        
        // Mudar cores.
        
        
        // Mudar Fontes.
        cep.setFont(new Font("Times New Roman",Font.BOLD, 14));
        tel.setFont(new Font("Comic Sans MS",Font.PLAIN, 14));
        cpf.setFont(new Font("Arial",Font.BOLD, 14));
        data.setFont(new Font("Tahoma",Font.BOLD, 14));


        tela.add(rotulocep);
        tela.add(rotulotel);
        tela.add(rotulocpf);
        tela.add(rotulodata);
        
        tela.add(cep);
        tela.add(tel);
        tela.add(cpf);
        tela.add(data);
        
        setSize(400, 250);
        setVisible(true);
        setLocationRelativeTo(null);
        }
    
        public static void main(String args[]){
            Atividade2PT2 app = new Atividade2PT2();
            app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

    
