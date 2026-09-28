import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int q = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        Stack<String> history = new Stack<>();
        for (int i = 0; i < q; i++) {
            String[] input = br.readLine().split(" ");
            int type = Integer.parseInt(input[0]);
            switch (type) {
                case 1:
                    history.push(sb.toString());
                    sb.append(input[1]);
                    break;
                case 2:
                    history.push(sb.toString());
                    int k = Integer.parseInt(input[1]);
                    sb.delete(sb.length() - k, sb.length());
                    break;
                case 3:
                    int idx = Integer.parseInt(input[1]);
                    System.out.println(sb.charAt(idx - 1));
                    break;
                case 4:
                    if (!history.isEmpty()) {
                        sb = new StringBuilder(history.pop());
                    }
                    break;
            }
        }
    }
}