import java.util.Scanner;

public class Exercicio {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int anos = 0;
        int meses = 0;
        int dias = 0;
        int totalDias = 0;

        System.out.println(
                "\nVamos calcular quantos dias de vida voce tem. \nInforme os dados a seguir: quantos anos vc tem?");
        anos = scan.nextInt();

        System.out.println("Quantos meses?");
        meses = scan.nextInt();

        System.out.println("Quantos dias?");
        dias = scan.nextInt();

        totalDias = ((anos * 365) + (meses * 30) + dias);

        System.out.println("vc ja viveu: " + totalDias + " dias");
    }

}
