import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;


public class LargestNumber {
    public static void main(String[] arg){
        ArrayList<Integer> arrayList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        for (int loop=0;loop<5;loop++){
            System.out.print("Enter array member: ");
            arrayList.add(sc.nextInt());
        }
        System.out.println(("Max number is: "+Collections.max(arrayList)));
    }
}