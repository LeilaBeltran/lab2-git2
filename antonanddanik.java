import java.util.Scanner;

public class antonanddanik {

    public static void main(String args[]) {
        int a = 0, d = 0, n, i;
        Scanner sc = new Scanner(System.in);
        n = Integer.parseInt(sc.nextLine());
        String str = sc.nextLine();
        for (i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'A') {
                a++;
            } else if (str.charAt(i) == 'D') {
                d++;
            }
        }
        if (a == d) {
            System.out.print("Friendship");
        } else if (a > d) {
            System.out.print("Anton");
        } else {
            System.out.print("Danik");
        }
    }
}
