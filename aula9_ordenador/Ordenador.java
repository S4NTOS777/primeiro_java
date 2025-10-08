package aula9_ordenador;
public class Ordenador {
public static void bubllesort (int [] vetor){
    int n = vetor.length;
    for (int i = 0; i < n - 1; i ++){
        System.out.printf("Posição i; %d \n", i);
        for (int j = 0; j < n - i - 1; j++){
            System.out.printf("item na posição %d é %d \n", j, vetor[j], j+1, vetor[j+ 1]);
            if (vetor[j]>vetor[j+1]){
                int temp = vetor [j];
                vetor [j] = vetor [j + 1];
                vetor [j + 1] = temp;
            }
        }
    }
}




public static void SelectionSort (int [] vetor){
    int n = vetor.length;
    for (int i = 0; i < n - 1; i++){
        System.err.printf("Posição i: %d \n", i);
        int indiceDoMenor = i;
        for (int j = i +1; j < n; j++){
            if (vetor[j]<vetor[indiceDoMenor]){
                System.out.printf("o número selecionado (j) é o %d - %d o numero do IndiceoDoMenor é %d - %d \n", indiceDoMenor,vetor[indiceDoMenor],j, vetor[j]);
                indiceDoMenor = j;
            }
         }
         int temp = vetor [indiceDoMenor];
         vetor[indiceDoMenor] = vetor[i];
         vetor [i] = temp;
         System.err.printf("temp %d - vetor [indiceDoMenor] %d - vetor (i) %d \n",temp, vetor [i], vetor [indiceDoMenor]);
       }
    }
}
