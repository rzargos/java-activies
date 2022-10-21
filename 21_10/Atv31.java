import java.util.*;

public class Atv31 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        int rating, quantidade = 0, quantidadeMax = 0;
        double media = 0;


        do {
            System.out.print("Digite uma nota entre 1 e 5 para avaliar o atendimento: ");
            rating = input.nextInt();
            if (rating > 0) {
            quantidade++;
            media = media + rating;
            }

            if (rating == 5) {
                quantidadeMax++;
            }

        } while (rating > 0);

        media = media / quantidade;
        System.out.format("A quantidade da avaliações foi de: %s\n",quantidade);
        System.out.format("A média das avaliações foram de %s\n",media);
        System.out.format("Tiveram %s avaliaões com 5 estrelas\n",quantidadeMax);

    }
}