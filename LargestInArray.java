public class LargestInArray {
    public static void main(String[] args) {
        int[] numbers = {12, 25, 45, 7, 98, 34};
        int max = numbers[0];

        for (int number : numbers) {
            if (number > max) {
                max = number;
            }
        }

        System.out.println("Largest number in array: " + max);
    }
}