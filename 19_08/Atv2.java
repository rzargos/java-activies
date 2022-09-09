import java.util.*;

public class Atv2 {
    private static Scanner input = new Scanner (System.in);
    public static void main(String[] args) {
        double sal, salNew;

        System.out.print("Digite o seu salário: ");
        sal = input.nextDouble();
        salNew = sal*1.25;

        System.out.print("Seu salário com 25% de aumento será de R$ " + salNew);

    }
}
