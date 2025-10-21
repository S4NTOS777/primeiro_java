package Aula12;

public class Programa {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Pedro", 3000);
        System.out.println("Nome: " + funcionario.nome + " \nSalário: " + funcionario.salario + "\nINSS: " + funcionario.calcularInss() + "\nVale Trasnporte: " + funcionario.calcularVt() + "\nSalário Líquido: " + funcionario.salarioLiq());        

    }
}
