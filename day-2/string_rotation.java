import java.util.Scanner;

public class string_rotation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNext()) return;
        String a = sc.next();
        String b = sc.next();

        if (a.length() == b.length() && (a + a).contains(b)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}