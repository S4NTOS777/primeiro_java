import java.util.Scanner;
public class Sobremome {
    public static void main(String[]args){
        Scanner leia = new Scanner(System.in);
        System.out.println ("Digite o seu nome :");
        System.out.println ("Digite o seu sobrenome :");
        String nome = leia.nextLine();
        String sobrenome = leia.nextLine();
        System.out.println("olá, "+ nome  +  sobrenome + "!\n");
        leia.close();
    }
}