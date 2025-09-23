package Aula3;

public class ConversorDeMoeda {
    public static void main(String[] args) {
        double ValorEmdolar = 49.15;
        double TaxaDeCambio = 5.34;
        double Real = 262.5;
        Real = ValorEmdolar / TaxaDeCambio;

        System.out.println("O valor em reais (R$) é:" + Real);
       

    }
}
