import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {


    public static void main(String[] args) {
        System.out.println("1 Task");
        String[] array = new String[]
                {"Winter", "Spring", "Summer", "Autumn", "Dog", "account",
                        "achieve", "action", "add", "age", "alphabet",
                        "animal", "Winter", "Spring", "Summer", "Autumn"};

        System.out.println(Arrays.toString(array));
        System.out.println(array.length + "\n");


        Set set = new HashSet();
        set.addAll(List.of(array));
        System.out.println(set);
        System.out.println(set.size() + "\n");


        System.out.println("2 Task" + "\n");
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("John", "88005553535");
        phoneBook.add("Anthony", "55557777");
        phoneBook.add("Eugene", "9384570977");
        phoneBook.add("Eugene", "938454357567568");
        System.out.println("John\n"+phoneBook.get("John")+"\n");
        System.out.println("Anthony\n"+phoneBook.get("Anthony")+"\n");
        System.out.println("Eugene\n"+phoneBook.get("Eugene")+"\n");

    }


}