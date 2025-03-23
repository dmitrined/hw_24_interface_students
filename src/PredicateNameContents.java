public class PredicateNameContents implements PredicateStudent{
    private String findString;

    public PredicateNameContents(String findString) {
        this.findString = findString;
    }

    @Override
    public boolean test(Student student) {
        return student.getLastNane().contains(findString) || student.getFirstName().contains(findString);
    }
}
