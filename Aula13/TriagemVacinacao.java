package Aula13;

public class TriagemVacinacao {
    public static void main(String[] args) {
        Vacina filaPrincipal = new Vacina(5);
        filaPrincipal.enfileirar(new Pessoa ("Ana", 25));
        filaPrincipal.enfileirar(new Pessoa ("Pedro", 19));
        filaPrincipal.enfileirar(new Pessoa ("Carlo", 21));
        filaPrincipal.enfileirar(new Pessoa ("Rose", 85));
        filaPrincipal.enfileirar(new Pessoa ("Priscila", 75));

        Vacina filaPrioridade = new Vacina(5);
        Vacina filaComum = new Vacina(5);

        while (!filaPrincipal.estaVazia()) {
          Pessoa p = filaPrincipal.desenfileirar();
          System.out.println(p);
          
          if (p.getIdade() >= 60){
            filaPrioridade.enfileirar(p);
          }else{
            filaComum.enfileirar(p);
          }
          System.out.println("---- Fila Prioridade ----");
          filaPrioridade.exibir();

          System.out.println("\n---- Fila Comum ----");
          filaComum.exibir();
        }
    }
}
