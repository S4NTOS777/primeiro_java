package Aula4;

public class VerificadorDePermissao {
    public static void main(String[] args) {
        double alt = 1.54;
        boolean acomp = false;

        if (alt<1.60 & acomp == true){
            System.out.println("Entrada liberada pois está acompanhado");
        }
        else if (alt<1.60 & acomp == false){
            System.out.println("Entrada proibida");
        }
        else if (alt>1.60){
            System.out.println("Entrada liberada");
        }
    }
}
