import java.util.ArrayList;
import java.util.List;

class Student {
    private String firstName;
    private String lastName;
    private int age;
    private double meanGrade;
    public Student(String firstName, String lastName, int age, double meanGrade) {
        this.firstName=firstName;
        this.lastName=lastName;
        this.age=age;
        this.meanGrade=meanGrade;
    }
    @Override
    public String toString() {
        return this.firstName+" "+this.lastName+" "+this.age+" "+this.meanGrade;
    }
    @Override
    public boolean equals(Object o) {
        if (o instanceof Student) {
            Student x = (Student) o;
            return this.meanGrade == x.meanGrade && this.age == x.age && this.lastName == x.lastName && this.firstName == x.firstName;
        }
        return false;
    }
}
class teacher{
    String login;
    String password;
    private List<Student> students;
    public teacher(String login, String password)
    {
        this.login=login;
        this.password=password;
        this.students= new ArrayList<Student>();
    }
    public boolean Login(String login, String password)
    {
        return this.login.equals(login) && this.password.equals(password);
    }
    public boolean add(Student s)
    {
        return this.students.add(s);
    }
    public String viewStudents()
    {
        StringBuilder prefix= new StringBuilder();
        for(Student o :this.students)
        {
            prefix.append(o.toString()).append("\n");
        }
        return prefix.toString();
    }
}
public class Main {
    public static void main(String[] args) {
        teacher t = new teacher("teacher","teacher");
        Student s1 = new Student("D","D",20,10.0);
        Student s2= new Student("A","A",19,5.60);
        Student s3 = new Student("B","B",21,8.50);
        Student s4 = new Student("C","C",22,9);
        t.add(s1);
        t.add(s2);
        t.add(s3);
        t.add(s4);
        System.out.println(t.Login("teacher","teacher"));
        System.out.println(t.Login("teacher","t"));
        System.out.println(t.viewStudents());
    }
}