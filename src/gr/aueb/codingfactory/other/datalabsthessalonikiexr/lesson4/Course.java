package gr.aueb.codingfactory.other.datalabsthessalonikiexr.lesson4;

import java.util.ArrayList;

public class Course {

    private String title = " ";
    private String code = " ";
    private ArrayList<Student> students = new ArrayList<>();

    public Course(String aTitle, String aCode) {
        title = aTitle;
        code = aCode;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void addStudent(Student aStudent){
        students.add(aStudent);
    }

    public void printStudents(){
        for(Student student:students){
            System.out.println(student);
        }
    }
    @Override
    public String toString() {
        return "Course: " +title+", "+code;
    }
}
