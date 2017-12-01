package Grades;

import java.util.ArrayList;

public class Student {
    private String name;
    private ArrayList<Integer> grades;

    //constructor that takes in a name argument and uses it to set the name
    public Student (String name) {
        this.name = name;
        grades = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addGrade(int grade) {
        grades.add(grades);
    }

    public double getGradeAverage() {
        int numberOfGrades = grades.size();
        double sumOfAllGrades = 0;
        double average;

    for (int grade : grades) {
        sumOfAllGrades += grade;
    }

    average = sumOfAllGrades / numberOfGrades;
    return average;

    }

    public static void main(String[] args) {
        System.out.println("Testing the student class");
        Student student = new Student("Maggie");

        System.out.println("Make sure we start with an empty arrayList of grades");
        System.out.println("The number of elements in the grades array is " + student.grades.size());

        System.out.println("Now we'll add 3 grades: a 92, an 80, and a 95");
        student.addGrade(92);
        student.addGrade(80);
        student.addGrade(95);

        double expectedGrade = (92 + 80 + 95) / 3;
        System.out.println("The expected average is " + expectedGrade);
        System.out.println("The average produced by .getAverageGrade is " + student.grades.size());

    }
}
