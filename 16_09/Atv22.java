import java.util.*;

public class Atv22 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        double nota, notaMaior = 0, notaMenor = 0;

        for (int count = 1; count <= 5; count++) {
            System.out.print("Digite a nota: ");
            nota = input.nextDouble();
            if (count == 1) {
                notaMenor = nota;
                notaMaior = nota;
            } else {
                if (nota > notaMaior) {
                    notaMaior = nota;
                } if (nota < notaMenor) {
                    notaMenor = nota;
                }
            }
        }
        System.out.println("A maior nota é: "+notaMaior);
        System.out.println("A menor nota é: "+notaMenor);
    }
}