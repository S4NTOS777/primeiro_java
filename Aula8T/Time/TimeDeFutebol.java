package Aula8T.Time;

public class TimeDeFutebol {
    String nomeDotime;
    int posicaoOcupada;
    Jogador[] jogadores = new Jogador[11];

    public void contratarjogador (Jogador novojogador){
        if (posicaoOcupada < jogadores.length){
            jogadores [posicaoOcupada] = novojogador;
            posicaoOcupada++;
            System.out.print("Contratação de "+ novojogador.nome + " feita com sucesso.\n " );
        }else {
            System.out.print("Não foi possível efetuar a contratação. ");
        }

        }


    public void exibirEscalacao() {
        for(int i = 0; i < posicaoOcupada;i++){
            System.out.printf("%d - Nome: %s  Posição: %s \n ", i+1, jogadores[i].nome, jogadores[i].pos);
        }
    }
    }
    


   


