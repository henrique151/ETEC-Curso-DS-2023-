import javax.swing.JOptionPane;
public class Exercicio3 {
    public static void main (String []args) {
         
        int Soma = 0; // Varaiavel do contador.
        int impar = 0; //  Varaiavel da multiplicação dos números ímpares
        int par = 2;
        int par2 = 0;// Varaiavel da soma dos números pares
        
        for(Soma = 1; Soma <= 30; Soma++)  {
            if (Soma % 2!= 0 ) /* O comparador ser é impar ou par*/{
                impar = impar + Soma;
            } 
            else {
                par = par * Soma; 
                par2 = par2 * Soma; 
            }
           
        }
            System.out.println("O valor da soma dos números ímpares é " + impar );
            System.out.println("O valor da multiplicação começado por 2 dos números pares é " + par);
            System.out.println("O valor da multiplicação começado por 0 dos números pares é " + par2);
        }
    }       


             

        
   


