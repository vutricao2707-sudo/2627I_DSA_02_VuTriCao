package Week6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Result3 {
    public static List<Integer> quicksort1(int n, List<Integer> arr) {
        int pivot = arr.get(0);
        List<Integer> left = new ArrayList<>();
        List<Integer> right = new ArrayList<>();
        for (int i = 1; i < n; i++) {
            if (arr.get(i) < pivot) {
                left.add(arr.get(i));
            } else {
                right.add(arr.get(i));
            }
        }
        List<Integer> result = new ArrayList<>();
        result.addAll(left);
        result.add(pivot);
        result.addAll(right);
        return result;
    }
}
public class Quicksort1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arr.add(sc.nextInt());
        }
        List<Integer> result = Result3.quicksort1(n, arr);
        for (int i = 0; i < result.size(); i++) {
            System.out.print(result.get(i));
            if (i < result.size() - 1) {
                System.out.print(" ");
            }
        }
        System.out.println();
        sc.close();
    }
}