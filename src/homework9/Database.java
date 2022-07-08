package homework9;

import java.util.*;

public class Database {
    protected List<Employee> employees = new ArrayList<>();
    protected Set<String> positions =new HashSet<>();

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
        }
    }

    public void create(Employee employee) {
        employees.add(employee);
        positions.add(employee.getPosition());
    }

    public String read() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < employees.size(); i++) {
            sb.append(i).append(": ").append(employees.get(i)).append("\n");
        }
        return sb.toString();
    }

    public void update(int  index, Employee employee) {
        employees.set(index, employee);
        positions.add(employee.getPosition());
    }

    public void delete(int index) {
        employees.remove(index);
    }

    public String getPositions() {
        StringBuilder sb = new StringBuilder();
        for (String position : positions) {
            sb.append(position).append("\n");
        }
        return sb.toString();
    }
}

