package homework9;

import java.util.*;

public class Database {
    protected List<Employee> employees = new ArrayList<>();
    protected Set<String> positions =new HashSet<>();
    protected Map<String, Employee> employeeMap = new HashMap<>();

    public void init() {
        List<Employee> addEmployees =Arrays.asList(
                new Employee("John", "director", 1250, 46),
                new Employee("Joy", "assistant", 750, 23),
                new Employee("Mark", "engineer", 1050, 42),
                new Employee("Karl", "engineer", 1025,38)
        );

        employees.addAll(addEmployees);

        for (Employee employee : addEmployees) {
            positions.add(employee.getPosition());
            employeeMap.put(employee.getName(),employee);
        }
    }

    public void create(Employee employee) {
        employees.add(employee);
        positions.add(employee.getPosition());
        employeeMap.put(employee.getName(),employee);
    }

    public String read() {
        StringBuilder sb = new StringBuilder();
        for (Employee employee : employeeMap.values()) {
            sb.append(employee).append("\n");
        }
        return sb.toString();
    }

    public void update(String name, Employee employee) {
        delete(name);
        create(employee);
    }

    public void delete(String name) {
        Employee employee = employeeMap.get(name);
        if (employee != null) {
            employeeMap.remove(employee.getName());
            employees.remove(employee);
        }
    }

    public String find(String name) {
        Employee employee = employeeMap.get(name);
        StringBuilder sb = new StringBuilder();
        if (employee != null) {
            sb.append(employee).append("\n");
            return sb.toString();
            }
        return "Not found";
    }

    public String getPositions() {
        StringBuilder sb = new StringBuilder();
        for (String position : positions) {
            sb.append(position).append("\n");
        }
        return sb.toString();
    }
}

