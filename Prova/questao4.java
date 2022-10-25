import java.util.*;

public class questao4 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        double vet[] = new double[10], media = 0, alunoMais = 0, alunoMenos = 0, soma = 0;
        int i = 0, n = 1;

        for (i = 0; i <= 9; i++) {
            System.out.print(String.format("Digite a nota do aluno %s: ", n));
            vet[i] = input.nextDouble();
            n++;

            soma = soma + vet[i];
        }

        media = soma / 10;

        for (i = 0; i <= 9; i++) {
            if (vet[i] > media) {
                alunoMais++;
            } else if (vet[i] < media) {
                alunoMenos++;
            }
        }

        System.out.format("A média das notas foi de: %s\n", media);
        System.out.format("A quantidade de alunos que tiveram a nota maior que a média foi de: %s\n", alunoMais);
        System.out.format("A quantidade de alunos que tiveram a nota menor que a média foi de: %s\n", alunoMenos);
    }
}
