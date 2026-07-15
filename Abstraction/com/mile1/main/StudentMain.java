package com.mile1.main;

import com.mile1.bean.Student;
import com.mile1.service.StudentService;

public class StudentMain {

    public static void main(String[] args) {

        Student[] data = new Student[4];

        data[0] = new Student("Sekhar",
                new int[] {85, 75, 95});

        data[1] = new Student(null,
                new int[] {11, 22, 33});

        data[2] = null;

        data[3] = new Student("Manoj", null);

        StudentService service = new StudentService();

        System.out.println(
                "Null Marks Array = "
                        + service.findNumberOfNullMarksArray(data));

        System.out.println(
                "Null Name = "
                        + service.findNumberOfNullNames(data));

        System.out.println(
                "Null Objects = "
                        + service.findNumberOfNullObjects(data));
    }
}