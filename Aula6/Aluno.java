package Aula6;

public class Aluno {
        
        String nome;
        int matricula;
        double notaFinal;

        public static void main (String[]args){
            Aluno aluno1 = new Aluno();
            
            aluno1.nome = "Pedro Terra";
            aluno1.matricula = 777;
            aluno1.notaFinal = 8.5;

            System.out.println ("Nome do aluno: " + aluno1.nome);
            System.out.println("Matrícula do aluno: " + aluno1.matricula);
            System.out.println ("Nota final: " + aluno1.notaFinal);
        }
    }