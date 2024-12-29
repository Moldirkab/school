package com.people;

public class Teacher extends Person{
    private String subject;
    private int yearsOfExperience;
    private double salary;
    private double years;
    private double percentage;

        this.subject = subject;
        this.yearsOfExperience = yearsOfExperience;
        this.salary = salary;
    }
    public int getYearsOfExperience() {
        return yearsOfExperience;
    }
    public double giveRaise(int percentage){
        double increaseAmount=(percentage/100.0)*salary;
        salary+=increaseAmount;
        return salary;
    }
    public double getSalary(){
        return salary;
    }
    @Override
    public String toString() {
    }
}
