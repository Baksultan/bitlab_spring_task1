package com.example.techordaspring.db;

import com.example.techordaspring.models.Student;

import java.util.ArrayList;

public class DBManager {
    static ArrayList<Student> studentsList = new ArrayList<>();

    static {
        studentsList.add(new Student(1L, "Baksultan", "Amangeldi", 90, "A"));
        studentsList.add(new Student(2L, "Ilyas", "Zhuanyshev", 88, "B"));
        studentsList.add(new Student(3L, "Serik", "Erikov", 91, "A"));
        studentsList.add(new Student(4L, "Erik", "Serikov", 65, "C"));
        studentsList.add(new Student(5L, "Nurzhan", "Bolatov", 48, "F"));
        studentsList.add(new Student(6L, "Patrick", "Zuckerberg", 100, "A"));
        studentsList.add(new Student(7L, "Sabina", "Assetova", 33, "F"));
        studentsList.add(new Student(8L, "Madina", "Adletova", 77, "B"));
    }

    public static ArrayList<Student> getAllStudents() {
        return studentsList;
    }

    public static void addStudent(Student student) {
        student.setId((long) (studentsList.size()+1));
        if (student.getExam()>=90) {
            student.setMark("A");
        } else if (student.getExam()>=75 && student.getExam()<=89) {
            student.setMark("B");
        } else if (student.getExam()>=60 && student.getExam()<=74) {
            student.setMark("C");
        } else if (student.getExam()>=50 && student.getExam()<=59) {
            student.setMark("D");
        } else {
            student.setMark("F");
        }
        studentsList.add(student);
    }
}
