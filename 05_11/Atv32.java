import java.util.*;

public class Atv32 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        int matriz[][] = new int[2][2];
        int soma;

        for (int h = 0; h < 2; h++) {
            for (int v = 0; v < 2; v++) {
                System.out.println("Insira um valor inteiro");
                matriz[h][v] = input.nextInt();
            }
        }
        
        for (int h = 0; h < 2; h++) {
            soma = 0;
            for (int v = 0; v < 2; v++) {
                soma = soma + matriz[h][v];
            }
            System.out.println(soma);
        }
    }
}