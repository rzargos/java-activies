import java.util.*;

public class Atv7 {

        private static Scanner input = new Scanner (System.in);
        public static void main(String[] args) {

            double n1, n2;

            System.out.print("Escreva o primeiro número: ");
            n1 = input.nextDouble();

            System.out.print("Escreva o segundo número: ");
            n2 = input.nextDouble();

            if (n1 == n2) {
                System.out.print("Os números são iguais");
            } else if (n1 > n2) {
                System.out.print("O maior número é: "+ n1);
            } else {
                System.out.print("O maior número é: "+ n2);
            }
    
    }
}