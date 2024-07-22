package pattern;

import java.util.Scanner;
public class ZeroOnePattern {
    public static int countPatterns(String input) {
        int count = 0;
        int index = 0;
        while ((index = input.indexOf("0", index)) != -1) {
            // Check if there is at least one '1' between the two '0's
            int start = index;
            while (start < input.length() && input.charAt(start) == '0') {
                start++;
            }
            int end = start;
            while (end < input.length() && input.charAt(end) == '1') {
                end++;
            }
            if (end < input.length() && input.charAt(end) == '0') {
                count++;
            }
            index = end;
        }  
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        String input =sc.next();
        int result = countPatterns(input);
        System.out.println("Total number of 0(1+)0 patterns: " + result);
    }
}
 
