package gr.aueb.codingfactory.other.datalabsthessalonikiexr.lesson4;

import java.security.PrivilegedAction;

public class Customer {

    private String name = "";
    private String vatNumber = " ";
    private Account account;

    public Customer(String name, String vatNumber){
        this.name = name;
        this.vatNumber = vatNumber;
    }

    public void setAccount(Account account){
        this.account = account;
    }

    public Account getAccount() {
        return account;
    }

    public void printInfo(){
        System.out.println(this.name + " " + this.vatNumber);
    }
}
