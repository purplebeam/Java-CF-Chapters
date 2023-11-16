package gr.aueb.codingfactory.other.datalabsthessalonikiexr.lesson4;

public class MainUniversity {

    public static void main(String[] args) {

        Student s1 = new Student("Nikos", "142536");
        Student s2 = new Student("Eleni", "142535");
        Student s3 = new Student("Anna");

        Course c1 = new Course("Java","101");
        Course c2 = new Course("Math","203");
        Course c3 = new Course("Networking","502");
//
//        s1.printInfo();
//        s2.printInfo();
//        s3.printInfo();
//
//        s3.setAm("1212");
//
//        System.out.println(s3);



        s1.addCourse(c1);
        s1.addCourse(c3);
        s3.addCourse(c2);
        s1.printCourse();
        s3.printCourse();
        c2.printStudents();

    }
}
