import java.util.*;

public class Atv24 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

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
