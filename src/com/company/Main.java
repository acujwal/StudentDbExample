package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        String name, surname;
        String grade;
        String result = new String();

        Student student = new Student();
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the Student Name: \t");
        name = input.nextLine();

        System.out.println("Enter your Sur Name: \t");
        surname = input.nextLine();

        System.out.println("Enter the grade: \t");
        grade = input.nextLine();

        student.setName(name);
        student.setGrade(grade);
        student.setResult(result);


        System.out.println("Name of Student: " + name +" "+ surname );
        System.out.println("Grade of Student: " + grade);
        System.out.println("Result of the Student" + result);
        }

    }

