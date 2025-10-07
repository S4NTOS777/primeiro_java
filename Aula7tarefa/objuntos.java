package Aula7tarefa;
public class objuntos {
    public static void main(String[] args) {
        Autor autor2 = new Autor("Pedro", "Eslovaco");
        autor2.nome = "Pedro";
        autor2.nacionalidade = "Eslovaco";

        Livro livro2 = new Livro("Como curar a calvície", 2025, autor2);
        

        System.out.print("O livro "+ "'"+livro2.titulo+"'" + " foi escrito por um "+ autor2.nacionalidade+" chmado "+ autor2.nome + ", publicado  no ano de "+ livro2.anoPub);
    }
}