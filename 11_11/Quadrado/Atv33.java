import java.util.*;

public class Atv33 {
    private static Scanner input = new Scanner (System.in);
    public static void main(String[] args) {
        quadrado quadrado1 = new quadrado();
        
        double l, a;

        System.out.print("Digite o valor do lado: ");
        l = input.nextDouble();
        quadrado1.setLado(l);

        System.out.println(String.format("O valor do lado digitado foi de: %s\n", quadrado1.getLado(l)));
        a = quadrado1.calcularArea();

        System.out.println(String.format("A área de um quadrado de lado %s é de %s", l, a));        
    }
}