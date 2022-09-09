import java.util.*;

public class Atv11 {

    private static Scanner input = new Scanner (System.in);
    public static void main(String[] args) {

        double n1, n2, n3, media;

        System.out.print("Escreva a nota da primeira prova: ");
        n1 = input.nextDouble();

        System.out.print("Escreva a nota da segunda prova: ");
        n2 = input.nextDouble();

        System.out.print("Escreva a nota da terceira prova: ");
        n3 = input.nextDouble();

        media = (n1 + n2 + n3) / 3;

        if (media <= 10 && media >= 7) {
            System.out.print("Você foi aprovado!");
        } else if (media < 7 && media >= 3) {
            System.out.print("Você terá que fazer um exame especial!");
        } else if (media < 3 && media >= 0) {
            System.out.print("Você foi reprovado!");
        } else {
            System.out.print("Nota inválida!");
        }
    }
}