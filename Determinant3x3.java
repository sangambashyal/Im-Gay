import java.util.Scanner;

public class Determinant3x3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matrix = new int[3][3];

        // Input matrix elements
        System.out.println("Enter elements of 3x3 matrix:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        // Assign matrix elements to variables for clarity
        int a = matrix[0][0];
        int b = matrix[0][1];
        int c = matrix[0][2];
        int d = matrix[1][0];
        int e = matrix[1][1];
        int f = matrix[1][2];
        int g = matrix[2][0];
        int h = matrix[2][1];
        int i = matrix[2][2];

        // Calculate determinant
        int determinant = a*(e*i - f*h) - b*(d*i - f*g) + c*(d*h - e*g);

        // Display result
        System.out.println("Determinant of the matrix is: " + determinant);

        scanner.close();
    }
}
