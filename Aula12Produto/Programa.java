package Aula12Produto;
import java.util.Scanner;
public class Programa {
    public static void main(String[] args) {
      Scanner  leia = new Scanner(System.in);
        Produto produto = new Produto();
        char resposta = 's';
        
        do {
         System.out.print("Digite o nome do produto: ");
         produto.nome = leia.next();
         System.out.print("Digite o valor do produto: ");
         produto.valor = leia.nextDouble();
         System.err.print("Digite a quantidade de estoque do produto: ");
         produto.qtd = leia.nextInt();
         System.out.print("ICMS: " + produto.Icms());
         System.out.print("\nDeseja continuar o programa? (s / n)");
         resposta = leia.next().charAt(0);
            
        }
        while (resposta !='n');
     leia.close();
  }
}