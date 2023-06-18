import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Main {
    public static void main(String[] args) {


        List<Person> valkyries = new ArrayList<>();
        valkyries.add(new Person("Kiana", "Kaslana", 16));
        valkyries.add(new Person("Raiden", "Mei", 18));
        valkyries.add(new Person("Bronya", "Zaychik", 16));
        valkyries.add(new Person("Murata", "Himeko", 27));
        valkyries.add(new Person("Theresa", "Apocalypse", 44));
        valkyries.add(new Person("Fu", "Hua", 50000));

        Collections.sort(valkyries, new ComparatorClass());
        System.out.println(valkyries);
    }
}