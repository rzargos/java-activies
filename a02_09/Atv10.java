import java.util.*;

public class Atv10 {

    private static Scanner input = new Scanner (System.in);
    public static void main(String[] args) {

        double temp;

        System.out.print("Escreva a temperatura em ºC: ");
        temp = input.nextDouble();

        if (temp >= 30) {
            System.out.print("O clima hoje é de calor");
        } else if (temp < 30 && temp >= 20) {
            System.out.print("O clima hoje é normal");
        } else {
            System.out.print("O clima hoje é frio");
        }

    }
}