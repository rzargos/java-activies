import java.util.*;

public class Atv18 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        double  val;

        for (int numV = 1; numV <= 5; numV++) {
            System.out.print("Digite o valor: ");
            val = input.nextDouble();
            System.out.println("O dobro é: "+val*2);
        }
        System.out.println("[ERRO] Digite no máximo 5 valores!");
    }
}