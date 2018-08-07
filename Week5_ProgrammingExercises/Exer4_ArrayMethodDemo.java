
public class Exer4_ArrayMethodDemo {

    public static void main (String args[])
    {
        int[] numbers = {12, 15, 34, 67, 4, 9, 10, 7, 13, 50};
        int limit = 12;
        display(numbers);
        displayReverse(numbers);
        displaySum(numbers);
        displayLessThan(numbers, limit);
        displayHigherThanAverage(numbers);
    }
    private static void display(int[] numbers)
    {
        System.out.print("The numbers are  ");
        for (int number : numbers) System.out.print(number + "  ");
    }
    private static void displayReverse(int[] numbers)
    {
        System.out.print("\nThe numbers in reverse order are  ");
        for(int i = numbers.length - 1; i >= 0; -- i)
            System.out.print(numbers[i] + "  ");
    }
    private static void displaySum(int[] numbers)
    {
        int total = 0;
        for (int number : numbers) {
            total += number;
        }
        System.out.println("\nThe sum of all numbers is " + total);
    }
    private static void displayLessThan(int[] numbers, int limit)
    {
        for (int number : numbers)
            if (number < limit) System.out.print(number + " ");
        System.out.println("are less than the limit " + limit);

    }
    private static void displayHigherThanAverage(int[] numbers)
    {
        int sum = 0;
        double average;
        for (int number1 : numbers) sum += number1;
        average = sum * 1.0 / numbers.length;
        System.out.println("The average is " + average);
        for (int number : numbers)
            if (number > average) System.out.print(number + "  ");
        System.out.println("are greater than the average");
    }
}