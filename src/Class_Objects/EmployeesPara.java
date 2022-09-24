package Class_Objects;

public class EmployeesPara {
    String name;
    int age;
    String dept;
    String salary;

    public EmployeesPara(String name, int age, String dept, String salary) {
        this.name = name;
        this.age = age;
        this.dept = dept;
        this.salary = salary;
    }

    public static void main(String[] args) {

        EmployeesPara obj=new EmployeesPara(" shivendra ",45," cs ", " kanpur ");
        System.out.println(obj.name+obj.age +obj.dept +obj.salary);
        EmployeesPara obj1=new EmployeesPara("singh",16,"it", "tundla");
        System.out.println(obj1.name  + obj.dept);
    }
}
