import java.util.*;

public class Atv15 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        String tipo;
        int dia;
        double valor;

        System.out.print("Escreva se foi um apartamento simples ou duplo (S ou D): ");
        tipo = input.next();

        System.out.print("Escreva a quantidade de diária: ");
        dia = input.nextInt();
        

        if (tipo.equals("S")) {
            if (dia < 10) {
                valor = 100 * dia;
                System.out.print("O valor a ser pago é de: R$"+valor);
            } else if (dia >= 10 && dia <= 15) {
                valor = 90 * dia;
                System.out.print("O valor a ser pago é de: R$"+valor);
            } else if (dia > 15) {
                valor = 80 * dia;
                System.out.print("O valor a ser pago é de: R$"+valor);
            }
        }

        if (tipo.equals("D")) {
            if (dia < 10) {
                valor = 140 * dia;
                System.out.print("O valor a ser pago é de: R$"+valor);
            } else if (dia >= 10 && dia <= 15) {
                valor = 120 * dia;
                System.out.print("O valor a ser pago é de: R$"+valor);
            } else if (dia > 15) {
                valor = 100 * dia;
                System.out.print("O valor a ser pago é de: R$"+valor);
            }
        }
    }
}