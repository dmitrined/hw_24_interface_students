import java.util.Comparator;

public class ComparatorByLastName implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return o1.getLastNane().compareToIgnoreCase(o2.getLastNane());
    }
}
