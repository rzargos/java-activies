import java.util.*;

public class Atv30 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        int vet[] = new int[10], mais50[] = new int[10];
        int maior50 = 0, maiorMedia = 0, menorMedia = 0, maiorIgual18 = 0, i = 0, n = 1;
        double media = 0;

        for (i = 0; i <= 9; i++) {
            System.out.print(String.format("Digite a %sª idade: ", n));
            vet[i] = input.nextInt();

            if (vet[i] >= 18) {
                maiorIgual18++;
            }

            if (vet[i] > 50) {
                mais50[i] = n;
            }

            media = media + vet[i];
            n++;
        }

        for (i = 0; i <= 9; i++) {
            if (mais50[i] > 0) {
                System.out.format("A pessoa número %s tem idade maior que 50\n", mais50[i]);
            }
        }

        media = media / 10;

        for (i = 0; i <= 9; i++) {
            if (vet[i] > media) {
                maiorMedia++;
            } else {
                menorMedia++;
            }
            if (vet[i] > 50) {
                maior50++;
            }
        }

        if (maior50 > 0) {

            System.out.format("A quantidade de pessoas com idade superior a 50 foi de %s\n", maior50);
        }

        if (maiorIgual18 > 0) {
            System.out.format("Existem %s pessoas com a idade maior ou igual a 18\n", maiorIgual18);
        }

        System.out.format("A média das idades foi %s\n", media);
        System.out.format("A quantidade de pessoas com idade maior que a média foi de %s\n", maiorMedia);
        System.out.format("A quantidade de pessoas com idade abaixo da média foi de %s\n", menorMedia);

    }
}