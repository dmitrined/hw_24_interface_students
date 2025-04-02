package app;

import app.comparators.ComparatorByFirstName;
import app.comparators.ComparatorByGroup;
import app.comparators.ComparatorByLastName;
import app.comparators.ComparatorByRating;
import app.extractors.StudentInfoExtractor;
import app.predicates.PredicateStudent;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Students {
    private List<Student> students;

    private Students() {
        this.students = new ArrayList<>();
    }

    public List<Student> getStudents() {
        return students;
    }

    @Override
    public String toString() {
        return "app.Students{" +
                "students=" + students +
                '}';
    }

    public static void print(List<Student> list) {
        for (Student student : list) {
            System.out.println(student);
        }
    }

    public static List<Student> sort(List<Student> list, Comparator<Student> comparator) {
        List<Student> result = new ArrayList<>(list);
        Collections.sort(result, comparator);
        return result;
    }

    public static List<String> getStudentsByCondition(List<Student> list,
                                                      StudentInfoExtractor extractor,
                                                      PredicateStudent predicate) {
        List<String> result = new ArrayList<>();
        for (Student student : list) {
            if (predicate.test(student)) {
                result.add(extractor.getInfo(student));
            }
        }
        return result;
    }

    public static boolean hasStudent(List<Student> students, Student student) {
        return students.contains(student);
    }
   public static void printingMethod(){

   }

    public static Comparator<Student> comparatorByFirstName() {
        return new ComparatorByFirstName();
    }

    public static Comparator<Student> comparatorByLastName() {
        return new ComparatorByLastName();
    }

    public static Comparator<Student> comparatorByGroup() {
        return new ComparatorByGroup();
    }

    public static Comparator<Student> comparatorByRating() {
        return new ComparatorByRating();

    }

}





