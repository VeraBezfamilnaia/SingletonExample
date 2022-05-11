import java.util.List;
import java.util.Random;

public class RandomFiller {
    private static final Random random = new Random();

    public static void fill(List<Integer> array, int size, int upperLimit) {
        for (int i = 0; i < size; i++) {
            array.add(random.nextInt(upperLimit));
        }
        System.out.println("Вот случайный список: " + array);
    }
}
