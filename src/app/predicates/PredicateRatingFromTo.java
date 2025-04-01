package app.predicates;

import app.Student;

public class PredicateRatingFromTo implements PredicateStudent{
     private double from;
      private double to;

    public PredicateRatingFromTo(double from, double to) {
        this.from = from;
        this.to = to;
    }

    @Override
    public boolean test(Student student) {

        return student.getRating()>from && student.getRating()<to;
    }


}
