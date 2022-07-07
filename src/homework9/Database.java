package homework9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Database {
    List<Employee> employeeList = new ArrayList<>();

    public List<Employee> getEmployeeList() {
        employeeList.addAll(Arrays.asList(
                new Employee("John", "director", 1500, 46),
                new Employee("Joy", "assistant", 750, 23),
                new Employee("Mark", "engineer", 1300, 42)
        ));
        return employeeList;
    }
}
