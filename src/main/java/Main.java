import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Logger logger = Logger.getInstance();

        logger.log("Запускаем программу");
        logger.log("Просим пользователя ввести входные данные для списка");
        int arraySize = getArraySizeFromUser();
        int upperValuesLimit = getUpperValuesLimitFromUser();

        logger.log("Создаем и наполняем список");
        List<Integer> array = new ArrayList<>();
        RandomFiller.fill(array, arraySize, upperValuesLimit);

        logger.log("Просим пользователя ввести входные данные для фильтрации");
        int treshold = getTresholdFromUser();
        Filter filter = new Filter(treshold);
        List<Integer> sortedArray = filter.filterOut(array);
        printMessage("Отсортированный список: " + sortedArray);
        logger.log("Завершаем программу");
    }

    private static int getArraySizeFromUser() {
        printMessage("Введите размер списка:");
        return scanner.nextInt();
    }

    private static void printMessage(String message) {
        System.out.println(message);
    }

    private static int getUpperValuesLimitFromUser() {
        printMessage("Введите верхнюю границу для значений:");
        return scanner.nextInt();
    }

    private static int getTresholdFromUser() {
        printMessage("Введите верхнюю границу для значений:");
        return scanner.nextInt();
    }
}
