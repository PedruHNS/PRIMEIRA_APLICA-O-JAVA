public class CondicionalSwitchIf {
    public static void main(String[] args) {
        int year = 2024;
        final boolean incluso = true;
        final Double nota = 8.1;
        String tipoPlano = "plus";

        System.out.println("if");
        if (year == 2022 || tipoPlano.equals("plus")) {
            System.out.println("filme liberado");
        } else {
            System.out.println("filme não liberado");
        }

        System.out.println("switch");
        switch (year) {
            case 2024:
                System.out.println("lançamento");
                break;
            case 1999:
                System.out.println("antigo");
                break;
            default:
                System.out.println("não informado");
                break;
        }
    }
}
