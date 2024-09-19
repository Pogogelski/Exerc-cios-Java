//Fazer um programa que imprima a média aritmética dos números 8,9 e 7. A média dos números 4, 5 e 6. A soma das duas médias. A média das médias.
public class Main {
    public static void main(String[] args) {

        float numero7 = 7.0F;
        float numero8 = 8.0F;
        float numero9 = 9.0F;

        float media = numero7 + numero8 + numero9;
        float result = media / 3.0F;
        System.out.println("Media 1: " + result);

        float numero4 = 4.0F;
        float numero5 = 5.0F;
        float numero6 = 6.0F;

        float media1 = numero4 + numero5 + numero6;
        float result1 = media1 / 3.0F;
        System.out.println("Media 2: " + result1);

        float medias = result + result1;
        float resultado = medias / 2.0F;
        System.out.println("Resultado das 2 medias: " + resultado);
    }
}