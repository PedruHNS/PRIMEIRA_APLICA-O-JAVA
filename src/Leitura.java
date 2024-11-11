import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite um filme");

        String filmeNextLine = leitura.nextLine();
        System.out.println(filmeNextLine);


        System.out.println("Digite o ano");
        int ano = leitura.nextInt();
        System.out.println(ano);


        System.out.println("Digite a nota");
        double avalicao = leitura.nextDouble();
        System.out.println(avalicao);

        leitura.close();
    }
}
