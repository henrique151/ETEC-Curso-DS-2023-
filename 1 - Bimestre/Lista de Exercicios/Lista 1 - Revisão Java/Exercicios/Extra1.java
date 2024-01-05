import javax.swing.JOptionPane;
public class Extra1 {
    public static void main (String [] args) {
     // Exercício retirado do curso loianeg site: http://www.slideshare.net/loianeg/curso-java-basico-exercicios-aula-19
           
     int vetorA[] = new int[5];
     int vetorB[] = new int[5];
     int z;
     
     for(z = 0; z<5; z++) {
          vetorA[z] = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite 5 número para seus elementos:")); 
          vetorB[z] = vetorA[z];
     }
     System.out.print("Os elementos pertencem do Vetor A é = ");
     
     for(z = 0; z < 5; z++) {
           System.out.print(vetorA[z] + " ");
    }
     System.out.println("");
     
    System.out.print("Os elementos pertencem do Vetor B é = ");
     
     for(z = 0; z < 5; z++) {
           System.out.print(vetorB[z] + " ");
    }
     
    }
}
