import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListSwapPairs {

    public static void swapPairs(ArrayList<String> stringList) {
        for (int i = 0; i < stringList.size() - 1; i += 2) {
            String temp = stringList.get(i);
            stringList.set(i, stringList.get(i + 1));
            stringList.set(i + 1, temp);
        }
    }

    public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();

        System.out.println("Enter strings to add to the list (type 'done' to finish):");

        while (true) {
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("done")) {
                break;
            }
            list.add(input);
        }

        System.out.println("Before: " + list);
        swapPairs(list);
        System.out.println("After: " + list);
    }
}