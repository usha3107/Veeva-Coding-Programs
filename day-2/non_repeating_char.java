import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class non_repeating_char {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextLine()) return;
        String input = sc.nextLine();

        Map<Character, Integer> freq = new LinkedHashMap<>();
        for (char c : input.toCharArray()) {
            if (c != ' ') {
                freq.put(c, freq.getOrDefault(c, 0) + 1);
            }
        }

        for (char c : input.toCharArray()) {
            if (c != ' ' && freq.get(c) == 1) {
                System.out.println(c);
                return;
            }
        }

        System.out.println("None");
    }
}