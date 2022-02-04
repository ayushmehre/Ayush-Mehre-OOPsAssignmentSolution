import departments.*;

public class Main {

    public static void main(String[] args) {

        // Creating AdminDepartment Object and printing its results.
        AdminDepartment adminDepartment = new AdminDepartment();
        print("Welcome to " + adminDepartment.departmentName());
        print(adminDepartment.getTodaysWork());
        print(adminDepartment.getWorkDeadline());
        print(adminDepartment.isTodayAHoliday());
        print("\n");

        // Creating HRDepartment Object and printing its results.
        HRDepartment hrDepartment = new HRDepartment();
        print("Welcome to " + hrDepartment.departmentName());
        print(hrDepartment.doActivity());
        print(hrDepartment.getTodaysWork());
        print(hrDepartment.getWorkDeadline());
        print("\n");

        // Creating TechDepartment Object and printing its results.
        TechDepartment techDepartment = new TechDepartment();
        print("Welcome to " + techDepartment.departmentName());
        print(techDepartment.getTodaysWork());
        print(techDepartment.getWorkDeadline());
        print(techDepartment.getTechStackInformation());
        print(techDepartment.isTodayAHoliday());

    }

    private static void print(String string) {
        System.out.println(string);
    }
}
