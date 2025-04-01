package app;

import app.extractors.StudentInfoExtractor;
import app.extractors.StudentNameExtractor;
import app.predicates.PredicateByGroup;
import app.predicates.PredicateRatingFromTo;

import java.util.ArrayList;
import java.util.List;

public class Univer {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Иван", "Иванов", "ivanov@mail.com", "Группа1"));
        studentList.add(new Student("Петр", "Петров", "petrov@mail.com", "Группа2"));
        studentList.add(new Student("Анна", "Сидорова", "sidorova@mail.com", "Группа1"));
        studentList.add(new Student("Елена", "Смирнова", "smirnova@mail.com", "Группа3"));
        studentList.add(new Student("Алексей", "Кузнецов", "kuznetsov@mail.com", "Группа2"));
        studentList.add(new Student("Ольга", "Попова", "popova@mail.com", "Группа4"));
        studentList.add(new Student("Дмитрий", "Васильев", "vasilyev@mail.com", "Группа3"));
        studentList.add(new Student("Юлия", "Федорова", "fedorova@mail.com", "Группа4"));

        // Увеличиваю рейтиг всем студентам на 3
        for (Student student : studentList) {
            student.addRating(3);
        }
        // увеличиваю рейтинг у студета 2 на 1 ;  у 5 на 1.5
        studentList.get(2).addRating(1);
        studentList.get(5).addRating(1.5);

        // печатаю список студентов
        Students.print(studentList); // static

        System.out.println("--отсортированный список студентов sortByFirstName--");
        List<Student> sortByFirstName = Students.sort(studentList, Students.comparatorByFirstName());
        Students.print(sortByFirstName);

        System.out.println("--отсортированный список студентов sortByRating--");
        List<Student> sortByRating = Students.sort(studentList,Students.comparatorByRating());
        Students.print(sortByRating);

        System.out.println("--отобрать студентов имя и фамилия из группы Группа1--");
        StudentInfoExtractor nameExtractor = new StudentNameExtractor();
        PredicateByGroup groupPredicate = new PredicateByGroup("Группа1");
        List<String> group1Students = Students.getStudentsByCondition(studentList, nameExtractor, groupPredicate);
        for (String name : group1Students) {
            System.out.println(name);
        }
        System.out.println("--Студенты с рейтингом от 3.5 до 5--");
        StudentInfoExtractor nameExtractor2 = new StudentNameExtractor();
        PredicateRatingFromTo ratingPredicate = new PredicateRatingFromTo(3.5, 5);
        List<String> ratingStudents = Students.getStudentsByCondition(studentList, nameExtractor2, ratingPredicate);
        for (String name : ratingStudents) {
            System.out.println(name);
        }

        System.out.println("Проверка наличия студента в списке");
        Student studentToCheck = new Student("Петр", "Петров", "petrov@mail.com", "Группа2");
        studentToCheck.addRating(3);
        boolean containsStudent = Students.hasStudent(studentList, studentToCheck);
        System.out.println(containsStudent);


    }
}