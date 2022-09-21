import java.util.*;

public class Atv19 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        int num;

        System.out.print("Digite um número inteiro e maior que 0: ");
        num = input.nextInt();
        String list = "";

        for (int count = 1; count <= num; count++) {
            if (count % 2 == 1) {
                if (count == 1) {
                    list = "" + count;
                } else {
                    list = list + ", " + count;
                }
            }
        }
        System.out.print(list);
    }
}