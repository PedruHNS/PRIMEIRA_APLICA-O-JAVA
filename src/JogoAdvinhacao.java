import java.util.Random;
import java.util.Scanner;

public class JogoAdvinhacao {
    public static void main(String[] args) {
        int random = new Random().nextInt(10);
        int attempt = 0;
        boolean finish = false;

        final Scanner scanner = new Scanner(System.in);

        while (!finish) {

            System.out.printf("tentativa (%d)", attempt + 1);
            final int number = scanner.nextInt();

            if (number > random) {
                System.out.printf("%d > ??\n", number);
            } else if (number < random) {
                System.out.printf("%d < ??\n", number);
            } else {
                System.out.printf("%d == %d\n", number, random);
                finish = true;
            }

            attempt++;
            if (attempt == 5) {
                finish = true;
                System.out.println("tentativa esgotada: " + random);
            }
        }
    }
}

