import java.util.Scanner;

public class DesafioFinal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final String tipoConta = "Corrente";
        final String nome = "Pedro Henrique";
        double saldo = 0;
        System.out.println("***********************");
        System.out.println("Nome: " + nome);
        System.out.println("Tipo da conta: " + tipoConta);
        System.out.printf("Saldo atual: R$: %.2f", saldo);
        System.out.println("\n***********************\n");

        System.out.println("""
                1- Consultar saldos
                2- Receber valor
                3- Transferir valor
                4- Sair
                """);
        System.out.println("Digite a opção desejada: ");

        int opcao = scanner.nextInt();
        while (opcao != 4) {
            switch (opcao) {
                case 1:
                    System.out.println(" ----------Consultar saldos----------");
                    System.out.printf("Saldo atual: R$: %.2f\n", saldo);
                    menu();
                    break;
                case 2:
                    System.out.println(" ----------Receber valor----------");
                    System.out.println("Digite o valor para deposito:\n");
                    double deposito = scanner.nextDouble();
                    saldo = deposito(deposito, saldo);
                    break;
                case 3:
                    System.out.println(" ---------Transferir valor--------");
                    System.out.println("digite o valor que seja transferir: \n");
                    final double transferir = scanner.nextDouble();
                    saldo = transferencia(transferir, saldo);
                    break;
                default:
                    System.out.println("inválido");
                    break;
            }
            opcao = scanner.nextInt();
        }
        System.out.println("----FINALIZADO----");
        scanner.close();
    }

    public static double deposito(double valor, double saldo) {
        if (valor <= 0) {
            System.out.println("não é possivel fazer deposito negativo ou 0");
            menu();
            return saldo += 0;

        } else {
            System.out.println("Deposito efetuado com sucesso!");
            menu();
            return saldo += valor;
        }

    }
    public static double transferencia(double valor, double saldo) {
        if (valor > saldo) {
            System.out.println("saldo insuficiente");
            menu();
            return saldo -= 0;
        } else if (valor == 0) {
            System.out.println("não é possivel transferir R$0.00");
            menu();
            return saldo -= 0;
        } else if (valor < 0) {
            System.out.println("não é possivel transferir um valor negativo");
            menu();
            return saldo -= 0;

        } else {
            System.out.println("transferido com sucesso!");
            menu();
            return saldo -= valor;
        }
    }
    private static void menu() {
        System.out.println(" ---------------------------------");
        System.out.println("""
                1- Consultar saldos
                2- Receber valor
                3- Transferir valor
                4- Sair
                """);
    }

}

