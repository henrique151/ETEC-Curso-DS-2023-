import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Atividade1 extends JFrame {
    JComboBox lista2;
    JList lista;
    String cidades[]={"Rio de Janeiro","São Paulo","Minas Gerais","Esprito Santo","Bahia","Pernambuco","Rio Grande do Sul","Acre"};
    JButton exibir;
    JLabel rotulo, rotulo2, rodape;
    
    public Atividade1() {
        super("Exemplo List 1-2-3. Exemplo JComboBox 1 - 2 ");
        Container tela = getContentPane();
        ImageIcon icone = new ImageIcon("img/12.png");
        setIconImage(icone.getImage());
        
        setLayout(null);
        
        exibir = new JButton("Exibir");
        rotulo = new JLabel("");
        rotulo2 = new JLabel("");
        rodape = new JLabel("Henrique Porto de Sousa 2°DS A Manhã ");
        
        lista = new JList(cidades);
        lista2 = new JComboBox(cidades);
        
        lista.setVisibleRowCount(5);
        lista2.setEditable(true); // Se caso você não querer colocar para digite e so mudar para false onde que está true.
        lista2.setMaximumRowCount(5);
    
        JScrollPane painelRolagem = new JScrollPane(lista);
        lista.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        lista.setForeground(Color.black);
        lista.setBackground(new Color(40, 150, 228));
        lista.setFont(new Font("Times New Roman", Font.BOLD, 16));
        
        lista2.setForeground(new Color(36, 36, 130));
        lista2.setBackground(new Color(0, 191, 255));
        lista2.setFont(new Font("helvetica", Font.ITALIC, 14));
        
        rodape.setBounds(40, 320, 300, 30);
        rodape.setForeground(new Color(60, 125, 255));
        painelRolagem.setBounds(40, 50, 150, 100);
        lista2.setBounds(40, 250, 150, 30);
        exibir.setBounds(270, 50, 100, 30);
        rotulo.setBounds(50, 150, 200, 30);
        rotulo2.setBounds(50, 280, 200, 30);
        
        exibir.addActionListener(
            new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                rotulo.setText("O estado é: " + lista.getSelectedValue().toString());
                rotulo2.setText("O estado é: " + lista2.getSelectedItem().toString());
                rotulo.setForeground(new Color(232, 87, 64));
                rotulo2.setForeground(new Color(132, 87, 64));
            }
           }
        );
        
        tela.add(painelRolagem);
        tela.add(exibir);
        tela.add(rotulo);
        tela.add(rotulo2);
        tela.add(lista2);
        tela.add(rodape);
        
        setSize(600, 450);
        setVisible(true);
        setLocationRelativeTo(null);
    }
      public static void main(String[] args) {
        Atividade1 app = new Atividade1();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    

}

