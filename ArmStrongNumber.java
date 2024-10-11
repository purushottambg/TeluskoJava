public class ArmStrongNumber {
    public static void main(String[] args) {
        int number = 153;
        int original = number;
        int result = 0;

        while (number != 0) {
            int digit = number % 10;
            result += Math.pow(digit, 3);
            number /= 10;
        }

        if (original == result) {
            System.out.println(original + " is an Armstrong number.");
        } else {
            System.out.println(original + " is not an Armstrong number.");
        }
    }
}
