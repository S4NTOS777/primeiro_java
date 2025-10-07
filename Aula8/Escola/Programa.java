package Aula8.Escola;
import java.util.Scanner;
public class Programa {
    public static void main(String[] args) {
        
        Curso Senai = new Curso("Curso TI", 10);
        String nome;
        int mat;
        Scanner leia = new Scanner(System.in);
        
        System.out.print("Digite o nome do aluno: ");
        nome = leia.next();
        System.out.print("Digite a matrícula do aluno: ");
        mat = leia.nextInt();

        Aluno novAluno = new Aluno(nome, mat);
        Senai.Matricular(novAluno);
        leia.close();
    }
}

