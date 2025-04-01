package app.predicates;

import app.Student;

public class PredicateByName implements PredicateStudent{
    private String findString;

    public PredicateByName(String findString) {
        this.findString = findString;
    }

    @Override
    public boolean test(Student student) {
        return student.getLastNane().equalsIgnoreCase(findString) || student.getFirstName().equalsIgnoreCase(findString);
    }
}
