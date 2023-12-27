import java.util.Map;
import java.util.TreeMap;

public class PhoneBook {
    private final Map<String, String> phoneBook = new TreeMap<>();

    public void add(String surname, String number) {
        if (phoneBook.get(surname) == null)
            phoneBook.put(surname, number);
        else if (!phoneBook.get(surname).contains(number)){
            phoneBook.put(surname, phoneBook.get(surname) + ", " + number);
        }
    }

    public String get(String surname) {
        return phoneBook.get(surname);
    }

    public void print() {
        for (var item : phoneBook.keySet()) {
            System.out.println(item + " " + phoneBook.get(item));
        }
    }
}
