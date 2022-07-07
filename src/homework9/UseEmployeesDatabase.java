package homework9;

public class UseEmployeesDatabase {
    public static void main(String[] args) {
        Database database = new Database();
        for (Employee employee : database.getEmployeeList()) {
           System.out.println(employee);
       }

    }
}
