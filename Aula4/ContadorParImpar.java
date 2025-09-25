package Aula4;
import java.util.Scanner;

public class ContadorParImpar {
    public static void main(String[] args) {
        int numero;
        Scanner leia = new Scanner(System.in);
        for (int i=0; i<=20; i++){
            System.out.print("Digite uma número para saber se é par ou ímpar : ");
            numero = leia.nextInt();
            if (numero %2==0){
                System.out.println("O número "+numero+ " é par");
            }else {
                System.out.println("O número "+numero+ " é ímpar");
            }
    }
    leia.close();
}
}