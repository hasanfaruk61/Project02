package project02;

public class AdministrativeStaff extends Staff {
    private String managerPosition;



    @Override
    public double calculateSalary() {
        double salary = super.calculateSalary();
        salary = salary + (salary + 30) / 100;
        return salary;
    }

    public void manageMeeting(){
        System.out.println("Managing");
    }

    @Override
    public void workStyle() {
        System.out.println("Working three days in week");
    }

}
