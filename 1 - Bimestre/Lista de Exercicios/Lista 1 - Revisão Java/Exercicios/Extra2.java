import static java.lang.Math.sqrt;
import javax.swing.JOptionPane;
public class Extra2 {
    public static void main (String [] args) {
        // Exercício retirado do curso loianeg site: http://www.slideshare.net/loianeg/curso-java-basico-exercicios-aula-19
        
        int vetorA[] = new int[15];
        double vetorB[] = new double[15];
        int z;
         
          for(z = 0; z < vetorA.length; z++) 
          {
          vetorA[z] = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite 15 número para seus elementos:")); 
          vetorB[z] = Math.sqrt(vetorA[z]);
          } 
          
          System.out.print("Os valores que foi digitado foi: ");
     
          for(z = 0; z < vetorA.length; z++) {
           System.out.print(vetorA[z] + " ");
          }
        
          System.out.println("");
     
          System.out.print("As raiz quadrada do elemento é: ");
     
          for(z = 0; z < vetorA.length; z++) {
           System.out.print(vetorB[z] + " ");
          }
    }
}
