package Aula10.Buscador;


public class Programa {
    public static void main(String[] args) {
        item[] itens = {
            new item ("Uva",10),
            new item ("Maçã",8),
            new item ("Pera",12),
            new item ("Arroz",9),
            new item ("Batata",12),
            new item ("Milho",12),
           
        };
        for (int i = 0; i <itens.length;i ++){
            System.out.println (" - Nome: "+ itens[i].nome + " Valor: " + itens[i].valor );
        }
        BuscaObj.selecionSortNome(itens);
        System.out.print("\n\n\n");
        for (int i = 0; i <itens.length;i ++){
            System.out.println (" - Nome: "+ itens[i].nome + " Valor: " + itens[i].valor );
      }
    }
}
