package homework13;

/**
 * Java Pro. Homework #13
 * @author Alexej Lange
 * @version 03 Aug 2022
 */

import homework11.ComparatorEmployee;
import homework11.InitDatabase;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamEmployees {
    public static void main(String[] args) {
        Collection<ComparatorEmployee> employees = InitDatabase.getInitData();

//        long counter = 0;
//        for (ComparatorEmployee employee : employees) {
/*        Iterator<ComparatorEmployee> iterator = employees.iterator();
        while (iterator.hasNext()) {
            ComparatorEmployee employee = iterator.next();
            if (employee.getPosition().equals("engineer")) {
                counter++;
            }
        }*/

        long counter = employees.stream()
                .filter(employee -> employee.getPosition().equals("engineer"))
                .count();
        System.out.println(counter);

        Collection<ComparatorEmployee> employee = employees.stream()
//                .filter(position -> position.getPosition().equals("engineer"))
                .filter(employ -> employ.getAge() > 40)
                .collect(Collectors.toList());
        System.out.println(employee);

        Collection<String> employeeNames = employees.stream()
                .filter(employ -> employ.getAge() > 40)
                .map(employ -> employ.getName().toUpperCase())
                .collect(Collectors.toList());
        System.out.println(employeeNames);

        Collection<String> employeePosition = employees.stream()
                .map(employ -> employ.getPosition().toLowerCase())
                .collect(Collectors.toSet());
        System.out.println(employeePosition);

//        создание карты имя => сотрудник
        Map<String,ComparatorEmployee> employeeMap = employees.stream()
                .collect(Collectors.toMap(employ -> employ.getName(), employ -> employ));
        System.out.println(employeeMap);

//        создание карты позиция => список сотрудников
        Map<String, Set<String>> positionMap = employees.stream()
                .collect(Collectors.groupingBy(
                        employ -> employ.getPosition(),
                        Collectors.mapping(employ -> employ.getName(), Collectors.toSet())
                ));
        System.out.println(positionMap);
    }


}
