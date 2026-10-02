
import java.util.*;
class Result {
    public static void insertionSort2(int n, List<Integer> arr) {
        for (int i = 1; i < n ; i++){
            int temp = arr.get(i);
            int j = i - 1;
            while (j >= 0){
                if(arr.get(j) > temp){
                    arr.set(j + 1, arr.get(j));
                    j--;
                } else{
                    break;
                }
            }
            arr.set(j + 1, temp);
            for (int k = 0; k < n; k++){
                System.out.print(arr.get(k) + " ");
            }
            System.out.println();
        }
    }
}
public class InsertionSort2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arr.add(sc.nextInt());
        }
        Result.insertionSort2(n, arr);
        sc.close();
    }
}