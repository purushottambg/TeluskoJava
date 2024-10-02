import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] arg){
        int[] ar = new int[5];
        Scanner sc = new Scanner(System.in);
        for (int loop=0;loop<5;loop++){
            System.out.print("Enter array member: ");
            ar[loop]=sc.nextInt();    
        }
        int max=0;
        for(int loop=0; loop<ar.length;loop++){
            if(ar[loop]>max){
                max=ar[loop];
            }
        }
        System.out.println("Max number is: "+max);
    }
}