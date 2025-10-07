package Aula7.SistemaEscolar;

public class Aluno2 {
    String nome;
    int matricula;
    double nota;

    void verificarNotas(){
            if (nota <=7){
                System.out.println("Reprovado. ");
            }else {
                System.out.println("Aprovado. ");
            }
        }
        void mostrarDados(int num){
            System.out.printf("Dados do %dº aluno são: \nNome: %s \nmatrícula: %d \nNota: %.2f\n ", nome,matricula,nota);
        }
}
