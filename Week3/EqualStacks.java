import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;
class Result {
    public static int equalStacks(List<Integer> h1, List<Integer> h2, List<Integer> h3) {
        int sum1 = 0, sum2 = 0, sum3 = 0;
        for (int val : h1) sum1 += val;
        for (int val : h2) sum2 += val;
        for (int val : h3) sum3 += val;
        int i = 0, j = 0, k = 0;
        while (true) {
            if (i == h1.size() || j == h2.size() || k == h3.size()) {
                return 0;
            }
            if (sum1 == sum2 && sum2 == sum3) {
                return sum1;
            }
            if (sum1 >= sum2 && sum1 >= sum3) {
                sum1 -= h1.get(i++);
            } else if (sum2 >= sum1 && sum2 >= sum3) {
                sum2 -= h2.get(j++);
            } else if (sum3 >= sum1 && sum3 >= sum2) {
                sum3 -= h3.get(k++);
            }
        }
    }
}
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
        int n1 = Integer.parseInt(firstMultipleInput[0]);
        int n2 = Integer.parseInt(firstMultipleInput[1]);
        int n3 = Integer.parseInt(firstMultipleInput[2]);
        List<Integer> h1 = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());
        List<Integer> h2 = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());
        List<Integer> h3 = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());
        int result = Result.equalStacks(h1, h2, h3);
        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();
        bufferedReader.close();
        bufferedWriter.close();
    }
}
