public class StudentNameExtractor implements StudentInfoExtractor{
    @Override
    public String getInfo(Student s) {
        return s.getFirstName()+" "+s.getLastNane();
    }
}
