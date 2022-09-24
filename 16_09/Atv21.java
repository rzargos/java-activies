import java.util.*;

public class Atv21 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String sexo;
        double peso;
        int countF = 0, countM = 0;

        for (int count = 1; count <= 10; count++) {
            System.out.print("Digite o seu sexo: (M) ou (F): ");
            sexo = input.next();
            if (sexo.equals("M") || sexo.equals("F") ) {
                System.out.print("Digite o seu peso: (em Kg's): ");
                peso = input.nextDouble();
                if (sexo.equals("M") && peso >= 60 && peso <= 80) {
                    countM++;
                } else if (sexo.equals("F") && peso >= 50 && peso <= 70) {
                    countF++;
                }
            } else {
                System.out.println("Digite um sexo válido!");
            }
        }
        System.out.println("Existem "+countM +" pessoas do sexo masculino que estão com peso entre 60 e 80");
        System.out.println("Existem "+countF +" pessoas do sexo feminino que estão com peso entre 60 e 80");
    }
}
