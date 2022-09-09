import java.util.*;

public class Atv8 {

        private static Scanner input = new Scanner (System.in);
        public static void main(String[] args) {

            double num;

            System.out.print("Escreva o número desejado: ");
            num = input.nextDouble();

            if (num < 0) {
                System.out.print("Seu número é negativo");
            } else {
                System.out.print("Seu número é positivo");
            }
        }
    }