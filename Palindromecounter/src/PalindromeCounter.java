import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class PalindromeCounter {
    public static void main(String[] args) {
        String fileName = "C:\\Users\\HP Pavilion\\eclipse-workspace\\Palindromecounter\\src\\MyFile.txt";
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            int palindromeCount = 0;
            List<String> palindromes = new ArrayList<>();

            while ((line = br.readLine()) != null) {
                String[] words = line.split("\\s+");
                for (String word : words) {
                    if (isPalindrome(word)) {
                        palindromeCount++;
                        palindromes.add(word);
                    }
                }
            }

            System.out.println("Number of palindromes: " + palindromeCount);
            System.out.println("Palindromes: " + palindromes);
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
    }

    private static boolean isPalindrome(String word) {
        int i = 0, j = word.length() - 1;

        while (i < j) {
            if (word.charAt(i) != word.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }

        return true;
    }
}