import java.util.Scanner;

public class string_builder{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextLine()) return;
        String sentence = sc.nextLine();
        if (!sc.hasNextLine()) return;
        String target = sc.nextLine();

        String[] words = sentence.split(" ", -1);
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < words.length; i++) {
            if (words[i].equals(target)) {
                result.append(words[i].toUpperCase());
            } else {
                result.append(words[i]);
            }
            if (i < words.length - 1) {
                result.append(" ");
            }
        }

        System.out.println(result.toString());
    }
}