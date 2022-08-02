package homework12.task2;

import java.util.Collection;
import java.util.HashSet;
import java.util.Map;
import java.util.TreeMap;

public class PhoneBook {
    private final Map<String, HashSet<String>> contacts;

    public PhoneBook() {
        contacts = new TreeMap<>();
    }

    public void addContacts(String name, String phone) {
        HashSet<String> phones = contacts.getOrDefault(name, new HashSet<>());
            phones.add(phone);
            contacts.put(name,phones);
    }

    public HashSet<String> getContacts(String name) {
        return contacts.getOrDefault(name, new HashSet<>());
    }

    @Override
    public String toString() {
        return "PhoneBook {" +
                    "contacts=" + contacts +
                    '}';
    }
}
