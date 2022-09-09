import java.util.*;

public class Atv5 {
    private static Scanner input = new Scanner (System.in);
    public static void main(String[] args) {
        double grauC, grauF;

        System.out.print("Digite a temperatura em ºC: ");
        grauC = input.nextDouble();

        grauF = (grauC * 1.8) + 32;

        System.out.print("A temperatura em ºF é: " + grauF + "ºF");
    }
}