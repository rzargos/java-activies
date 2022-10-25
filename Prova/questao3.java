import java.util.*;

public class questao3 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        String resposta;
        double soma, n1, n2;

        do {
            System.out.print("Digite o primeiro valor: ");
            n1 = input.nextDouble();
            System.out.print("Digite o segundo valor: ");
            n2 = input.nextDouble();
            soma = n1 + n2;
            System.out.println("A soma dos valores é: " + soma);

            System.out.print("Você deseja calcular outro valor? (S) ou (N): ");
            resposta = input.next();
        } while (resposta.equals("S"));
    }
}
