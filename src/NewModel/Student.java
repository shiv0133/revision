package NewModel;

import java.util.Objects;

public class Student {
    String Name;
    int Age;
    String Subject;
    int Marks;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Age == student.Age && Marks == student.Marks && Objects.equals(Name, student.Name) && Objects.equals(Subject, student.Subject);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Name, Age, Subject, Marks);
    }

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
