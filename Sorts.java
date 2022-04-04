//Importing everything
import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Comparator;

// Start by creating the sorting class
public class Sorts {
    private final ArrayList<Integer> data = new ArrayList<>();
    private final Duration timeElapsed;

    // Create a new class called Sorts which will start the process
    public Sorts(int size, String sorter) {
        Instant start = Instant.now();  // time capture -- start
        // builds an array
        for (int i = 0; i < size; i++) {
            data.add((int)(Math.random() * (size+1)));
        }

        // Create a sorting to choose bewteen the sorting methods
        switch (sorter) {
            case "bubble" -> bubbleSort(data);
            case "insert" -> insertSort(data);
            case "merge" -> mergeSort(data);
        }

        // Checks the times
        Instant end = Instant.now();    // time capture -- end
        this.timeElapsed = Duration.between(start, end);
    }

    // Start creating getters 
    public ArrayList<Integer> getData() {
        return data;
    }

    public int getTimeElapsed() {
        return timeElapsed.getNano();
    }


    // now on our main classes to run the entire program
    public static void main(String[] args) {
        int sizes = 5000,  times = 10, time = 0, sum = 0;
        String[] options = {"insert", "merge", "bubble"};

        // Starting the string outputting
        for (String option : options) {
            System.out.println("sorting type: " + option);
            
            // Now we are going through the multiple times
            for (int i = 0; i < times; i++) {
                Sorts s = new Sorts(sizes, option);
                for (int j = 0; j < s.getData().size(); j++) {
                    sum += s.getData().get(j);
                }
                System.out.println("AVG: " + sum / ((i + 1) * sizes));
                System.out.println("ns: " + s.getTimeElapsed());
                time += s.getTimeElapsed();
            }

            // printing out our times 
            System.out.println("AVG: " + sum / (times * sizes));
            System.out.println("Total Nanoseconds: " + time);
            System.out.println("Total Seconds: " + time / 1000000000.0);
        }
    }

    // inserting the bubble sorting method
    public static void bubbleSort(ArrayList<Integer> array) {
        for (int x = 0; x < array.size(); x++) {
            for (int y = 0; y < array.size() - 1; y++) {
                if (array.get(y) > array.get(y + 1)) {
                    int temporary = array.get(y);
                    array.set(y, array.get(y + 1));
                    array.set(y + 1, temporary);
                }
            }
        }
    }

    // Creating the inserting sorting method
    public static void insertSort(ArrayList<Integer> array) {
        int n = array.size();
        for (int i = 1; i < n; ++i) {
            int key = array.get(i);
            int j = i - 1;
            while (j >= 0 && array.get(j) > key) {
                array.set(j + 1, array.get(j));
                j = j - 1;
            }
            array.set(j + 1, key);
        }

    }

    // 
    public static void mergeSort(ArrayList<Integer> array) {
        int n = array.size();
        if (n < 2)
            return;
        ArrayList<Integer> left = new ArrayList<Integer>();
        ArrayList<Integer> right = new ArrayList<Integer>();
        for (int i = 0; i < n / 2; i++) {
            left.add(array.get(i));
        }
        for (int i = n / 2; i < n; i++) {
            right.add(array.get(i));
        }
        mergeSort(left);
        mergeSort(right);
        merge(left, right, array);
    }

    private static void merge(ArrayList<Integer> left, ArrayList<Integer> right, ArrayList<Integer> array) {
        int i = 0, j = 0, k = 0;
        while (i < left.size() && j < right.size()) {
            if (left.get(i) < right.get(j)) {
                array.set(k, left.get(i));
                i++;
            } else {
                array.set(k, right.get(j));
                j++;
            }
            k++;
        }
        while (i < left.size()) {
            array.set(k, left.get(i));
            i++;
            k++;
        }
        while (j < right.size()) {
            array.set(k, right.get(j));
            j++;
            k++;
        }
    }

}