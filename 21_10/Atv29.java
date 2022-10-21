import java.util.*;

public class Atv29 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        int vet[] = new int[5], vet2[] = new int[5];
        int i = 0, i2 = 4, n = 1;

        for (i = 0; i <= 4; i++) {
            System.out.print(String.format("Digite o %sº número: ",n));
            vet[i] = input.nextInt();
            vet2[i2] = vet[i];
            n++;
            i2--;
        }
    }
}