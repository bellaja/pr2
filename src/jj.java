import java.util.Comparator;

public class ComparatorClass implements Comparator<Person> {
    public ComparatorClass() {
    }

    public int compare(Person o1, Person o2) {
        return Integer.compare(o1.getSurname().length(), o2.getSurname().length());
    }
}
