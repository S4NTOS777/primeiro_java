package Aula8.Escola;

public class Curso {
    String nomeDoCurso;
    String sigla;
    Aluno[] alunosMatriculados;
    int vagasOcupadas;

    public Curso (String nome, int TotalVagas){
        this.nomeDoCurso = nome;
        this.alunosMatriculados = new Aluno[TotalVagas];

    }
     public void Matricular (Aluno novAluno){
        if (vagasOcupadas < alunosMatriculados.length){
            alunosMatriculados [vagasOcupadas] = novAluno;
            vagasOcupadas++;
            System.out.print("Matrícula de" + novAluno.nome + " realizada. ");
        }else {
            System.out.print("Não há vagas disponíveis. ");
        }
     }



}

