import javax.swing.JOptionPane;
public class Exercicio4Corrigidos {
    public static void main(String[] args) {
        int but;
        
        do {  
            but = Integer.parseInt(JOptionPane.showInputDialog("Escolha umas dastas opção para sua conta:\n \n 1 – Soma \n 2 – Subtração \n 3 – Divisão  \n 4 – Multiplicação \n 5 – Resto da Divisão  \n 6 – Dobro \n 7 – Quadrado  \n 8 – Cubo  \n 9 – Raiz Quadrada  \n 0 – Sair"));    
         if(but == 1) {    
            soma();
        } else if (but == 2) {
            subt();
        } else if (but == 3) {
            divi();
        } else if (but == 4) {
            mult();
        } else if (but == 5) {
            resto();
        }  else if (but == 6) {
            dobro();
        } else if (but == 7) {
            quadra();
        } else if (but == 8) {
            cubo();
        } else if (but == 9) {
            raiz();
        } else if (but == 0) {
            System.out.print("\n O programa foi finalizado."); 
        } else  {
            System.out.print("\n Opção invalida"); 
        } 
        } while (but != 0);
          
    }
    
    static void soma() {
       double total,v1,v2 = 0;
       v1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro número da soma: "));
       v2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo número da soma: "));
       total = v1 + v2;
       JOptionPane.showMessageDialog(null, "A Soma dos números " + v1 + " + " + v2 + " deu um total de " + total);
    }

    static void subt() {
       double total,v1,v2 = 0;
       v1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro número da subtração: "));
       v2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo número da subtração: "));
       total = v1 - v2;
       JOptionPane.showMessageDialog(null, "A Subtração dos números " + v1 + " - " + v2 + " deu um total de " + total);
    }

    static void divi() {
       double total,v1,v2 = 0;
       v1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro número da divisão: "));
       v2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo número da divisão: "));
       total = v1 / v2;
       JOptionPane.showMessageDialog(null, "A Divisão dos números " + v1 + " / " + v2 + " deu um total de " + total);
    }

    static void mult() {
       double total,v1,v2 = 0;
       v1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro número da multiplicação: "));
       v2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo número da multiplicação: "));
       total = v1 * v2;
       JOptionPane.showMessageDialog(null, "A Divisão dos números " + v1 + " / " + v2 + " deu um total de " + total);
       System.out.print("A Multiplicação dos números " + v1 + " * " + v2 + " deu um total de " + total);
    }

    static void resto() {
       double total,v1,v2 = 0;
       v1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro número do resto da divisão: "));
       v2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo número do resto da divisão: "));
       total = v1 % v2;
       JOptionPane.showMessageDialog(null, "O Resto da divisão dos números " + v1 + " % " + v2 + " deu um total de " + total);
    }

    static void dobro() {
        double total,v1 = 0; 
        v1 = Double.parseDouble(JOptionPane.showInputDialog("Digite um número para ser dobrado:"));
        total = v1 * 2;
        JOptionPane.showMessageDialog(null, "O dobro do número " + v1 + " * 2 " + " deu um total de " + total);
    }

    static void quadra() { 
        double total,v1 = 0;
        v1 = Double.parseDouble(JOptionPane.showInputDialog("Digite um número para ser multiplicado por ele memso:"));
        total = Math.pow(v1, 2);
        JOptionPane.showMessageDialog(null, "O quadrado do número " + v1 + " * " + v1 + " deu um total de " + total);
    }

    static void cubo() {
       double v1, total = 0;
       v1 = Double.parseDouble(JOptionPane.showInputDialog("Digite um número para ser feito no cubo:"));
       total = Math.pow(v1, 3);
       JOptionPane.showMessageDialog(null, "O valor cubo do: " + v1 + " * " + v1 + " * " + v1 + " deu um total de " + total);
    }

    static void raiz() {
       double total,v1,v2 = 0;
       v1 = Double.parseDouble(JOptionPane.showInputDialog("Digite um número para ser feito a raiz quadrada:"));
       total = Math.sqrt(v1);
       JOptionPane.showMessageDialog(null, "O raiz quadrada do: " + v1 + " deu um total de " + total);
    }

  

  
}
