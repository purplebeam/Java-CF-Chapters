package gr.aueb.codingfactory.other.datalabsthessalonikiexr.lesson4;

public class Student {

    private String name = " ";
    private String am = " ";

    Student (String aName, String aAm){
        name = aName;
        am = aAm;
    }

    Student(String aName){
        name = aName;
        am = "99999";
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
