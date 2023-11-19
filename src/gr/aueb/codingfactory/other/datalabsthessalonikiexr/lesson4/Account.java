package gr.aueb.codingfactory.other.datalabsthessalonikiexr.lesson4;

public class Account {

    private double amount = 0;
    private String accountNumber = "";

    public Account(String accountNumber, double amount){
        this.accountNumber = accountNumber;
        this.amount = amount;
    }

    public void printInfo(){
        System.out.println(this.accountNumber + " " + this.amount);
    }
}
