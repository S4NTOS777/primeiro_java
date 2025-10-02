package Aula6;
import java.util.Scanner;

public class Produto {
    String nome;
    int codigo;
    double preco;
    
    public static void main(String[] args) {
        Produto produto1 = new Produto();
        Scanner leia = new Scanner(System.in);

        System.out.print("Digite o nome do produto: ");
        produto1.nome= leia.nextLine();
        System.out.print("Digite o código do produto: ");
        produto1.codigo= leia.nextInt();
        System.out.print("Digite o preço do produto: ");
        produto1.preco= leia.nextDouble();
        
        System.out.print ("\nNome do produto: " +produto1.nome );
        System.out.print("\nCódigo do produto: " + produto1.codigo );
        System.out.print ("\nPreço do produto: R$"+ produto1.preco );

        leia.close();
    }
}
