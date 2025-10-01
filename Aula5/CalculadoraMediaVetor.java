package Aula5;
import java.util.Scanner;
public class CalculadoraMediaVetor {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        double [] notas = new double[4];

        for (int i = 0; i<=3; i ++){
            System.out.print("Digite suas notas:");
          notas[i] = leia.nextDouble();
        }
        double media = (notas[0] + notas[1] + notas[2] + notas[3]) / 4;

        System.out.printf("A media do aluno é: %.2f ", media);
        leia.close();
}
} 