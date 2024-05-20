import java.util.Scanner;
//ex1
public class SumOfIntegers{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = createArray(scanner);
        System.out.println("Sum of the entered integers: " + sum);
        scanner.close();
    }
    public static int createArray(Scanner scanner) {
        System.out.print("Enter the amount of elements: ");
        int size = scanner.nextInt();
        int sum = 0;
        for (int i = 0; i < size; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            sum += scanner.nextInt();
        }
        return sum;
    }
}