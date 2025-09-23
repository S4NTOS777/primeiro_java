package Aula3;
public class DivisaoComResto {
    public static void main(String[] args) {
        int TotalDeItens = 17;
        int CapacidadeDeCaixa = 5;
        int resto;
        int divisao;
        divisao = TotalDeItens / CapacidadeDeCaixa;
        resto = TotalDeItens % CapacidadeDeCaixa;

        System.out.println("Será preenchidas "+ divisao+ " caixas ");
        System.out.println( "sobrarão "+ resto+ " itens");
    }
}
