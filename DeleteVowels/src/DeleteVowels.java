import java.util.Scanner;
public class DeleteVowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        StringBuffer result = new StringBuffer();
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (!isVowel(ch)) {
                result.append(ch);
            }
        }
        System.out.println("String after removing vowels: " + result.toString());
    }
    public static boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch);
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}

