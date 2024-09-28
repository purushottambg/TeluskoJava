import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String [] args){

        int rem,rev=0;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number to reverse: ");
        int num = scan.nextInt();
        int onum=num;
        while (num>=1) {
            rem=num%10;
            num/=10;
            rev=rev*10+rem;
        }
        scan.close();
        if(rev==onum){
            System.out.println(onum+" Number is a Palindrome");
        }else{
            System.out.println(onum+" Number is not Palindrome");
        }
        // System.out.println("original"+ onum);
        // System.out.println("reverse"+ rev);
    }
}
