import java.util.*;

public class Atv1 {
    private static Scanner input = new Scanner (System.in);
    public static void main(String[] args) {
        double n1, n2, media, soma;

        System.out.print("Digite a nota da primeira prova: ");
        n1 = input.nextDouble();

        System.out.print("Digite a nota da segunda prova: ");
        n2 = input.nextDouble();

        soma = n1 + n2;
        media = (n1+n2) / 2;
        System.out.print("Sua média é: " + media);
        System.out.print("A soma da suas notas é: " + soma);
    }
}