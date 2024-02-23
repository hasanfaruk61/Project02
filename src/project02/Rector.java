package project02;

public class Rector extends AdministrativeStaff {
    private String nameOfUni;

    @Override
    public double calculateSalary() {
        double salary = super.calculateSalary();
        salary = salary + (salary + 30) / 100;
        return salary;
    }

    public void makeUniBetter() {
        System.out.println("Making our Uni better");
    }
}
