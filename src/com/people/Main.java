package com.people;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        File fileStudents =new File("/Users/aidynkabdykarimov/Downloads/students.txt");
        File fileTeachers =new File("/Users/aidynkabdykarimov/Downloads/teachers.txt");
        Scanner scanner=new Scanner(fileStudents);
        Scanner scanner2=new Scanner(fileTeachers);
        School school=new School();
        while (scanner.hasNextLine()) {
            String name = scanner.next();
            String surname = scanner.next();
            int age = Integer.parseInt(scanner.next());
            String gender = scanner.next();
            while (scanner.hasNextInt()) {
                student.addGrade(scanner.nextInt());
            }
            school.addMember(student);

        }
        while (scanner2.hasNextLine()) {
            String name = scanner2.next();
            String surname = scanner2.next();
            int age = Integer.parseInt(scanner2.next());
            String gender = scanner2.next();
            String subject=scanner2.next();
            int yearsOfExperience = Integer.parseInt(scanner2.next());
            int salary=Integer.parseInt(scanner2.next());
            school.addMember(teacher);

        }
        for(Person person:school.getMembers()){
            if(person instanceof Student ) {
                if (person.getName().equals("Luna")) {
                    System.out.println("The gpa for " + person.getName() + " is " + ((Student)person).calculateGpa());
                }
                if (person.getName().equals("Hermione")) {
                    System.out.println("The gpa for " + person.getName() + " is " + ((Student)person).calculateGpa());
                }

            }
            if(person instanceof Teacher){
                if(((Teacher)person).getYearsOfExperience()>=10){
                    System.out.println("The increased salary for "+ person.getName()+ " is "+  ((Teacher)person).giveRaise(20));
                }
            }
        }
        school.bubbleSort();
        System.out.println("\nThe list of people who study or work at the school:");
        school.print();


    }
}