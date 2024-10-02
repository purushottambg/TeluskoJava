import java.util.Scanner;

class DefinedArray{
    protected int max(int[] Nums){
        int maxInt=Nums[0];
        for (int I=0; I<Nums.length; I++){
            if(Nums[I]>=maxInt){
                maxInt=Nums[I];
            }
        }
        return maxInt;
    }
}

public class DefinedMaxMethod {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];
        DefinedArray definedArray = new DefinedArray();
        System.out.println("Please enter 5 digigs");
        for (int I=0; I<numbers.length; I++){
            numbers[I]=scanner.nextInt();
        }
        System.out.println("Max Number is: "+ definedArray.max(numbers) );
        
    }
}
