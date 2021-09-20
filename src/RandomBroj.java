import java.util.Random;
import java.util.Scanner;
import static java.lang.Math.random;

public class RandomBroj {

    public static void main(String[] args) {
        int slucajniBroj = (int) (Math.random() * 10);
        Scanner scanner = new Scanner(System.in);
        int guess;
        int attempts;
        attempts = 1;
        do {
            System.out.println("Unesite broj: ");
            guess = scanner.nextInt();

            if (guess == slucajniBroj)
                System.out.println("Pogodak, trazeni broj je "+ guess +" pogodili ste iz "+ attempts +" pokusaja ");
            else if (guess < slucajniBroj) {
                System.out.println("Broj je premali.");
                attempts +=1;
            }
            else if (guess > slucajniBroj) {
                System.out.println("Broj je prevelik.");
                attempts += 1;
            }

        } while (guess != slucajniBroj);
    }
}
