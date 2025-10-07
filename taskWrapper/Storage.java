package taskWrapper;

public class Storage<T>{
private String name;
private String surname;
private T schoolName;

    public Storage(String name, String surname, T schoolName) {
        this.name = name;
        this.surname = surname;
        this.schoolName = schoolName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public T getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(T schoolName) {
        this.schoolName = schoolName;
    }

    @Override
    public String toString() {
        return "Storage{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", schoolName=" + schoolName +
                '}';
    }
}
