import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[10];
        int sum = 0;

        System.out.println("Enter 10 integers.");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Number #" + (i+1) + ":");
            while (!scanner.hasNextInt()) { 
                System.out.println("Invalid input. Please enter an integer:");
                scanner.next();
            }
            numbers[i] = scanner.nextInt();
            sum += numbers[i];
        }


        System.out.println("\nThe input numbers are:");
        for (int i = 0; i < numbers.length; i++) {
            if (i<9){
                System.out.print(numbers[i] + "; ");
            }
            else {
                System.out.println(numbers[i] + ".\n");
            }
        }


        double average = (double) sum / numbers.length;
        System.out.println("The average is: " + average);


        int biggestNumber = numbers[0];
        int smallestNumber = numbers[0];
        for (int i = 1; i < numbers.length; i++){
            if (biggestNumber < numbers[i]){
                biggestNumber = numbers[i];
            }
            else if (smallestNumber > numbers[i]){
                smallestNumber = numbers[i];
            }
        }
        System.out.println("The biggest number is: " + biggestNumber);
        System.out.println("The smallest number is: " + smallestNumber);
    }
}
