package Aula11.SetGet;
import java.util.Scanner;
public class Clinica {
    public static void main(String[] args) {
        double consulta;
        Scanner leia = new Scanner(System.in);
        Medico medico1 = new Medico("Pedro", 158490, 0 , 250);
        Medico medico2 = new Medico("Carlo", 992668, 0, 300);
        Medico medico3 = new Medico("Paulo", 21213, 0,400);

        System.out.println("--- Sistema Clinica---");
        System.out.printf("Adicione o novo valor da consulta do médico %s: ", medico1.getNome());
        if (leia.hasNextDouble()){
           consulta = leia.nextDouble();
           System.out.println(consulta + "Valor digitado");
           medico1.setValorConsulta(consulta);
        }else {
            System.out.println("Entrada inválida");
        }



        medico1.PagDinheiro(medico1.getValorConsulta());
        medico2.PagPlano(medico2.getValorConsulta());
        medico3.PagPlano(medico3.getValorConsulta());
    
        System.out.println("Nome: " + medico1.getNome() + " Salário: " + medico1.getSalario());
        System.out.println("Nome: " + medico2.getNome() + " Salário: " + medico2.getSalario());
        System.out.println("Nome: " + medico3.getNome() + " Salário: " + medico3.getSalario());
    }
}
