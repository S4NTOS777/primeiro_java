package Aula5;
import java.util.Scanner;
public class MontadorDeGrid {
    public static void main(String[] args) {
        int grid [][] = new int [3][3];
            
        
        Scanner leia = new Scanner(System.in); 
        
        for (int l=0;l<3;l++){
            for (int c=0;c<3; c++){
              System.out.print("Digite um numero para a posicao [" + l + "][" + c + "]: ");
                grid[l][c] = leia.nextInt();
            }
        }
           for (int l=0;l<3;l++){
            for (int c=0;c<3;c++){
                System.out.print(grid[l][c] + "|"+ "\t");
            }
            System.out.println();
           } 
      leia.close();
    }
}
