package NewModel;

import java.util.Objects;

public class DoctorNew {
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DoctorNew doctorNew = (DoctorNew) o;
        return Age == doctorNew.Age && Objects.equals(Name, doctorNew.Name) && Objects.equals(City, doctorNew.City) && Objects.equals(Specialist, doctorNew.Specialist);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Name, Age, City, Specialist);
    }

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

    public DoctorNew(String name, int age, String city, String specialist) {
        Name = name;
        Age = age;
        City = city;
        Specialist = specialist;
    }
}


