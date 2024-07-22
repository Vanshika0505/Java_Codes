import java.util.Arrays;
public class ArrayDemo {
    // Method to find p.rs of elements whose sum is equal to a given number
    public void arrayFunc(int[] numbers, int target) {
        System.out.println("Pairs of elements whose sum is " + target + " are:");
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] + numbers[j] == target) {
                    System.out.println(numbers[i] + " + " + numbers[j] + " = " + target);
                }
            }
        }
    }
    // Method to merge two sorted arrays
    public void arrayFunc(int[] A, int p, int[] B, int q) {
        int[] mergedArray = new int[p + q];
        int i = 0, j = 0, k = 0;
        while (i < p && j < q) {
            if (A[i] < B[j]) {
                mergedArray[k++] = A[i++];
            }
            else {
                mergedArray[k++] = B[j++];
            }
        }  
        while (i < p) {
            mergedArray[k++] = A[i++];
        }
        while (j < q) {
            mergedArray[k++] = B[j++];
        }
        // Copy merged array back to A and B
        for (i = 0; i < p; i++) {
            A[i] = mergedArray[i];
        }
        for (j = 0; j < q; j++) {
            B[j] = mergedArray[i++];
        }
        // Sort A and B
        Arrays.sort(A);
        Arrays.sort(B);
        System.out.println("Sorted Arrays:");
        System.out.println("A: " + Arrays.toString(Arrays.copyOf(A, p)));
        System.out.println("B: " + Arrays.toString(Arrays.copyOfRange(mergedArray, p, p + q)));
    }
    public static void main(String[] args) {
        ArrayDemo demo = new ArrayDemo();
 
        // Test arrayFunc(int[], int) method
       int[] numbers = {4, 6, 5, -10, 8, 5, 20};
       int target = 10;
       demo.arrayFunc(numbers, target);
        // Test arrayFunc(int[], int, int[], int) method
        int[] A = {1, 5, 6, 7, 8, 10};
        int[] B = {2, 4, 9};
        demo.arrayFunc(A, A.length, B, B.length);
    }
}
 
