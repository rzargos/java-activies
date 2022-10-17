import java.util.*;

public class Atv28 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        double vet[] = new double [10], media = 0;
        int i = 0, count1 = 1, count2 = 1;

        for (i = 0; i <= 9; i++) {
            System.out.print(String.format("Digite a nota do %sº aluno: ",count1));
            vet[i] = input.nextDouble();
            media = media + vet[i];
            count1++;
        }

        media = media / 10;
        System.out.println("A média das notas é: " + media);

        for (i = 0; i <= 9; i++) {
            if (vet[i] < media) {
                System.out.println(String.format("O aluno %s ficou abaixo da média, sua nota foi: %s", count2, vet[i]));
            } else {
                System.out.println(String.format("O aluno %s ficou acima média, sua nota foi: %s",count2 ,vet[i]));
            }
            count2++;
        }
    }
}
