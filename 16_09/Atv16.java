import java.util.*;

public class Atv16 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        double rA, n1, n2, n3, media;

        System.out.print("Escreva o RA do aluno:");
        rA = input.nextDouble();
        while (rA > 0) {
            System.out.print("Escreva a primeira nota: ");
            n1 = input.nextDouble();
            System.out.print("Escreva a segunda nota: ");
            n2 = input.nextDouble();
            System.out.print("Escreva a terceira nota: ");
            n3 = input.nextDouble();
            media = (n1 + n2 + n3) / 3;
            if (media >= 70) {
                System.out.print("O aluno foi aprovado.");
            } else if (media >= 60 && media < 70) {
                System.out.print("O aluno está de recuperação\n");
            } else {
                System.out.print("O aluno foi reprovado\n");
            }
            System.out.print("Escreva o RA do aluno:");
            rA = input.nextDouble();
        }
        System.out.println("Seu RA é inválido\n");
    }
}
