package project02;

public class Professor extends Faculty {
    private String field;

    @Override
    public double calculateSalary() {
        double salary = super.calculateSalary();
        salary = salary + (salary + 30) / 100;
        return salary;
    }

    public void doResearch() {
        System.out.println("Searching");
    }
}
