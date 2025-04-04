package app.comparators;

import app.Student;

import java.util.Comparator;

public class ComparatorByFirstName implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return o1.getFirstName().compareToIgnoreCase(o2.getFirstName());
    }
}
