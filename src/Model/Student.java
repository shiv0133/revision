package Model;

public class Student {
    String Name;
    int Age;
    String Subject;
    int Marks;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public String getSubject() {
        return Subject;
    }

    public void setSubject(String subject) {
        Subject = subject;
    }

    public int getMarks() {
        return Marks;
    }

    public void setMarks(int marks) {
        Marks = marks;
    }

    public Student(String name, int age, String subject, int marks) {
        Name = name;
        Age = age;
        Subject = subject;
        Marks = marks;
    }
}
