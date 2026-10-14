
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Result4 {

    public static void exch(List<Integer> arr, int i, int j) {
        int temp = arr.get(i);
        arr.set(i, arr.get(j));
        arr.set(j, temp);
    }

    public static int partition(List<Integer> arr, int l, int r) {
        int pivot = arr.get(r);
        int i = l - 1;

        for (int j = l; j < r; j++) {
            if (arr.get(j) < pivot) {
                i++;
                exch(arr, i, j);
            }
        }

        exch(arr, i + 1, r);
        return i + 1;
    }
    public static void printArray(List<Integer> arr) {
        for (int k = 0; k < arr.size(); k++) {
            if (k > 0) {
                System.out.print(" ");
            }
            System.out.print(arr.get(k));
        }
        System.out.println();
    }

    public static void quicksortinplace(
            List<Integer> arr, int l, int r) {

        if (l < r) {
            int p = partition(arr, l, r);

            printArray(arr);
            quicksortinplace(arr, l, p - 1);
            quicksortinplace(arr, p + 1, r);
        }
    }
}

public class Quicksortinplace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arr.add(sc.nextInt());
        }
        Result4.quicksortinplace(arr, 0, n - 1);
        sc.close();
    }
}