package Aula4;
import java.util.Scanner;

public class MediaNotas {
    public static void main(String[] args) {
       double nota;
       double media;
       double soma = 0;
       int cont = 0;
       Scanner leia = new Scanner(System.in);

       for (double i=0; i<=5; i++){
        System.out.print("Digite uma nota: ");
         nota = leia.nextDouble();
         if (nota <0){
            break;
        } else if (nota>10){
            continue;
            
        }else {
            soma +=nota;
            cont++;
        }
    }
    media = soma / cont;
    System.out.print(media);
        leia.close();
     }
    }
