import java.util.ArrayList;
import java.util.List;

public class Filter {
    protected int treshold;

    public Filter(int treshold) {
        this.treshold = treshold;
    }

    public List<Integer> filterOut(List<Integer> source) {
        Logger logger = Logger.getInstance();
        logger.log("Запускаем фильтрацию");

        List<Integer> sortedArray = new ArrayList<>();
        for (Integer current : source) {
            if (current < treshold) {
                logger.log("Элемент " + current + " не проходит");
            } else {
                logger.log("Элемент " + current + " проходит");
                sortedArray.add(current);
            }
        }
        return sortedArray;
    }
}
