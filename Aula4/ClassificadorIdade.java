package Aula4;

public class ClassificadorIdade {
    public static void main(String[] args) {
        int idade = 71;

        if (idade<15){
            System.out.println("Criança");
        }else if (idade<18){
            System.out.println("Adolescente");
        }else if (idade>18 && idade <65){
            System.out.println("Adulto");
        }else if (idade>=65){
            System.out.println("Idoso");
       
        }
    }
    
}
