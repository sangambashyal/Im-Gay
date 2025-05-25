import java.util.Arrays;
import java.util.Scanner;

public class SortNamesAlphabetically {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get array size from user
        System.out.print("Enter the number of names: ");
        int n = scanner.nextInt();
        scanner.nextLine();  // Consume the leftover newline

        // Declare and input names
        String[] names = new String[n];
        System.out.println("Enter " + n + " names:");
        for (int i = 0; i < n; i++) {
            names[i] = scanner.nextLine();
        }

        // Sort names alphabetically
        Arrays.sort(names);

        // Print sorted names
        System.out.println("\nNames in alphabetical order:");
        for (String name : names) {
            System.out.println(name);
        }

        scanner.close();
    }
}
