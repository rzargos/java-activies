import java.util.*;

public class Atv25 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int vetor[] = new int [10];
        int i = 0;

        for (i = 0; i <= 9; i++) {
            System.out.print("Digite um número: ");
            vetor[i] = input.nextInt();
        }

        for (i = 9; i >= 0; i--) {
            System.out.println(vetor[i]);
        }

    }
}