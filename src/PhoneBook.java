import java.util.Map;
import java.util.TreeMap;

public class PhoneBook {
    private Map<String, String> phoneBook = new TreeMap<>();

    public void add(String surname, String number) {
        if (phoneBook.get(surname) == null)
            phoneBook.put(surname, number);
        else {
            phoneBook.put(surname, phoneBook.get(surname) + "\n" + number);
        }
    }
    public String get(String surname){
        return phoneBook.get(surname);
    }
}
