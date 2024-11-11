public class Desafio2 {
    public static void main(String[] args) {
        final double media = media(7.0, 5.0);
        final int casting = casting(6.8);
        final String concatenacao = concatenacao("Pedro", '?');
        final String valorTotal = valorTotal(8.50, 3);
        final String convertReal = convertFormReal(5.00);
        final Double desconto = desconto(600.00, 10);

        System.out.println(media);
        System.out.println(casting);
        System.out.println(concatenacao);
        System.out.println(valorTotal);
        System.out.println(convertReal);
        System.out.println(desconto);

    }

    //Crie um programa que realize a média de duas notas decimais e exiba o resultado.
    public static Double media(double nota1, double nota2) {
        return (nota1 + nota2) / 2;
    }

    //Declare uma variável do tipo double e uma variável do tipo int. Faça o casting da variável double para int e imprima o resultado.
    public static Integer casting(double decimal) {
        return (int) decimal;
    }

    //Declare uma variável do tipo char (letra) e uma variável do tipo String (palavra). Atribua valores a essas variáveis e concatene-as
    public static String concatenacao(String nome, char acentuacao) {
        return "olá " + nome + ",  tudo bem " + acentuacao;
    }

    //Declare uma variável do tipo double precoProduto e uma variável do tipo int (quantidade). Calcule o valor total multiplicando o preço do produto pela quantidade e apresente o resultado em uma mensagem.
    public static String valorTotal(Double precoProduto, int qtd) {
        return ("valor total" + precoProduto * qtd);
    }

    /*Declare uma variável do tipo double valorEmDolares.
    Atribua um valor em dólares a essa variável.
    Considere que o valor de 1 dólar é equivalente a 4.94 reais.
    Realize a conversão do valor em dólares para reais e imprima
    o resultado formatado.*/
    public static String convertFormReal(Double dolar) {
        return String.format("real %.2f", dolar * 4.94);
    }
    /*Declare uma variável do tipo double precoOriginal.
    Atribua um valor em reais a essa variável, representando
    o preço original de um produto. Em seguida, declare uma
    variável do tipo double percentualDesconto e atribua um valor
    percentual de desconto ao produto (por exemplo, 10 para 10%).
    Calcule o valor do desconto em reais, aplique-o ao preço original e
    imprima o novo preço com desconto.*/
    public static Double desconto(Double precoOriginal, int desconto) {
        final double valorDoDesconto = precoOriginal * desconto / 100;
        return precoOriginal - valorDoDesconto;
    }

}
