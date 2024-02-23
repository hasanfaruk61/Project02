import project02.AdministrativeStaff;
import project02.Faculty;
import project02.Staff;


public class Test {
    public static void main(String[] args) {

        Staff faculty = new Faculty();
        faculty.setName("Hasan");
        faculty.setDepartment("Engineering");
        System.out.println(faculty.toString());
        faculty.workStyle();

        System.out.println("================================");

        AdministrativeStaff as = new AdministrativeStaff();
        as.setName("Faruk");
        as.setDepartment("Management");
        System.out.println(as.toString());
        as.workStyle();

    }
}