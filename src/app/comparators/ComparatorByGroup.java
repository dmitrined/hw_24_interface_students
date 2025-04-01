package app.comparators;

import app.Student;

import java.util.Comparator;

public class ComparatorByGroup implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return o1.getGroup().compareToIgnoreCase(o2.getGroup());
    }
}
