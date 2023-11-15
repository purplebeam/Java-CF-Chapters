package gr.aueb.codingfactory.other.datalabsthessalonikiexr.lesson3;

public class MainUniversity {

    public static void main(String[] args) {

        StudentClass student1 = new StudentClass("Konstantinos");
        StudentClass student2 = new StudentClass("Eleni","654321");

//        student1.studentName = "Konstantinos";
//        student1.studentID = "123456";
//
//        student2.studentName = "Eleni";
//        student2.studentID = "654321";

        student1.studentInfo();
        student2.studentInfo();
    }
}
