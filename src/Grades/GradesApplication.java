package Grades;

import java.util.HashMap;
import java.util.Input;

public class GradesApplication {
    public static void main(String[] args) {
        HashMap<String, Student> students = new HashMap<>();

        Student student1 = new Student("Pao");
        student1.addGrade(100);
        student1.addGrade(90);
        student1.addGrade(95);
        student1.addGrade(97);

        Student student2 = new Student("Abby");
        student2.addGrade(94);
        student2.addGrade(97);
        student2.addGrade(93);
        student2.addGrade(91);

        Student student3 = new Student("Nichole");
        student3.addGrade(91);
        student3.addGrade(93);
        student3.addGrade(95);
        student3.addGrade(97);

        Student student4 = new Student("Tito");
        student4.addGrade(91);
        student4.addGrade(98);
        student4.addGrade(90);
        student4.addGrade(92);
}
