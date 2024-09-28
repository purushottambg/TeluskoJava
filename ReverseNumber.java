import java.util.Scanner;

public class ReverseNumber {
    public static void main(String [] args){

        int rem=0;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number to reverse: ");
        int num = scan.nextInt();
        while (num>1) {
            rem=num%10;
            num/=10;
            System.out.print(rem);
        }
        scan.close();
    }
}