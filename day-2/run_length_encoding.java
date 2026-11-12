import java.util.Scanner;

public class run_length_encoding {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNext()) return;
        String s = sc.next();

        if (s.isEmpty()) {
            System.out.println(s);
            return;
        }

        StringBuilder compressed = new StringBuilder();
        int count = 1;

        for (int i = 1; i <= s.length(); i++) {
            if (i < s.length() && s.charAt(i) == s.charAt(i - 1)) {
                count++;
            } else {
                compressed.append(s.charAt(i - 1));
                if (count > 1) {
                    compressed.append(count);
                }
                count = 1;
            }
        }

        if (compressed.length() < s.length()) {
            System.out.println(compressed.toString());
        } else {
            System.out.println(s);
        }
    }
}