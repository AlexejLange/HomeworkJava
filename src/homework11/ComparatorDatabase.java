package homework11;

import java.util.*;

public class ComparatorDatabase {
    protected List<ComparatorEmployee> employees = new ArrayList<>();
    protected Map<String, ComparatorEmployee> employeeMap = new HashMap<>();
    protected Set<String> positions =new HashSet<>();

    public void init() {
        Collection<ComparatorEmployee> addEmployees = InitDatabase.getInitData();

        employees.addAll(addEmployees);

        for (ComparatorEmployee employee : employees) {
            positions.add(employee.getPosition());
            employeeMap.put(employee.getName(),employee);
        }
    }

    public void create(ComparatorEmployee employee) {
        positions.add(employee.getPosition());
        employeeMap.put(employee.getName(),employee);
    }

    public String read() {
        StringBuilder sb = new StringBuilder();
        for (ComparatorEmployee employee : employeeMap.values()) {
            sb.append(employee).append("\n");
        }
        return sb.toString();
    }

    public void delete(String name) {
        ComparatorEmployee employee = employeeMap.get(name);
        if (employee != null) {
            employeeMap.remove(employee.getName());
        }
    }

    public String find(String name) {
        ComparatorEmployee employee = employeeMap.get(name);
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
