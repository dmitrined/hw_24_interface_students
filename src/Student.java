import java.util.Objects;

public class Student {
    private String firstName;
    private String lastNane;
    private String email;
    private String group;
    private double rating;

    public Student(String firstName, String lastNane, String email, String group) {
        this.firstName = firstName;
        this.lastNane = lastNane;
        this.email = email;
        this.group = group;
        this.rating = 0;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastNane() {
        return lastNane;
    }

    public String getEmail() {
        return email;
    }

    public String getGroup() {
        return group;
    }

    public double getRating() {
        return rating;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastNane='" + lastNane + '\'' +
                ", email='" + email + '\'' +
                ", group='" + group + '\'' +
                ", rating=" + rating +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Student student)) return false;
        return Double.compare(getRating(), student.getRating()) == 0 && Objects.equals(getFirstName(), student.getFirstName()) && Objects.equals(getLastNane(), student.getLastNane()) && Objects.equals(getEmail(), student.getEmail()) && Objects.equals(getGroup(), student.getGroup());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getFirstName(), getLastNane(), getEmail(), getGroup(), getRating());
    }

    public  void addRating(double addAmount) {
        if (addAmount > 0) {
            rating += addAmount;
        }

    }

}