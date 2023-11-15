package gr.aueb.codingfactory.other.datalabsthessalonikiexr.lesson3;

public class StudentClass {

    String studentName = " ";
    String studentID = " ";

    public StudentClass(String sName, String sID) {
        studentName = sName;
        studentID = sID;
        System.out.println("You have a new student! Welcome " + sName);
    }

    public StudentClass(String sName){
        studentName = sName;
        System.out.println("You have a new student! Welcome " + sName);
    }
    void studentInfo(){
        System.out.println(studentName);
        System.out.println(studentID);
    }
}
