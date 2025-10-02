package Aula6;
import java.util.Scanner;
public class Aluno2 {
    String nome;
    int matricula;
    double nota;

public static void main(String[] args) {
    Aluno2 [] turma = new Aluno2 [3];
    Scanner leia = new Scanner(System.in);

    for(int l = 0; l < turma.length; l ++){
        turma[l] = new Aluno2();
        System.out.printf("Digite o nome do %dº aluno: ", l+1);
        turma[l].nome = leia.next();
        System.out.printf("Digite o número da matrícula do %dº aluno: ",l+1);
        turma[l].matricula = leia.nextInt();
        System.out.printf("Digite a nota do %dº aluno: ",l+1);
        turma[l].nota = leia.nextDouble();
    }
    for (int l = 0; l<turma.length;l++){
        System.out.printf("Dados do %dº aluno são: \nNome: %s \nmatrícula: %d \nNota: %.2f\n ",l+1, turma[l].nome,turma[l].matricula,turma[l].nota);
        
     }
    leia.close();
}
}