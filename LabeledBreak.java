public class LabeledBreak {
    public static void main(String[] args) {
        
        int i,j;
        MailLoop:     //Labeled Break Loop
        for (i=0;i<10;i++){
            for(j=0;j<=i;j++){
                System.out.println("Inner: "+j+" Outer: "+i);
                if (j==7 && i==7)
                    break MailLoop;
            }
            System.out.println( i + ( i==0 ? "th" :(i==1 ? "st" :(i==2? "nd" :( i==3 ? "rd" : "th" ))))+" Round is Complete\n");
        }        
        System.out.println("I wanted to break at I=7 and J=7 \n");
    }
}
