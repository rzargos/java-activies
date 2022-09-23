import java.util.*;

public class Atv23 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        double quilos;
        int idade, quantPessoas90kg = 0, somaIdades = 0;
        
        for (int count = 1; count <= 7; count++) {
            System.out.print(String.format("Digite a idade da pessoa %s: ", count));
            idade = input.nextInt();
            System.out.print(String.format("Digite o peso da pessoa %s: ", count));
            quilos = input.nextDouble();
            if (quilos > 90) {
                quantPessoas90kg++;
            }
            somaIdades += idade;
        }
        System.out.println(String.format("%s tem peso maior que 90kg", quantPessoas90kg));
        System.out.println(String.format("A média de idade das pessoas é de %sKgs", somaIdades/7));
    }
}