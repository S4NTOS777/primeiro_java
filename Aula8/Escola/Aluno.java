
package Aula8.Escola;

public class Aluno {
    String nome;
    int matricula;
    double nota;

    public Aluno (String nome,int matricula){
        this.nome = nome;
        this.matricula = matricula;
       
    }

    void verificarNotas(){
            if (nota <=7){
                System.out.println("Reprovado. ");
            }else {
                System.out.println("Aprovado. ");
            }
        }
      
}


