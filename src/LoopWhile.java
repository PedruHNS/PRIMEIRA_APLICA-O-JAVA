import java.util.Scanner;

public class LoopWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double avaliacao = 0.0;
        double totalAvaliacao = 0.0;
        int qtdAvaliacao = 0;


        while (avaliacao != -1) {
            System.out.println("digita a nota ou -1 para finalizar");
            avaliacao = scanner.nextDouble();
            if (avaliacao != -1) {
                totalAvaliacao += avaliacao;
                qtdAvaliacao++;
            }
        }

        System.out.println("media: " + totalAvaliacao / qtdAvaliacao);
        scanner.close();
    }


}
