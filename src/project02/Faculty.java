package project02;

public class Faculty extends Staff{
    private String title;

    @Override
    public double calculateSalary() {
        return super.calculateSalary();
    }

    public void teach() {
        System.out.println("...");
    }

    @Override
    public void workStyle() {
        System.out.println("Working full time");
    }
}
