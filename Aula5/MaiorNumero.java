package Aula5;
import java.util.Scanner;

public class MaiorNumero {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int[] numeros = new int[6];
        int maior = 0;
        for (int i = 0; i < 6; i++) {
            System.out.print("Digite um número: ");
            numeros[i] = leia.nextInt();

            if (numeros[i] > maior) {
                maior = numeros[i];
            }
        }
        System.out.println("O novo recorde é: " + maior);
            
         leia.close();
     }
    }