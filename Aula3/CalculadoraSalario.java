package Aula3;

public class CalculadoraSalario {
    public static void main(String[] args) {
        String nome = "Pedro";
        float salario = 2787;
        float resultado;
        if (salario<= 1751.81){
            resultado = salario - salario * 0.08f;
            System.out.println("Olá "+ nome+ ". Seu salário é de R$"+ resultado);
        }else if (salario<=2919.72){
            resultado = salario - salario * 0.09f;
            System.out.println("Olá "+ nome+ ". Seu salário é de R$"+ resultado);
        }
        else if (salario <= 5839.45){
            resultado = salario - salario * 0.10f;
            System.out.println("Olá "+ nome+ ". Seu salário é de R$"+ resultado);
        }
        else if (salario>5839.45){
            resultado = salario - salario * 0.11f;
            System.out.println("Olá "+ nome+ ". Seu salário é de R$"+ resultado);
        }
       
    }
}
