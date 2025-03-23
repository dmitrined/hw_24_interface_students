public class PredicateGroupContents implements PredicateStudent{
   private String findString;

    public PredicateGroupContents(String findString) {
        this.findString = findString;
    }

    @Override
    public boolean test(Student student) {
        return student.getGroup().contains(findString);
    }
}
