import java.util.ArrayList;

public class UseArrayListUserDefinedData {
    public static void main(String[] args) {
        System.out.println("This program has been built to demonstrate the Userdefined type collection");
        StudentClass studentClass1 = new StudentClass(12, "Satwik",8605566761L);
        StudentClass studentClass2 = new StudentClass(13, "Abhishek",8888518891L);
        ArrayList<StudentClass> ArListOfStudentClass = new ArrayList<>();
        ArListOfStudentClass.add(studentClass1);
        ArListOfStudentClass.add(studentClass2);
        System.out.println(ArListOfStudentClass);
    }
}

class StudentClass {
    int rn;
    String name;    
    Long con;
    StudentClass(){
        //without parameters constructor
    }
    StudentClass(int rn, String name, Long con){
        this.rn=rn;
        this.name=name;
        this.con=con;
        System.out.println("Initializing StudentClass for "+name);
    }
}