package app.predicates;

import app.Student;

public class PredicateByGroup implements PredicateStudent{
   private String findString;

    public PredicateByGroup(String findString) {
        this.findString = findString;
    }

    @Override
    public boolean test(Student student) {

        return student.getGroup().equalsIgnoreCase(findString);
    }
}
