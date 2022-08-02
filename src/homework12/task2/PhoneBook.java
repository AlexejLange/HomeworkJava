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
        if (!contacts.containsKey(name)) {
            HashSet<String> phones = new HashSet<>();
            phones.add(phone);
            contacts.put(name,phones);
        } else {
            getContacts(name).add(phone);
        }
    }

    public HashSet<String> getContacts(String name) {
        return contacts.get(name);
    }

    @Override
    public String toString() {
        return "PhoneBook{" +
                    "contacts=" + contacts +
                    '}';
    }
}
