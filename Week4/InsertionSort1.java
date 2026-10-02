import java.util.*;

class Result {
    public static void insertionSort1(int n, List<Integer> arr) {
        int temp = arr.get(n - 1);
        int i;
        for (i = n - 2; i >= 0; i--) {
            if (arr.get(i) > temp) {
                arr.set(i + 1, arr.get(i));
                for (int j = 0; j < n; j++) {
                    System.out.print(arr.get(j) + " ");
                }
                System.out.println();
            } else {
                break;
            }
        }
        arr.set(i + 1, temp);
        for (int j = 0; j < n; j++) {
            System.out.print(arr.get(j) + " ");
        }
        System.out.println();
    }
}
public class InsertionSort1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arr.add(sc.nextInt());
        }
        Result.insertionSort1(n, arr);
        sc.close();
    }
}