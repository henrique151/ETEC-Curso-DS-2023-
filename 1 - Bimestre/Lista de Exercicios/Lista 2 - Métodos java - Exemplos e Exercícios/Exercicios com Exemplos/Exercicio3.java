import javax.swing.JOptionPane;
public class Exercicio3Corrigido {
    public static void main(String[] args) {
        String nome, sexo; 
        double altura = 0, pesoal = 0; 
       
         
        nome = JOptionPane.showInputDialog("Olá, por favor digite seu nome: ");
        altura = Double.parseDouble(JOptionPane.showInputDialog("Digite sua altura: "));
        sexo = JOptionPane.showInputDialog("Digite o seu sexo. User as siglas do Masculino (M) e Feminino (F) ");
        
        pesoal=calcularPesoIdeal(altura,sexo);
           
        if(sexo.equals("M") || sexo.equals("m")) {
            System.out.print("Olá, senhor " + nome + ". Seu peso ideal é " + pesoal);
        }
        else if(sexo.equals("F") || sexo.equals("f")) {
            System.out.print("Olá, senhora " + nome + ". Seu peso ideal é " + pesoal);
        } else 
        {
            System.out.print("Letra Inválida");  
        }
      
    }

    
    static double calcularPesoIdeal(double h, String sx ) {
        double res = 0;
        if(sx.equals("M") || sx.equals("m")) {
             res = (72.7*h) - 58;
        }  else if (sx.equals("F") || sx.equals("f")) {
            res = (62.1*h) - 44.7;
        } 
        return res;
       
    }
}
