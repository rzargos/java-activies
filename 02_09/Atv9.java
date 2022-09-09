import java.util.*;

public class Atv9 {

    private static Scanner input = new Scanner (System.in);
    public static void main(String[] args) {
        int hour;
        double valueHour, sal;

        System.out.print("Escreva quantas horas você trabalhou este mês: ");
        hour = input.nextInt();

        System.out.print("Escreva o valor de cada hora de trabalho: ");
        valueHour = input.nextDouble();

        sal = hour * valueHour;

        if (sal < 2000) {
            System.out.print("ABONO");
        } else {
            System.out.print("Seu salário esse mês foi de: "+ sal);
        }
    }
} 