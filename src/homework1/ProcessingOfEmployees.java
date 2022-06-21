package homework1;

/**
 * Java Pro. Homework #1
 *  * @author Alexej Lange
 *  * @version 11 Jun 2022
 */

public class ProcessingOfEmployees {
    public static void main(String[] args) {
        Employee[] employeeArray = {
                new Employee("Smith", Position.DIRECTOR,
                        "smith@sd.com", "+49258974658", 5000, 45),
                new Employee("Jones", Position.SECRETER,
                        "jones@sd.com", "+49258974659", 2000, 28),
                new Employee("James", Position.PROGRAMMER,
                        "james@sd.com", "+49258974660", 4000, 34),
                new Employee("Marry", Position.PROGRAMMER,
                        "marry@sd.com", "+49258974661", 3300, 48),
                new Employee("Silver", Position.PROGRAMMER,
                        "silver@sd.com", "+49258974662", 2500, 22)
        };

        for (Employee employee : employeeArray) {
            if (employee.getAge() > 40) {
                System.out.println(employee);
            }
        }
    }
}
