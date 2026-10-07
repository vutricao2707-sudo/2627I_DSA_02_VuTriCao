import java.util.Scanner;
public class NaturalMergeSort {
    public static void Merge(int[] arr, int left, int mid, int right) {
        int[] aux = new int[right - left + 1];
        int i = left;
        int j = mid + 1;
        int k = 0;
        while (i <= mid && j <= right) {
            if (arr[i] <= arr[j]) {
                aux[k] = arr[i];
                i++;
            } else {
                aux[k] = arr[j];
                j++;
            }
            k++;
        }
        while (i <= mid) {
            aux[k] = arr[i];
            i++;
            k++;
        }
        while (j <= right) {
            aux[k] = arr[j];
            j++;
            k++;
        }
        for(int l = 0; l < aux.length; l++){
            arr[left+l] = aux[l];
        }
    }
    public static void NaturalMergeSort(int[] arr) {
        int n = arr.length;
        if (n < 2) {
            return;
        }
        boolean sorted = false;
        while (!sorted) {
            sorted = true;
            int start = 0;
            while (start < n) {
                int mid = start;
                while (mid < n - 1 && arr[mid] <= arr[mid + 1]) {
                    mid++;
                }
                if(mid == n - 1){
                    break;
                }
                int end = mid + 1;
                while (end < n - 1 && arr[end] <= arr[end + 1]) {
                    end++;
                }
                Merge(arr, start, mid, end);
                sorted = false;
                start = end + 1;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        NaturalMergeSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}