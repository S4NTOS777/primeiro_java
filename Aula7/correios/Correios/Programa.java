package Aula7.correios.Correios;
public class Programa {
    public static void main(String[] args) {
        
        Endereco endDoPedro = new Endereco();
        endDoPedro.rua = "Rua IPU";
        endDoPedro.numero = 572;
        endDoPedro.cep = "25730-460";
        endDoPedro.cidade = "Petrópolis";

        Pessoa Pedro = new Pessoa();
        Pedro.nome = "Pedro Henrique";
        Pedro.cpf = "250.150.057-67";

        Pedro.endereco = endDoPedro;

        System.out.print("O "+ Pedro.nome + " mora na cidade de "+ Pedro.endereco.cidade);

    }
}
