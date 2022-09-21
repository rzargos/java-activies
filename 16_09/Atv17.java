import java.util.*;

public class Atv17 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        double sal, numF, salT, numFT, mediaS, mediaF;
        int count;

        System.out.print("Escreva o valor do seu salário: ");
        sal = input.nextDouble();
        salT = sal;
        count = 0;
        numFT = 0;

        while (sal > 0) {
            System.out.print("Escreva quantos filhos você tem: ");
            numF = input.nextDouble();
            System.out.print("Escreva o valor do seu salário: ");
            sal = input.nextDouble();
            if (sal > 0) {
                salT = salT + sal;
            }
            numFT = numF + numFT;
            count++;
        }

        mediaS = salT / count;
        mediaF = numFT / count;
        System.out.print("A média de salário da população é de: R$"+mediaS+"\n");
        System.out.print("A média do número de filhos da população é de: "+mediaF+"\n");
    }
}
