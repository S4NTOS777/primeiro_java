package Aula13;

    public class Vacina {
     private Pessoa [] elementos;
     private int tamanho;
     private int inicio;
     private int fim;
   
    public Vacina (int capacidade){
        elementos = new Pessoa[capacidade];
        tamanho = 0;
        inicio = 0;
        fim = 0;
    
    }
    public boolean estaVazia (){
        return tamanho == 0;
    }
    public boolean estaCheia (){
        return tamanho == elementos.length;
    }
    public void enfileirar (Pessoa p){
        if (estaCheia()){
            System.out.println("A fila está cheia!");
            return;
        }
        elementos [fim] = p;
        fim = (fim +1)% elementos.length;
        tamanho++;
    }
    public Pessoa desenfileirar (){
        if (estaVazia()){
            System.out.println("A fila está vazia !");
            return null;
        }
        Pessoa p = elementos[inicio];
        inicio = (inicio + 1)% elementos.length;
        tamanho--;
        return p;
    }
    public void exibir(){
        if (estaVazia()){
            System.out.println("A fila está vazia !");
            return;
        }
        for (int i = 0; i < tamanho; i ++){
            int index = (inicio + i) % elementos.length;
            System.out.println(elementos[index]);
        }
    }
}
   
        
        
    

