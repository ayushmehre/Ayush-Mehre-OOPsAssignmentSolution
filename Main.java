public class Main {

    public static void main(String[] args) {

        // Creating AdminDepartment Object and printing its results.
        AdminDepartment adminDepartment = new AdminDepartment();
        adminDepartment.departmentName();
        adminDepartment.getTodaysWork();
        adminDepartment.getWorkDeadline();
        adminDepartment.isTodayAHoliday();

        // Creating HRDepartment Object and printing its results.
        HRDepartment hrDepartment = new HRDepartment();
        hrDepartment.departmentName();
        hrDepartment.doActivity();
        hrDepartment.getTodaysWork();
        hrDepartment.getWorkDeadline();

        // Creating TechDepartment Object and printing its results.
        TechDepartment techDepartment = new TechDepartment();
        techDepartment.departmentName();
        techDepartment.getTodaysWork();
        techDepartment.getWorkDeadline();
        techDepartment.getTechStackInformation();
        techDepartment.isTodayAHoliday();

    }
}
