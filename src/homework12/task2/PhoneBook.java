package homework12.task2;

import java.util.HashSet;
import java.util.Map;
import java.util.TreeMap;

public class PhoneBook {
    private final Map<String, HashSet<String>> contacts;

    public PhoneBook() {
        contacts = new TreeMap<>();
    }

    public void addContacts(String name, String phone) {
//        if (!contacts.containsKey(name)) {
//            HashSet<String> phones = new HashSet<>();
//            phones.add(phone);
//            contacts.put(name,phones);
//        } else {
//            getContacts(name).add(phone);
//        }
        contacts.computeIfAbsent(name, k -> new HashSet<>()).add(phone);
    }

//    В итоге добавил метод getOrDefault в котором вроде разобрался как работает.
//    И пока искал его описание нашел метод computeIfAbsent, применил его, но только частично
//    понял как он работает. Понятна логика как он добавляет новое значение в Мар, но
//    не понятно как он добавляет новое значение в уже имеющееся множество.

    public HashSet<String> getContacts(String name) {
        return contacts.getOrDefault(name, new HashSet<>());
    }

    @Override
    public String toString() {
        return "PhoneBook{" +
                    "contacts=" + contacts +
                    '}';
    }
}
