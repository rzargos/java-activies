import java.util.*;

public class Atv24 {
    private static Scanner input = new Scanner (System.in);
    public static void main(String[] args) {

        int vetor[] = new int[5];
        int i = 0;

        for (i = 0; i <= 4; i++) {
            System.out.print("Digite um número: ");
            vetor[i] = input.nextInt();
        }

        for (i = 0; i <= 4; i++ ) {
            System.out.println(vetor[i]);
        }        
    }
}
