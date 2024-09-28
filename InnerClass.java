class Outer{
    int one=1;
    public void outerPrint(){
        System.out.print("This is from inner class");
        System.out.print("This is value for one: "+one);
    }
    class InnerClass1{
        public void innerPrint(){
            System.out.print("This is from inner class");
            System.out.print("This is value for one: "+one);
        }
    }

}

public class InnerClass {
    public static void main(String[] args){
        Outer Outer1 = new Outer();
        System.out.println("Value of outer member: "+Outer1.one);
        Outer.InnerClass1 inside = Outer1.new InnerClass1();
        inside.innerPrint();
    }
}
