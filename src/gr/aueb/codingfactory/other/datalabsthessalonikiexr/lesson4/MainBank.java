package gr.aueb.codingfactory.other.datalabsthessalonikiexr.lesson4;

public class MainBank {

    public static void main(String[] args) {

        Customer customer1 = new Customer("Konstantinos","1234");
        Customer customer2 = new Customer("Giannis", "2345");
        Customer customer3 = new Customer("Konstantina","6543");

        Account account1 = new Account("111",1500);
        Account account2 = new Account("121",1000);
        Account account3 = new Account("131",800);

        customer1.setAccount(account2);

        customer1.printInfo();
        customer1.getAccount().printInfo();
    }
}
