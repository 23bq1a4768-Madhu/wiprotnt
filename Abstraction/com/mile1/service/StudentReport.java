package com.mile1.service;

import com.mile1.bean.Student;
import com.mile1.exception.NullMarksArrayException;
import com.mile1.exception.NullNameException;
import com.mile1.exception.NullStudentObjectException;

public class StudentReport {

    public String validate(Student s)
            throws NullNameException,
                   NullMarksArrayException,
                   NullStudentObjectException {

        if (s == null)
            throw new NullStudentObjectException();

        if (s.getName() == null)
            throw new NullNameException();

        if (s.getMarks() == null)
            throw new NullMarksArrayException();

        int sum = 0;

        for (int mark : s.getMarks()) {
            sum += mark;
        }

        double avg = sum / s.getMarks().length;

        if (avg >= 40)
            return "PASS";
        else
            return "FAIL";
    }
}