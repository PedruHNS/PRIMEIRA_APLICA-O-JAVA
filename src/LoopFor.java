import java.util.Scanner;

public class LoopFor {
    public static void main(String[] args) {
        final Scanner leitura = new Scanner(System.in);

        double avaliacao;
        double total = 0.0;

        for (int i = 0; i < 3; i++) {
            System.out.printf("digite sua avaliação %d",i+1);
            avaliacao = leitura.nextDouble();
            total += avaliacao;

        }

        System.out.println("media final " + total/3);


    }

}
