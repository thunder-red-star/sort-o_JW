import java.util.ArrayList;

public class Driver {
    public static ArrayList<Comparable> arrayMaker (int size) {
        ArrayList<Comparable> test = new ArrayList<Comparable>();
        for (int i = 0; i < size; i++) {
            test.add((int)(Math.random()*100));
        }
        return test;
    }

    public static ArrayList<Comparable> ascendingArrayMaker (int size) {
        ArrayList<Comparable> test = new ArrayList<Comparable>();
        for (int i = 0; i < size; i++) {
            test.add(i);
        }
        return test;
    }

    public static ArrayList<Comparable> descendingArrayMaker (int size) {
        ArrayList<Comparable> test = new ArrayList<Comparable>();
        for (int i = 0; i < size; i++) {
            test.add(size - i);
        }
        return test;
    }

    public static void main(String[] args) {
        // test each kind of sort function on an arraylist of test numbers
        ArrayList<Comparable> test = new ArrayList<Comparable>();
        System.out.println("DATA FOR BUBBLESORT");
        String outTableBubbleSortSwaps = "Size\tBest\tAverage\tWorst\n";
        String outTableBubbleSortBestCase = "Size\tPasses\tCompares\tSwaps\n";
        String outTableBubbleSortAvgCase = "Size\tPasses\tCompares\tSwaps\n";
        String outTableBubbleSortWorstCase = "Size\tPasses\tCompares\tSwaps\n";
        for (int x = 0; x < 10; x++) {
            int[] swapBenchBest = Sorts.bubbleSortBenchmark(ascendingArrayMaker(x * 100));
            int[] swapBenchAverage = Sorts.bubbleSortBenchmark(arrayMaker(x * 100));
            int[] swapBenchWorst = Sorts.bubbleSortBenchmark(descendingArrayMaker(x * 100));
            outTableBubbleSortSwaps += x * 100 + "\t" + swapBenchBest[2] + "\t" + swapBenchAverage[2] + "\t" + swapBenchWorst[2] + "\n";
            outTableBubbleSortBestCase += x * 100 + "\t" + swapBenchBest[0] + "\t" + swapBenchBest[1] + "\t\t" + swapBenchBest[2] + "\n";
            outTableBubbleSortAvgCase += x * 100 + "\t" + swapBenchAverage[0] + "\t" + swapBenchAverage[1] + "\t\t" + swapBenchAverage[2] + "\n";
            outTableBubbleSortWorstCase += x * 100 + "\t" + swapBenchWorst[0] + "\t" + swapBenchWorst[1] + "\t\t" + swapBenchWorst[2] + "\n";
        }
        System.out.println("Swaps Tracker: ");
        System.out.println(outTableBubbleSortSwaps);
        System.out.println("Best Case: ");
        System.out.println(outTableBubbleSortBestCase);
        System.out.println("Avg Case: ");
        System.out.println(outTableBubbleSortAvgCase);
        System.out.println("Worst Case: ");
        System.out.println(outTableBubbleSortWorstCase + "\n");


        System.out.println("DATA FOR SELECTIONSORT");
        String outTableSelectionSortSwaps = "Size\tBest\tAverage\tWorst\n";
        String outTableSelectionSortBestCase = "Size\tPasses\tCompares\tSwaps\n";
        String outTableSelectionSortAvgCase = "Size\tPasses\tCompares\tSwaps\n";
        String outTableSelectionSortWorstCase = "Size\tPasses\tCompares\tSwaps\n";
        for (int x = 0; x < 10; x++) {
            int[] swapBench2Best = Sorts.selectionSortBenchmark(ascendingArrayMaker(x * 100));
            int[] swapBench2Average = Sorts.selectionSortBenchmark(arrayMaker(x * 100));
            int[] swapBench2Worst = Sorts.selectionSortBenchmark(descendingArrayMaker(x * 100));
            outTableSelectionSortSwaps += x * 100 + "\t" + swapBench2Best[2] + "\t" + swapBench2Average[2] + "\t" + swapBench2Worst[2] + "\n";
            outTableSelectionSortBestCase += x * 100 + "\t" + swapBench2Best[0] + "\t" + swapBench2Best[1] + "\t\t" + swapBench2Best[2] + "\n";
            outTableSelectionSortAvgCase += x * 100 + "\t" + swapBench2Average[0] + "\t" + swapBench2Average[1] + "\t\t" + swapBench2Average[2] + "\n";
            outTableSelectionSortWorstCase += x * 100 + "\t" + swapBench2Worst[0] + "\t" + swapBench2Worst[1] + "\t\t" + swapBench2Worst[2] + "\n";
        }
        System.out.println("Swaps Tracker: ");
        System.out.println(outTableSelectionSortSwaps);
        System.out.println("Best Case: ");
        System.out.println(outTableSelectionSortBestCase);
        System.out.println("Avg Case: ");
        System.out.println(outTableSelectionSortAvgCase);
        System.out.println("Worst Case: ");
        System.out.println(outTableSelectionSortWorstCase + "\n");


        System.out.println("DATA FOR INSERTIONSORT");
        String outTableInsertionSortSwaps = "Size\tBest\tAverage\tWorst\n";
        String outTableInsertionSortBestCase = "Size\tPasses\tCompares\tSwaps\n";
        String outTableInsertionSortAvgCase = "Size\tPasses\tCompares\tSwaps\n";
        String outTableInsertionSortWorstCase = "Size\tPasses\tCompares\tSwaps\n";
        for (int x = 0; x < 10; x++) {
            int[] swapBench3Best = Sorts.insertionSortBenchmark(ascendingArrayMaker(x * 100));
            int[] swapBench3Average = Sorts.insertionSortBenchmark(arrayMaker(x * 100));
            int[] swapBench3Worst = Sorts.insertionSortBenchmark(descendingArrayMaker(x * 100));
            outTableInsertionSortSwaps += x * 100 + "\t" + swapBench3Best[2] + "\t" + swapBench3Average[2] + "\t" + swapBench3Worst[2] + "\n";
            outTableInsertionSortBestCase += x * 100 + "\t" + swapBench3Best[0] + "\t" + swapBench3Best[1] + "\t\t" + swapBench3Best[2] + "\n";
            outTableInsertionSortAvgCase += x * 100 + "\t" + swapBench3Average[0] + "\t" + swapBench3Average[1] + "\t\t" + swapBench3Average[2] + "\n";
            outTableInsertionSortWorstCase += x * 100 + "\t" + swapBench3Worst[0] + "\t" + swapBench3Worst[1] + "\t\t" + swapBench3Worst[2] + "\n";
        }
        System.out.println("Swaps Tracker: ");
        System.out.println(outTableInsertionSortSwaps);
        System.out.println("Best Case: ");
        System.out.println(outTableInsertionSortBestCase);
        System.out.println("Avg Case: ");
        System.out.println(outTableInsertionSortAvgCase);
        System.out.println("Worst Case: ");
        System.out.println(outTableInsertionSortWorstCase + "\n");
    }
}
