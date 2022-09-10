import java.util.*;

public class Atv12 {
    private static Scanner input = new Scanner (System.in);
    public static void main(String[] args) {

        double peso, altura, IMC;

        System.out.print("Escreva o seu peso (em Kg): ");
        peso = input.nextDouble();

        System.out.print("Escreve a sua altura (em metros): ");
        altura = input.nextDouble();

        IMC = peso / (altura*altura);

        if (IMC >= 40) {
            System.out.print("Você está com obesidade mórbida.");
        } else if (IMC >= 30 && IMC < 40) {
            System.out.print("Você está obeso.");
        } else if (IMC >= 25 && IMC < 30) {
            System.out.print("Você está com sobre peso.");
        } else if (IMC >= 20 && IMC < 25) {
            System.out.print("Você está com peso normal.");
        } else {
            System.out.print("Você está abaixo do peso");
        }
    }
}