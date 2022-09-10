import java.util.*;

public class Atv14 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        String sexo;
        int idade;

        System.out.print("Escreve o seu sexo (F ou M): ");
        sexo = input.next();

        System.out.print("Escreva a sua idade: ");
        idade = input.nextInt();

        if (sexo.equals("M")) {
            if (idade <= 15) {
                System.out.print("Sua mensalidade é de R$60,00");
            } else if (idade >= 16 && idade <= 18) {
                System.out.print("Sua mensalidade é de R$75,00");
            } else if (idade >= 19 && idade <= 30) {
                System.out.print("Sua mensalidade é de R$90,00");
            } else if (idade >= 31 && idade <= 40) {
                System.out.print("Sua mensalidade é de R$85,00");
            } else {
                System.out.print("Sua mensalidade é de R$80,00");
            }
        }

        if (sexo.equals("F")) {
            if (idade <= 18) {
                System.out.print("Sua mensalidade é de R$60,00");
            } else if (idade >= 19 && idade <= 25) {
                System.out.print("Sua mensalidade é de R$90,00");
            } else if (idade >= 26 && idade <= 40) {
                System.out.print("Sua mensalidade é de R$85,00");
            } else {
                System.out.print("Sua mensalidade é de R$80,00");
            }
        }
    }
}