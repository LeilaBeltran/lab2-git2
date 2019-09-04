import java.util.Scanner;

public class word {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String s = scn.next();
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                count++;
            }
        }
        if (count >= s.length() - count) {
            String l = s.toLowerCase();

            System.out.println(l);
        } else {
            String l = s.toUpperCase();
            System.out.println(l);
        }
    }
}
