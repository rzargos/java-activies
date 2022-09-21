import java.util.*;

public class Atv20 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        double temp = 0, media, tempS = 0;


        for (int count = 1; count <= 10; count++) {
            System.out.print("Digite a temperatura: ");
            temp = input.nextDouble();
            tempS = tempS + temp;
        }
        media = tempS / 10;
        System.out.print("A média de temperatura foi de: "+media);
    }
}
