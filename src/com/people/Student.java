package com.people;

import java.util.ArrayList;

public class Student extends Person {
    private static int id_gen=1;
    private int studentID;
    private String studentName;
    private String studentGender;
    private String studentAge;
    private ArrayList<Integer> grades;
    //constructor for Student class
        this.studentID = id_gen++;
        grades=new ArrayList<>();
    }
    public void addGrade(int grade){
        this.grades.add(grade);
    }

    public double calculateGpa() {
        int totalGrades=0;
        int totalCredits=0;
        for (Integer  grades: grades) {
            totalGrades += grades;
            totalCredits ++;
        }
        return (double)totalGrades/totalCredits;
    }
    @Override
    public String toString() {
    }
}
