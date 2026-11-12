import java.util.Arrays;
import java.util.Scanner;

public class anagram_check {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextLine()) return;
        String s1 = sc.nextLine().replace(" ", "").toLowerCase();
        if (!sc.hasNextLine()) return;
        String s2 = sc.nextLine().replace(" ", "").toLowerCase();

        if (s1.length() != s2.length()) {
            System.out.println("No");
            return;
        }

        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        System.out.println(Arrays.equals(arr1, arr2) ? "Yes" : "No");
    }
}