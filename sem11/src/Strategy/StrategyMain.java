package Strategy;

import java.util.Arrays;

public class StrategyMain {
    public static void main(String[] args) {
        SortManager sortManager = new SortManager();

        int array1[] = {5, 2, 9, 1, 3};
        sortManager.setSortingStrategy(new BubbleSortStrategy());
        sortManager.sortArray(array1);
        System.out.println("Sorted array: " + Arrays.toString(array1));

    }
}
