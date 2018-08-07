public class Exer1_TwelveInts
{
    public static void main (String args[])
    {
        int[] numbers = {15, 20, 25, 23, 50, 60, 78, 35, 38, 75, 89, 90};
        int i;
        for (i = 0; i < numbers.length; i++)
            System.out.print(numbers[i] + "  ");
        System.out.println();
        for (i = numbers.length - 1; i >= 0; i--)
            System.out.print("" + numbers[i] + "  ");
        System.out.println();
    }
}
