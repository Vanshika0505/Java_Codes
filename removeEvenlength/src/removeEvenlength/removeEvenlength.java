package removeEvenlength;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class removeEvenlength {
    public static void removeEvenLength(ArrayList<String> stringlist) {
        // Using an iterator to safely remove elements while iterating
        Iterator<String> iterator = stringlist.iterator();

        while (iterator.hasNext()) {
            String str = iterator.next();
            if (str.length() % 2 == 0) {
                iterator.remove();
            }
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
        removeEvenLength(list);
        System.out.println("After: " + list);

        scanner.close();
    }
}