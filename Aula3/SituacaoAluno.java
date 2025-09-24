package Aula3;

public class SituacaoAluno {
    public static void main(String[] args) {
        int nota1 = 7;
        int nota2 = 9;
        int media;
        media = (nota1 + nota2)/2;

        if (media>=7) {
            System.out.println("Você está aprovado");
        }
        else if (media<7){
            System.out.println("Você está reprovado");
        }
        else if (media ==10){
            System.out.println("Parabéns, aprovadíssimo");
        }
    }
}
