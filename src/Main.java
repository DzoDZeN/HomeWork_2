import java.util.*;

public class Main {


    public static void main(String[] args) {
        System.out.println("1 Task");
        String[] array = new String[]
                {"Winter", "Spring", "Summer", "Autumn", "Dog", "account",
                        "achieve", "action", "add", "age", "alphabet",
                        "animal", "Winter", "Spring", "Summer", "Autumn"};



        Set set = new HashSet(List.of(array));
        System.out.println(set);
        System.out.println("Уникальных слов: " + set.size());


        HashMap<String, Integer> hashMap = new HashMap();
        for (String word: array) {
            hashMap.put(word, hashMap.getOrDefault(word, 0) + 1);
        }
        System.out.println(hashMap + "\n");




        System.out.println("2 Task");
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("John", "88005553535");
        phoneBook.add("Anthony", "55557777");
        phoneBook.add("Eugene", "9384570977");
        phoneBook.add("Eugene", "938454357567568");
        phoneBook.add("Eugene", "938454357567568");

        phoneBook.print();

    }


}