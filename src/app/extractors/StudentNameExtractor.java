package app.extractors;

import app.Student;

public class StudentNameExtractor implements StudentInfoExtractor{
    @Override
    public String getInfo(Student s) {
        return s.getFirstName()+" "+s.getLastNane();
    }
}
