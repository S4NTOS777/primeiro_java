package SGE;
import java.util.Scanner;
public class GerencEstoque {
    Scanner leia = new Scanner(System.in); 
    String nome;
    int produtosCadastrados;
    Produto[] produtos = new Produto[100];
    Produto cadastro;

    public void preencherCadastrar(){
        System.out.println("Iremos efetuar o cadastro");
        System.out.println("Digite o nome do novo produto: ");
        nome = leia.nextLine();
        System.out.println("Digite a categoria do novo produto: ");
        String categoria = leia.nextLine();
        System.out.println("Digite o valor do novo produto: ");
        System.out.println("Digite o código do novo produto: ");
        System.out.println("Digite a quantidade de estoque do novo produto: ");
    }
    public void cadastrarProduto (Produto novoProduto){
        if (produtosCadastrados < produtos.length){
            produtos [produtosCadastrados] = novoProduto;
            produtosCadastrados++;
            System.out.print("Contratação de "+ novoProduto.nome + " feita com sucesso.\n " );
        }else {
            System.out.print("Não foi possível efetuar a contratação. ");
        }

        }

    
    public static void main(String[] args) {
        
        int opcao;
    
        System.out.println("------- MENU DE INTERAÇÃO -------");
        System.out.println("1. Cadastrar");
        System.out.println("2. Buscar");
        System.out.println("3. Listar");
    
         opcao = leia.nextInt();
    
        switch (opcao) {
            case 1:
                
                break;
        
            default:
                break;
        }
    }
}
