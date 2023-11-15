package gr.aueb.codingfactory.other.datalabsthessalonikiexr.lesson4;

public class MainUniversity {

    public static void main(String[] args) {

        Student s1 = new Student("Nikos", "142536");
        Student s2 = new Student("Eleni", "142535");
        Student s3 = new Student("Anna");

        s1.printInfo();
        s2.printInfo();
        s3.printInfo();

        s3.setAm("1212");

        System.out.println(s3);

    }
}
