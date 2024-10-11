import java.util.Scanner;
import java.lang.Math;

public class ArmStrongs {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Number to check if it's Pallindrome or not: ");
        int num=scan.nextInt();
        int original=num;
        int sum=0;         
        do{
            double check=num%10;
            System.out.print(check+"= (pow 3)");
            sum+=Math.pow(check, 3);
            System.out.println("="+Math.pow(check, 3)+"\tSum as of now: "+sum);
            num=num/10;
            
        }while(num>0);
        System.out.println("sum is "+sum+" and original is "+original);
    }
}