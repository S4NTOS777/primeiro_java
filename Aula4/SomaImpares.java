package Aula4;

public class SomaImpares {
    public static void main(String[] args) {
        int num = 1;
        int soma = 0;

        for (int i=num; i<=100; i++){
            if (i%2 !=0){
                soma = soma +i;
            }
        }
            System.out.println(soma);

    }
}
