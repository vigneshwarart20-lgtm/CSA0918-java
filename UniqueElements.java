import java.util.Scanner;
import java.util.Arrays;

public class UniqueElements {

    /**
     * Fills the 'dest' array with unique elements from 'src'
     * and returns the total count of unique elements.
     */
    public static int removeDuplicates(int[] src, int[] dest) {
        int uniqueCount = 0;

        for (int i = 0; i < src.length; i++) {
            boolean isDuplicate = false;

            // Check if element src[i] is already added to dest
            for (int j = 0; j < uniqueCount; j++) {
                if (src[i] == dest[j]) {
                    isDuplicate = true;
                    break;
                }
            }

            // If it's not a duplicate, add it to dest array
            if (!isDuplicate) {
                dest[uniqueCount] = src[i];
                uniqueCount++;
            }
        }

        return uniqueCount;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] originalArray = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            originalArray[i] = sc.nextInt();
        }

        // Destination array (size same as original array)
        int[] uniqueArray = new int[n];

        // Call function to fill uniqueArray and get unique count
        int count = removeDuplicates(originalArray, uniqueArray);

        // Display results
        System.out.println("Unique element count: " + count);
        System.out.print("Unique elements array: ");
        for (int i = 0; i < count; i++) {
            System.out.print(uniqueArray[i] + " ");
        }
        System.out.println();

        sc.close();
    }
}