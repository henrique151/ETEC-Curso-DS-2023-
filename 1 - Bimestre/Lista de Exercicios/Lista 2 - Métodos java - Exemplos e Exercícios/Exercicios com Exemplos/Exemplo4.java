import javax.swing.JOptionPane;

public class exemplo4 {
    
    public static void main(String[] args) 
    {
     int num;
     num =Integer.parseInt(JOptionPane.showInputDialog("Entre com um número"));
     
     if (RestoPorDois(num) == 0) //chama o resultado do método
         JOptionPane.showMessageDialog(null, "O número é par. \n");
     else
         JOptionPane.showMessageDialog(null, "O número é impar. \n");
    }
    
    static int RestoPorDois(int a)
    {
        return a % 2;
    }
    
}
