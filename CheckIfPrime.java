import java.util.Scanner;
public class CheckIfPrime {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter any number to check if it Prime of not: ");
        int number=scan.nextInt();
        boolean check=true;
        for (int iterator=1;iterator<number; iterator++){
            if (number%iterator==0 && iterator!=1){
                check=false;
            }
        }
        if (check==false){
            System.out.println("Number is not prime");
        }else{
            System.out.println("Number is prime");
        }
    }
}
