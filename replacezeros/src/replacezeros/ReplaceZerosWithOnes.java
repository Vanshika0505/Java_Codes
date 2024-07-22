package replacezeros;

import java.util.*;
public class ReplaceZerosWithOnes {
    public static void main(String[] args) {
    	Scanner sc= new Scanner(System.in);
    	System.out.println("Enter the input1:");
        int input1 = sc.nextInt();
        System.out.println("Enter the input2:");
        int input2 =sc.nextInt() ;
 
        System.out.println("Input 1: " + input1);
        System.out.println("Output 1: " + replaceZerosWithOnes(input1));
 
        System.out.println("Input 2: " + input2);
        System.out.println("Output 2: " + replaceZerosWithOnes(input2));
    }
 
    public static int replaceZerosWithOnes(int number) {
        int result = 0;
        int multiplier = 1;
 
        while (number > 0) {
            int digit = number % 10;
            if (digit == 0) {
                digit = 1;
            }
            result += digit * multiplier;
            multiplier *= 10;
            number /= 10;
        }
 
        return result;
    }
}
 
