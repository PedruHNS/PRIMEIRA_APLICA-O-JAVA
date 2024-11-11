import java.math.MathContext;
import java.util.Scanner;

public class Desafio4 {
    public static void main(String[] args) {

        // positiveOrNegative(10);
        //compareNumbers();
        //menuSelect();
        //tabuada();
        //checkNumber();

        final int fatorial = fatorial(5);
        System.out.println(fatorial);
    }


    public static void positiveOrNegative(int number) {
        if (number < 0) System.out.println(number + " negative");
        if (number > 0) System.out.println(number + " positive");
    }

    public static void compareNumbers() {
        final Scanner scanner = new Scanner(System.in);
        System.out.println("digite o 1º numero");
        int number1 = scanner.nextInt();
        System.out.println("digite o 2º numero");
        int number2 = scanner.nextInt();

        if (number1 == number2) {
            System.out.printf("%d == %d \n", number1, number2);
        } else {
            System.out.printf("%d != %d \n", number1, number2);
        }

        if (number1 < number2) {
            System.out.printf("%d < %d \n", number1, number2);
        } else {
            System.out.printf("%d > %d \n", number1, number2);
        }
        scanner.close();
    }

    public static void menuSelect() {
        final Scanner scanner = new Scanner(System.in);
        System.out.println("Digite: \n1. Calcular área do quadrado\n2. Calcular área do círculo");
        int select = scanner.nextInt();

        switch (select) {
            case 1:
                System.out.println("Digite o Lado do quadrado\n");
                double lado = scanner.nextDouble();
                final double areaQuarado = Math.pow(lado, 2);
                System.out.println(areaQuarado);
                break;
            case 2:
                System.out.println("Digite o Raio do circulo\n");
                double raio = scanner.nextDouble();
                final double areaCirculo = Math.PI * Math.pow(raio, 2);
                System.out.println(areaCirculo);
                break;
            default:
                System.out.println("não identificado");
        }
        scanner.close();
    }

    public static void tabuada() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("digite o numero para exibir a tabuada");
        int number = scanner.nextInt();

        for (int i = 1; i < 11; i++) {
            System.out.println(number * i);
        }
        scanner.close();
    }

    public static void checkNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um numero inteiro");
        int number = scanner.nextInt();
        if (number % 2 == 0) {
            System.out.println(number + ": par");
        } else {
            System.out.println(number + ": impar");
        }
    }

    public static int fatorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * fatorial(n - 1);
    }
}
