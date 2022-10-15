import java.util.*;

public class Atv27 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        double vet[] = new double[10], notaMaior = 0, notaMenor = 0, alunoMelhor = 0, alunoPior = 0;
        int i = 0;

        for (i = 0; i <= 9; i++) {
            System.out.print("Digite a nota do aluno: ");
            vet[i] = input.nextDouble();

            if (i == 0) {
                notaMaior = vet[i];
                notaMenor = vet[i];
                alunoMelhor = vet[i];
                alunoPior = vet[i];

            } else {
                if (vet[i] > notaMaior) {
                    notaMaior = vet[i];
                    alunoMelhor = i + 1;
                }
                if (vet[i] < notaMenor) {
                    notaMenor = vet[i];
                    alunoPior = i + 1;
                }
            }
        }
        System.out.println(String.format("A maior nota é %s", notaMaior));
        System.out.println(String.format("A menor nota é %s", notaMenor));
        System.out.println(String.format("O aluno com a maior nota foi o aluno: %s", alunoMelhor));
        System.out.println(String.format("O aluno com a menor nota foi o aluno: %s", alunoPior));

    }
}