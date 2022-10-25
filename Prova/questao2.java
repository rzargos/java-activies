import java.util.*;

public class questao2 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int vet[] = new int[10];
        int i, soma = 0, n = 1;

        for (i = 0; i < 10; i++) {
            System.out.print(String.format("Digite o %sº valor: ", n));
            vet[i] = input.nextInt();

            if (vet[i] % 2 == 0) {
                soma = soma + vet[i];
            }
            n++;
        }
        System.out.println("A soma dos numeros pares é de: " + soma);
    }
}
