public class LabeledBreak {
    public static void main(String[] args) {
        
        MailLoop:
        for (int i=0;i<10;i++){
            for(int j=0;j<i;j++){
                System.out.println("Inner: "+j+" Outer: "+i);
                if (j==7 && i==7)
                    break MailLoop;
            }
        }
        System.out.println("I wanted to break at I=7 and J=7");
    }
}
