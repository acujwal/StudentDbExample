package com.company;

public class Student {

    private String name;
    private String grade;
    private String result;


    public Student(){

        System.out.println(" The Student class has been created ");
        }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getResult() {
        result = name + "\n" + grade;
        return result;
    }
}
