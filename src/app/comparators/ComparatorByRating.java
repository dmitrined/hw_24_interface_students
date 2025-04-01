package app.comparators;

import app.Student;

import java.util.Comparator;

public class ComparatorByRating implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return Double.compare(o1.getRating(),o2.getRating());
    }
}
