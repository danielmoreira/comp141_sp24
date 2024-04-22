import java.util.Random;

public class RandomGen {
    public static void main(String[] args) {
        Random random = new Random();
        for (int i = 0; i < 20; i++) {
            int randNum = random.nextInt(1000000);
            System.out.println(randNum);
        }
    }
}

