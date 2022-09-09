import java.util.*;

public class Atv3 {
    private static Scanner input = new Scanner (System.in);
    public static void main(String[] args) {
        double b, h, A;

        System.out.print("Digite o valor da base do triângulo: ");
        b = input.nextDouble();
        
        System.out.print("Digite o valor da altura do triângulo: ");
        h = input.nextDouble();

        A = (b*h)/2;

        System.out.print("A área do triângulo é de: " + A);

    }
}
