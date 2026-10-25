
import java.io.*;
import java.util.*;
class Result5 {
    public static List<Double> runningMedian(List<Integer> a) {
        PriorityQueue<Integer> maxPQ =
                new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer> minPQ =
                new PriorityQueue<>();
        List<Double> result = new ArrayList<>();
        for (int x : a) {
            if (maxPQ.isEmpty() || x <= maxPQ.peek()) {
                maxPQ.add(x);
            } else {
                minPQ.add(x);
            }
            if (maxPQ.size() > minPQ.size() + 1) {
                minPQ.add(maxPQ.poll());
            } else if (minPQ.size() > maxPQ.size()) {
                maxPQ.add(minPQ.poll());
            }
            double median;
            if (maxPQ.size() == minPQ.size()) {
                median = ((double) maxPQ.peek()
                        + minPQ.peek()) / 2.0;
            } else {
                median = maxPQ.peek();
            }
            result.add(median);
        }
        return result;
    }
}
public class W7_25020045_tailop {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> a = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            a.add(scanner.nextInt());
        }
        List<Double> result = Result5.runningMedian(a);
        for (double median : result) {
            System.out.printf(Locale.US, "%.1f%n", median);
        }
        scanner.close();
    }
}
