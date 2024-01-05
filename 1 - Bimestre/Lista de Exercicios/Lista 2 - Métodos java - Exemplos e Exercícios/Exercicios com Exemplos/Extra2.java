import javax.swing.JOptionPane;
public class Extra2 {
    public static void main (String [] args) {
       
        double raio = 0;
        double PI = 3.14;
        double area;
        
        raio = Double.parseDouble(JOptionPane.showInputDialog("Digita o raio da área: ")); 
        area=calulorara(raio, PI);
        
        JOptionPane.showMessageDialog(null, "A área do ciruculo é " + area);
       
    }

    private static double calulorara(double raio2, double PI2) {
        double area2;
        area2 = PI2 * (raio2 * raio2);
        return area2;
    }
}
