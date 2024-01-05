import java.util.Random;
import javax.swing.JOptionPane;
  /* Gere e imprima uma matriz M 4x4 com valores aleatórios entre 0-9. Após isso determine o maior número da matriz e a sua posição (linha, coluna) */
  // Exercício retirado do curso loianeg site: http://www.slideshare.net/loianeg/curso-java-basico-exercicios-aula-20
public class Extra3 {
    
     public static void main (String [] args) {
        int matrizpri[][] = new int [4][4]; // Variavel responsável que vai ficar armazenado os números da matriz.
        int linha, coluna = 0; // Variavel responsável pela coluna e linha da matriz.
        int maiornumero = 0; // Variavel responsável para armazenar o maior número da matriz.
        int colunaMa = 0; // Variavel responsável para armazenar a maior coluna número da matriz.
        int linhaMa = 0; // Variavel responsável para armazenar a maior linha número da matriz.
            
        Random numeroRandom = new Random();
        
        
        for( coluna = 0;  coluna <  matrizpri.length ;  coluna++ ) 
        {
            for(linha = 0; linha <  matrizpri.length; linha++ ) 
            {
            matrizpri[linha][coluna] = numeroRandom.nextInt(100); // Responsável por gerar números aleatórios.
            }
        }
        
        for(coluna = 0;  coluna < 4;  coluna++ ) 
        {
            for(linha = 0; linha< 4; linha++ ) 
            {
                System.out.print(matrizpri[linha][coluna] + " "); // Responsável por gera uma matriz prefeita.
            }   
            
        System.out.println(" "); 
        
        }   
        
        for( coluna = 0;  coluna<  matrizpri.length; coluna++ ) 
        {
            for(linha = 0; linha <  matrizpri.length; linha++ ) 
            {
                 if(matrizpri[linha][coluna]  > maiornumero)  // O if é responsável por saber qual é o maior número da matriz. Toda vezes que passa um número maior que o anterior vai prosseguir com o código.
                 {
                 maiornumero = matrizpri[linha][coluna]; // Ele vai armazenar o maior número da matriz.
                 linhaMa = linha; // Ele vai armazenar a linha que ele está.
                 colunaMa = coluna; // Ele vai armazenar a coluna que ele está.
                 }
            }
        }
        System.out.println("O maior número armazenado é " +  maiornumero); // O resultado do maior número armazenado da matriz.
        System.out.println("Está localizado na coluna " +  colunaMa ); // Armazenando a coluna que pertencem.
        System.out.println("Está localizado na linha " + linhaMa ); // Armazenando a linha que pertencem.
    }
}
