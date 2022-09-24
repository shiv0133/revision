package Model;

public class Doctor {
    String Name;
    int Age;
    String City;
    String Specialist;

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

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    public String getSpecialist() {
        return Specialist;
    }

    public void setSpecialist(String specialist) {
        Specialist = specialist;
    }

    public Doctor(String name, int age, String city, String specialist) {
        Name = name;
        Age = age;
        City = city;
        Specialist = specialist;
    }
}
