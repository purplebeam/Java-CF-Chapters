package gr.aueb.codingfactory.other.datalabsthessalonikiexr.lesson4;

import java.util.ArrayList;

public class Student {

    private String name = " ";
    private String am = " ";

    private Course course;

    private ArrayList<Course> courses;

    Student (String name, String am){
        this.name = name;
        this.am = am;
        courses = new ArrayList<Course>();
    }

    Student(String aName){
        name = aName;
        am = "99999";
        courses = new ArrayList<Course>();
    }

    public void addCourse(Course aCourse) {
        courses.add(aCourse);
        aCourse.addStudent(this);
    }

    public void printCourse(){
        for(Course course : courses) {
            System.out.println(course);
        }
    }
    public String getAm() {
        return am;
    }

    public void setAm(String aAm){
        if(am.equals("99999")) {
            am = aAm;
        }
    }

    void  printInfo(){
        System.out.println(name + " " + am);
    }

    @Override
    public String toString() {
        return "name: " + name +" ,am: " + am;
    }
}
