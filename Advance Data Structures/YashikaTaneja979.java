import java.util.ArrayList;

class Student {
    String name;
    int age;
    

    
    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }


    void details() {
        System.out.println("Name: " + name );
        System.out.println("Age: " + age );
    }
}

public class YashikaTaneja979{
    public static void main(String[] args) {
       
        ArrayList<Student> students = new ArrayList<>();

      
        students.add(new Student("Yashika Taneja", 20));
        for (Student student : students) {
            student.details();
        }
    }
}