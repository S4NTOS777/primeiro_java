package Aula9.Buscador;

public class Programa {
    public static void main(String[] args) {
        int [] vetor = {1,2,3,4,5,6,7};
        int valorProcurado =5;
        int posicao = Busca.BuscaBinaria(vetor, valorProcurado);
        if (posicao == -1){
            System.out.print("O número não está na lista");
        }else {
            System.out.printf("O item buscado esta na posição: %d e é o item: %d", posicao , vetor [posicao]);
        }
    }
}
