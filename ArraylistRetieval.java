import java.util.ArrayList;

public class ArraylistRetieval {
    public static void main(String[] args) {
        System.out.println("This program has been built to demonstrate the Userdefined type collection");
        StudentClass studentClass1 = new StudentClass(12, "Satwik",8605566761L);
        StudentClass studentClass2 = new StudentClass(13, "Abhishek",8888518891L);
        ArrayList<StudentClass> ArListOfStudentClass = new ArrayList<>();
        ArListOfStudentClass.add(studentClass1);
        ArListOfStudentClass.add(studentClass2);
        System.out.println("0th Index Student Data \n"+"Roll No: "+ArListOfStudentClass.get(0).rn+"\nName: "+ArListOfStudentClass.get(0).name+"\nContact: "+ArListOfStudentClass.get(0).con);
        System.out.println("1st Index Student Data \n"+"Roll No: "+ArListOfStudentClass.get(1).rn+"\nName: "+ArListOfStudentClass.get(1).name+"\nContact: "+ArListOfStudentClass.get(1).con);
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
