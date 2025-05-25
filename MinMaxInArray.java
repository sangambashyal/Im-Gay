import java.util.Scanner;

public class MinMaxInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input array size
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        // Declare and input array elements
        int[] numbers = new int[n];
        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        // Initialize min and max to first element
        int min = numbers[0];
        int max = numbers[0];

        // Find min and max
        for (int i = 1; i < n; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        // Output results
        System.out.println("Minimum value = " + min);
        System.out.println("Maximum value = " + max);

        scanner.close();
    }
}
