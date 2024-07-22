package integerlist;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class listmain {

    public static List<Integer> alternate(List<Integer> list1, List<Integer> list2) {
        List<Integer> result = new ArrayList<>();

        int size1 = list1.size();
        int size2 = list2.size();

        int minSize = Math.min(size1, size2);

        for (int i = 0; i < minSize; i++) {
            result.add(list1.get(i));
            result.add(list2.get(i));
        }

        if (size1 > minSize) {
            result.addAll(list1.subList(minSize, size1));
        } else if (size2 > minSize) {
            result.addAll(list2.subList(minSize, size2));
        }

        return result;
    }

    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the elements of List 1, separated by spaces:");
        String[] input1 = scanner.nextLine().split(" ");

        for (String s : input1) {
            list1.add(Integer.parseInt(s));
        }

        System.out.println("Enter the elements of List 2, separated by spaces:");
        String[] input2 = scanner.nextLine().split(" ");

        for (String s : input2) {
            list2.add(Integer.parseInt(s));
        }

        System.out.println("List 1: " + list1);
        System.out.println("List 2: " + list2);

        List<Integer> result = alternate(list1, list2);

        System.out.println("Result: " + result);
    }
}
