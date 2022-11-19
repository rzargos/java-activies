import java.util.*;

public class Atv34 {
    private static Scanner input = new Scanner (System.in);
    public static void main(String[] args) {

        String material, cor;
        Double diametro;
        bola bola1 = new bola();

        System.out.print("Digite a cor: ");
        cor = input.next();
        bola1.setCor(cor);

        System.out.print("Digite o material: ");
        material = input.next();
        bola1.setMaterial(material);

        System.out.print("Digite o diâmetro: ");
        diametro = input.nextDouble();
        bola1.setDiametro(diametro);

        System.out.print(String.format("Você tem uma bola %s feita de %s e com diâmetro de %s.\n",bola1.getCor(cor),bola1.getMaterial(material),bola1.getDiametro(diametro)));
    }
}