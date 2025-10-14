package SGE;
import java.util.Scanner;
public class GerencEstoque {
    private static Produto[] produtos = new Produto[100];
    private static int produtosCadastrados=0;
    
    
    public static void preencherCadastrar(Scanner leia){
       Produto cadastro;
       String nome,categoria;
       int qtdEstoque;
       long codigo;
       double valor;
        System.out.println("Iremos efetuar o cadastro");
        System.out.println("Digite o nome do novo produto: ");
        nome = leia.next();
        System.out.println("Digite a categoria do novo produto: ");
        categoria = leia.next();
        System.out.println("Digite o valor do novo produto: ");
        valor= leia.nextInt();
        System.out.println("Digite o código do novo produto: ");
        codigo = leia.nextLong();
        System.out.println("Digite a quantidade de estoque do novo produto: ");
        qtdEstoque = leia.nextInt();
        cadastro = new Produto(nome,categoria,valor,codigo,qtdEstoque);
        cadastrarProduto(cadastro);
    }

    public static void cadastrarProduto (Produto novoProduto){
        if (produtosCadastrados < produtos.length){
            produtos [produtosCadastrados] = novoProduto;
            produtosCadastrados++;
            System.out.print("Cadastro de "+ novoProduto.nome + " feita com sucesso.\n " );
        }else {
            System.out.print("Não foi possível efetuar o cadastro. ");
        }
    }

    public static void listarProdutos(Produto[] lista){
         System.out.printf("Cod\tNome\tCategoria\tValor\tQtd Estoque\n");
        for(int i =0; i < produtosCadastrados; i++){
            System.out.printf("%d\t%s\t%s\t %.2f\t %d\n",produtos[i].codigo, produtos[i].nome,produtos[i].categoria, produtos[i].valor, produtos[i].qtdEstoque);
        }
    }
    
    
    public static void main(String[] args) {;
        Scanner leia = new Scanner(System.in); 
        int opcao;
        int escolha;
        long codigoProcurado;
        do {
            System.out.println("------- MENU DE INTERAÇÃO -------");
            System.out.println("1. Cadastrar");
            System.out.println("2. Buscar");
            System.out.println("3. Listar");
            System.out.println("4. Sair");

            opcao = leia.nextInt();
            switch (opcao) {
                case 1: 
                    preencherCadastrar(leia);
                    break;
                    
                    case 2:
                    System.out.println("Digite o código produto: "); 
                    codigoProcurado = leia.nextLong();
                    Busca.BuscaSequencialSGE(produtos, codigoProcurado);
                    
                    
                       
                case 3:// colocar escolha por código ou nome
                System.out.println("Escolha 1 para pesquisar por nome ou 2 para pesquisar por valor ");
                escolha= leia.nextInt();
                if (escolha==1){
                    Busca.selectionSortPorNomeSGE(produtos, produtosCadastrados);
                    listarProdutos(produtos);
                    }else if (escolha==2) {
                        Busca.bubllesort(produtos,produtosCadastrados);
                        listarProdutos(produtos);
                    }else{
                        System.out.println("Opção inválida ");
                    }
                    break;

                case 4:

            
                default:
                    break;
            }
        }

        while (opcao!=4);
            
        
       
    
    }
}
