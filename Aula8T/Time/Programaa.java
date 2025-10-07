package Aula8T.Time;

import java.util.Scanner;

public class Programaa {
    public static void main(String[] args) {
        Jogador paraContrador [] = new Jogador[11];
        TimeDeFutebol Flamengo = new TimeDeFutebol();
        Scanner leia = new Scanner(System.in);

        for (int l = 0; l <paraContrador.length; l ++){
          System.out.print("Digite o nome do jogador: ");
            String nome = leia.next();
            System.out.print("Digite a posição do jogador: ");
            String pos = leia.next();
            paraContrador[l] = new Jogador(nome, pos);
            Flamengo.contratarjogador(paraContrador[l]);
        }

        Flamengo.exibirEscalacao();
        leia.close();
}
    
}
