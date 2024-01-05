import javax.swing.JOptionPane; 
public class Extra1 {
    public static void main(String[] args) {
        double  Celsius ;
      
        double temp;
        Celsius = Double.parseDouble(JOptionPane.showInputDialog("Digita a temeratura em graus Celsius: ")); 
        temp=Fahrenheit( Celsius );
        JOptionPane.showMessageDialog(null, "A conversão em Fahrenheit foi feita. O resultado é " + temp);
        
    }

    private static double Fahrenheit(double celsius2) {
        double fahrenh = 0;
        fahrenh = (9*celsius2+150) / 5;
        return fahrenh;
    }
}
