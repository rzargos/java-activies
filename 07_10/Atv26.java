import java.util.*;

public class Atv26 {
    private static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {

        double vetor[] = new double[4], media = 0;
        int i = 0, n = 1;

        for (i = 0; i <= 3; i++) {
            System.out.print("Digite a " + n + "º nota: ");
            vetor[i] = input.nextDouble();
            media = media + vetor[i];
            n++;
        }

        for (i = 0; i <= 3; i++) {
            System.out.println("As notas são: " + vetor[i]);
        }

        media = media / 4;
        System.out.print("A média das notas é de: " + media);
    }
}