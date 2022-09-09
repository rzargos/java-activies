import java.util.*;

public class Atv13 {
    private static Scanner input = new Scanner (System.in);
    public static void main(String[] args) {

        int diaria, valor;

        System.out.print("Escreva quantas diárias você vai precisar: ");
        diaria = input.nextInt();

        if (diaria < 15) {
            valor = diaria * 500 + (diaria*15);
            System.out.print("O valor será de R$"+valor);
        } else if (diaria == 15) {
            valor = diaria * 500 + (diaria*10);
            System.out.print("O valor será de R$"+valor);
        } else {
            valor = diaria * 500 + (diaria*5);
            System.out.print("O valor será de R$"+valor);
        }
    }
}