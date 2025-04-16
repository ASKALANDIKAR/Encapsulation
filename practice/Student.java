

//   Create a class Student with private fields: id, name, and marks.
//  Provide public getter and setter methods.
//  In the main class, create a Student object, set values using setters, and display them using getters

package com.practice;

public class Student {
    private int id;
    private String name;
    private int marks;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }
}

