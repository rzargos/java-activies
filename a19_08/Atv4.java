import java.util.*;

public class Atv4 {
    private static Scanner input = new Scanner (System.in);
    public static void main(String[] args) {
        double dolvalue, dol, dolreal;

        System.out.print("Digite a cotação do dólar: ");
        dolvalue = input.nextDouble();

        System.out.print("Digite quantos dólares você tem: ");
        dol = input.nextDouble();

        dolreal = dol * dolvalue;
        System.out.print("Sua quantia em reais é: R$"+dolreal);
    }
}