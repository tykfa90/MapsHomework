import java.util.HashMap;
import java.util.Map;

public class Runner {
    public static void main(String[] args) {

        //3.a
        Map<String, Person> personMap = new HashMap<>();

        //3.b
        personMap.put("Jan", new Person("Jan", 20));
        personMap.put("Adam", new Person("Adam", 35));
        personMap.put("Jan", new Person("Jan", 20));
        personMap.put("Jan", new Person("Jan", 20));
        personMap.put("Zofia", new Person("Zofia", 41));

        //3.c
        System.out.println("Rozmiar mapy to: " + personMap.size());

        //3.d
        System.out.println("Klucze w mapie to: ");
        for (String key : personMap.keySet()) {
            System.out.println(key);
        }

        //3.e
        System.out.println("Wartości mapy to: ");
        for (Person person : personMap.values()) {
            System.out.println(person);
        }

        //3.f
        System.out.println("\nPary klucz - wartość w mapie to: ");
        for (Map.Entry<String, Person> entry : personMap.entrySet()) {
            System.out.println(entry);
        }

        //3.g
        System.out.println("\nCzy w mapie występupje szukany klucz? " + personMap.containsKey("Adam"));

        //3.h
        System.out.println("\nWartość klucza \"Zofia\" to: " + personMap.get("Zofia"));

        //3.i
        System.out.println("\nWartość domyślna dla klucza \"Zenon\" to: " + personMap.getOrDefault("Zenon", new Person("Zenon", 30)));

        //3.j
        Person putReturnValue = personMap.put("Adam", new Person("Adam", 41));
        System.out.println("\nDodana przez metodę wartość obiektu to: " + putReturnValue);

        //3.k
        System.out.println("\nWartość dla klucza, którego nie ma to: " + personMap.get("Bogdan"));
    }
}
