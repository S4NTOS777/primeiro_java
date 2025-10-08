package Aula9.Buscador;

public class Busca {
    public static int BuscaSequencial (int [] vetor, int valorProcurado){
        // percoree o vetor do início ao fim
        for (int i = 0; i < vetor.length; i ++){
            // se encontrar o vetor 
            if (vetor[i] == valorProcurado){
                return i; // retorn a posição do índice 
            }
        }
        return -1; // caso nn encontre o valor 
    }
    public static int BuscaBinaria (int [] vetor, int valorProcurado){
       int inicio = 0;
       int fim = vetor.length-1;

       while(inicio<=fim){
        int meio = inicio + (fim - inicio) /2;
        if (vetor [meio]== valorProcurado){
            return meio;

        }
        if(valorProcurado< vetor[meio]){
            fim = meio -1;
        }
        else {
            inicio = meio +1;
        }
       }
        return-1;
    }
}