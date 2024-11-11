//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.


public class Main {
    public static void main(String[] args) {
        int anoDeLancamento = 2022;
        boolean incluso = true;
        Double nota = 8.1;
        String sinopse;
        Double media = (9.8 + 8.3) / 2;
        sinopse = "filme de aventura com galã ";

        //faz o cast
        Double x = (double) anoDeLancamento;

        final Double temperatura = convertCelsiusFromFahrenheit(38.5);

        //%s = String
        //%d = inteiro
        //%f = double
        //%.2f = numero.00
        //%n ou /n = pula linha
        System.out.println("ano de lançamento : " + anoDeLancamento);
        System.out.printf("ano do filme: %d\nsinopse: %s\nestá incluso?: %s\n", anoDeLancamento, sinopse, incluso ? "sim" : "não");
        System.out.printf("temperatura em Fahrenheit: %.2f",temperatura);
    }

    public static double convertCelsiusFromFahrenheit(double celsius){
        return  (celsius * 1.8) + 32;
    }

}