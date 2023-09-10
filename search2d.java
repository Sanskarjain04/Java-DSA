import java.util.Scanner;

public class search2d {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the size of the array
        System.out.println("Enter the number of rows: ");
        int rows = scanner.nextInt();
        System.out.println("Enter the number of columns: ");
        int columns = scanner.nextInt();

        // Create the array
        int[][] array = new int[rows][columns];

        // Get the values for the array
        System.out.println("Enter the values for the array: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                array[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Enter the number to be searched:");
        int x=scanner.nextInt();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if(array[i][j] == x){
                    System.out.println("The number is in the array");
                }
            }
        }
    }
}
