
import java.util.PriorityQueue;
import java.util.Scanner;

public class JesseandCookie {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int i = 0; i < n; i++) {
            pq.add(sc.nextInt());
        }

        int count = 0;

        while (pq.size() > 1 && pq.peek() < k) {
            int a = pq.poll();
            int b = pq.poll();

            int newSweetness = a + 2 * b;

            pq.add(newSweetness);
            count++;
        }

        if (!pq.isEmpty() && pq.peek() >= k) {
            System.out.println(count);
        } else {
            System.out.println(-1);
        }

        sc.close();
    }
}
