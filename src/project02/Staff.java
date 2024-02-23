package project02;

public abstract class Staff implements WorkStyleInfo {
    private long id;
    private String name, surname;
    private double salary;
    public String department;
    protected int totalWorkingYears;
    private final int CONSTANT = 500;

    public double calculateSalary() {
        return totalWorkingYears * CONSTANT;
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

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String toString() {
        return "Name: " + name + ", Department: " + department;
    }
}
