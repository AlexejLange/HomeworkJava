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

    public void printListComparator() {
//        Comparator<ComparatorEmployee> comparatorName = (o1, o2) -> o1.getName().compareTo(o2.getName());
        Comparator<ComparatorEmployee> comparatorAge = (o1, o2) -> o2.getAge().compareTo(o1.getAge());
//        employees.sort(comparatorName);
        employees.sort(comparatorAge);
        for (ComparatorEmployee employee : employees) {
            System.out.println(employee);
        }
    }

    public void printListComparable() {
        Set<ComparatorEmployee> sortList = new TreeSet<>(employees);
        for (ComparatorEmployee employee : sortList) {
            System.out.println(employee);
        }
    }
}
