package lesson5;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {


        List<Student> students = Arrays.asList(
                new Student("Ivanov", Arrays.asList(3.0, 5.0, 4.0, 4.0, 5.0), "Informatics"),
                new Student("Petrov", Arrays.asList(4.0, 5.0, 5.0, 5.0, 4.0), "Mathematics"),
                new Student("Sidorov", Arrays.asList(5.0, 5.0, 5.0, 4.0, 5.0), "Informatics"),
                new Student("Maksimova", Arrays.asList(5.0, 3.0, 5.0, 5.0, 5.0), "Informatics"),
                new Student("Alekseev", Arrays.asList(5.0, 5.0, 5.0, 5.0, 5.0), "Informatics"),
                new Student("Aleksandrova", Arrays.asList(4.0, 5.0, 5.0, 5.0, 4.0), "Mathematics"),
                new Student("Borisov", Arrays.asList(4.0, 4.0, 5.0, 4.0, 4.0), "Mathematics"),
                new Student("Vasiliev", Arrays.asList(4.0, 5.0, 5.0, 5.0, 4.0), "Informatics"),
                new Student("Antonova", Arrays.asList(3.0, 3.0, 4.0, 3.0, 4.0), "Informatics"),
                new Student("Kirillov", Arrays.asList(4.0, 4.0, 5.0, 5.0, 4.0), "Informatics"),
                new Student("Nikolaev", Arrays.asList(3.0, 4.0, 5.0, 5.0, 5.0), "Informatics")
        );

        List<Student> filteredStudents = students.stream()
                .filter(student -> student.getSpecialty().equals("Informatics"))
                .filter(student -> student.getAverageGrade() > 4.5)
                .sorted((s1, s2) -> Double.compare(s2.getAverageGrade(), s1.getAverageGrade()))
                .limit(5)
                .collect(Collectors.toList());

        System.out.println("Список первых 5 студентов специальности \"Informatics\" " +
                "со средним баллом выше 4.5, отсортированных по убыванию среднего балла");

        filteredStudents.stream()
                .forEach(student -> System.out.println(student.getName() + ": " + student.getAverageGrade()));

    }
}
