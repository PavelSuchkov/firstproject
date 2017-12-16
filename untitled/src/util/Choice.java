package util;

import java.util.ArrayList;
import java.util.Collections;

import static util.Subject.Student;

public class Choice {

    public static void main(String[] args) {
        Student student = Student.newBuilder().setLastname("hello").setUserId("habr").build();
        Student student1 = Student.newBuilder().setLastname("hello").setUserId("habr").build();

        ArrayList<Student> list = arrayBuilder(student, student1);
        for (Student s : list) {
            s.showInfo();
        }
    }

    private static ArrayList<Student> arrayBuilder(Student... student) {
        ArrayList<Student> listStudent = new ArrayList<>();
        Collections.addAll(listStudent, student);
        return listStudent;
    }
}
