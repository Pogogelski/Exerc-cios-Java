import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o seu peso em Kilos: ");
        float peso = sc.nextFloat();

        System.out.println("Digite o seu altura em metros, escreva com uso de VIRGULA: ");
        float altura = sc.nextFloat();

        float imc = peso / (altura * 2);

        if (imc < 17) {
            System.out.println("Muito abaixo do peso");
        }
        else if (imc < 19) {
            System.out.println("Abaixo do peso");
        }
        else if (imc < 24) {
            System.out.println("Peso Normal");
        }
        else if (imc < 30) {
            System.out.println("Peso Obeso");
        }
    }
}