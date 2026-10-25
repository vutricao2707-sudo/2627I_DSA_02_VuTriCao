package Week7;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

class Result6 {
    public static void reverse(String str) {
        List<Character>  list = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            list.add(str.charAt(i));
        }
        String Forward = "";
        String Reverse = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            Reverse = Reverse+ str.charAt(i);
        }
        for (int i = 0; i < list.size(); i++) {
            Forward  = Forward + list.get(i);
        }
        if (Reverse.equals(Forward)) {
            System.out.println("Yes");
        } else  {
            System.out.println("No");
        }
    }
}

public class JavaStringReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        Result6.reverse(str);
        sc.close();
    }
}