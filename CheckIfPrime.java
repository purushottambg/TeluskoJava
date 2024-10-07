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

// public class PrimeCheck {
//     public static void main(String[] args) {
//         int number = 29;
//         boolean isPrime = true;

//         for (int i = 2; i <= number / 2; i++) {
//             if (number % i == 0) {
//                 isPrime = false;
//                 break;
//             }
//         }

//         if (isPrime && number > 1) {
//             System.out.println(number + " is a prime number.");
//         } else {
//             System.out.println(number + " is not a prime number.");
//         }
//     }
// }
