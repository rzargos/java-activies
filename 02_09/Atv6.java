import java.util.*;

public class Atv6 {
    private static Scanner input = new Scanner (System.in);
    public static void main(String[] args) {

        double nota1, nota2, soma, media;

        System.out.print("Escreva a nota da primeira prova: ");
        nota1 = input.nextDouble();
        System.out.print("Escreva a nota da segunda prova: ");
        nota2 = input.nextDouble();

        soma = nota1 + nota2;
        media = soma/2;

        if (media >= 7) {
            System.out.print("Parabéns! Você foi aprovado com uma nota média de: "+ media);
        } else {
            System.out.print("Infelizmente você foi reprovado, siga as instruções que foram enviadas no seui e-mail para garantir a sua rematrícula. A sua média foi de: "+ media);
        }
    }
}

