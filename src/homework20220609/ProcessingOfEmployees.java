package homework20220609;

/**
 * Java Pro. Homework #1
 *  * @author Alexej Lange
 *  * @version 11 Jun 2022
 */

public class ProcessingOfEmployees {
    public static void main(String[] args) {
        Employee[] employeeArray = new Employee[5];
        employeeArray[0] = new Employee("Smith", "director",
                "smith@sd.com", "+49258974658", 5000, 45);
        employeeArray[1] = new Employee("Jones", "secreter",
                "jones@sd.com", "+49258974659", 2000, 28);
        employeeArray[2] = new Employee("James", "programmer",
                "james@sd.com", "+49258974660", 4000, 34);
        employeeArray[3] = new Employee("Marry", "programmer",
                "marry@sd.com", "+49258974661", 3300, 48);
        employeeArray[4] = new Employee("Silver", "programmer",
                "silver@sd.com", "+49258974662", 2500, 22);

        for (Employee employee : employeeArray) {
            if (employee.getAge() > 40) {
                System.out.println(employee);
            }
        }
    }
}
