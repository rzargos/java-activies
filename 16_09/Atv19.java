import java.util.*;

public class Atv19 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        
        int num, count;

        count = 0;
        System.out.print("Digite um número inteiro e maior que 0: ");
        num = input.nextInt();

       while (count < num) {
        if (num%2 == 0) {
            num = num - 1;
            System.out.print("Os números ímpares antecessores são: "+num);
        } else {
            num = num - 2;
            System.out.print("Os números ímpares antecessores são: "+num);
        }
       }
    }
}
