package Aula5;
import java.util.Scanner;
public class ListaDeCompras {
    public static void main(String[] args) {
        String [] produto = new String[5];
        Scanner leia = new Scanner(System.in);
       
     for (int i = 0; i<=4; i ++){
        System.out.print("Digite seu produto: ");
        produto[i]= leia.nextLine();
     }
     for (int l=0;l< produto.length; l++){
         System.out.println(produto[l]);
        }
        leia.close();
     }
    }