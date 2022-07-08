package homework9;

import java.util.*;

public class Database {
    protected Map<String, Employee> employeeMap = new HashMap<>();
    protected Set<String> positions =new HashSet<>();

    public void init() {
        employeeMap.put("John", new Employee("John", "director", 1250, 46));
        employeeMap.put("Joy", new Employee("Joy", "assistant", 750, 23));
        employeeMap.put("Mark", new Employee("Mark", "engineer", 1050, 42));
        employeeMap.put("Karl", new Employee("Karl", "engineer", 1025,38));

        for (Employee employee : employeeMap.values()) {
            positions.add(employee.getPosition());
        }
    }

    public void create(Employee employee) {
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

    public void delete(String name) {
        Employee employee = employeeMap.get(name);
        if (employee != null) {
            employeeMap.remove(employee.getName());
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

