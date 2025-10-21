package Aula12Produto;

public class Produto {
    String nome;
    double valor;
    int qtd;

    public Produto() {
    }

    public Produto (String nome, double valor, int qtd){
        this.nome = nome;
        this.valor = valor;
        this.qtd = qtd;
    } 
    
    public double Icms (){
        return valor * 0.12;
    }
}
