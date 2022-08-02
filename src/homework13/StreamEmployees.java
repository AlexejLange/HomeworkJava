package homework13;

import homework11.ComparatorEmployee;
import homework11.InitDatabase;

import java.util.Collection;
import java.util.Iterator;

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
    }
}
