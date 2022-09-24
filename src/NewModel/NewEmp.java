package NewModel;

public class NewEmp {
    String Name;
    int Age;
    double Salary;
    String Dept;

    public NewEmp(String name, int age, double salary, String dept) {
        Name = name;
        Age = age;
        Salary = salary;
        Dept = dept;
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

    public double getSalary() {
        return Salary;
    }

    public void setSalary(double salary) {
        Salary = salary;
    }

    public String getDept() {
        return Dept;
    }

    public void setDept(String dept) {
        Dept = dept;
    }
}

