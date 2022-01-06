import java.util.ArrayList;

public class Driver {
    public static ArrayList<Comparable> arrayMaker (int size) {
        ArrayList<Comparable> test = new ArrayList<Comparable>();
        for (int i = 0; i < size; i++) {
            test.add((int)(Math.random()*100));
        }
        return test;
    }

    public static void main(String[] args) {
        // test each kind of sort function on an arraylist of test numbers
        ArrayList<Comparable> test = new ArrayList<Comparable>();
        test = arrayMaker(10);

        // test bubble sort
        System.out.println("Bubble Sort");
        System.out.println("Before: " + test);
        test = Sorts.bubbleSort(test);
        System.out.println("After: " + test);

        test.clear();

        // test selection sort
        System.out.println("Selection Sort");
        test = arrayMaker(10);
        System.out.println("Before: " + test);
        test = Sorts.selectionSort(test);
        System.out.println("After: " + test);

        test.clear();

        // test insertion sort
        System.out.println("Insertion Sort");
        test = arrayMaker(10);
        System.out.println("Before: " + test);
        test = Sorts.insertionSort(test);
        System.out.println("After: " + test);

        test.clear();
    }
}
