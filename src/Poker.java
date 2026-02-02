import java.util.Random;

public class Poker {
    public static void play() {
        machineThrow();
        humanThrow();
        Random random = new Random();

        System.out.println(
            (random.nextInt(6) + 1) + " " +
            (random.nextInt(6) + 1) + " " +
            (random.nextInt(6) + 1) + " " +
            (random.nextInt(6) + 1) + " " +
            (random.nextInt(6) + 1)
        );
    }
    public static void machineThrow() {
         Random random = new Random();

        System.out.println("gép: " +
            (random.nextInt(6) + 1) + " " +
            (random.nextInt(6) + 1) + " " +
            (random.nextInt(6) + 1) + " " +
            (random.nextInt(6) + 1) + " " +
            (random.nextInt(6) + 1)
        );

    }
    public static void humanThrow() {
         Random random = new Random();

        System.out.println("ember: " +
            (random.nextInt(6) + 1) + " " +
            (random.nextInt(6) + 1) + " " +
            (random.nextInt(6) + 1) + " " +
            (random.nextInt(6) + 1) + " " +
            (random.nextInt(6) + 1)
        );

    }
}
