import java.util.*;

public class SelectionSort {
    public static void SelectionSort(int n, List<Integer> arr) {
        for (int i = 0; i < n - 1; i++) {
            int min = i;
            for (int j = i + 1; j < n; j++) {
                if (arr.get(j) < arr.get(min)) {
                    min = j;
                }
            }
            if (min != i) {
                Collections.swap(arr, i, min);
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr.get(i) + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arr.add(sc.nextInt());
        }
        SelectionSort(n, arr);
    }
}