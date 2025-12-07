package org.example.managermngmnt.model;


public class Manager extends Personal {
    private Integer level;
    private String department;


    public Manager() {
        super();
    }

    public Manager(Long id, String firstName, String lastName, Integer age, String email, Integer level, String department) {
        super(id, firstName, lastName, age, email);
        this.level = level;
        this.department = department;
    }


    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "level=" + level +
                ", department='" + department + '\'' +
                '}';
    }
}
