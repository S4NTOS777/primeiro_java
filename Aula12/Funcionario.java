package Aula12;

public class Funcionario {
    String nome;
    double salario;
    
    public Funcionario(String nome, double salario) {
        this.nome = "Pedro";
        this.salario = 3000;
    }
    
    public double calcularInss (){
        return this.salario * 0.11;
    }

    public double calcularVt (){
       return this.salario* 0.06;
    } 
    public double salarioLiq (){
         double salarioLiqu;
        return salarioLiqu = salario - calcularInss() - calcularVt();

    }
}




