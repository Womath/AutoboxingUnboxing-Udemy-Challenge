public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank("National Australia Bank");

        boolean addBranch = bank.addBranch("Adelaide");
        System.out.println("Add Branch: " + addBranch);

        boolean addCustomer1 = bank.addCustomer("Adelaide", "Tim", 50.05);
        System.out.println("Add Customer 1: " + addCustomer1);
        boolean addCustomer2 = bank.addCustomer("Adelaide", "Mike", 175.34);
        System.out.println("Add Customer 2: " + addCustomer2);
        boolean addCustomer3 = bank.addCustomer("Adelaide", "Percy", 220.12);
        System.out.println("Add Customer 3: " + addCustomer3);

        boolean addTransaction1 = bank.addCustomerTransaction("Adelaide", "Tim", 44.22);
        System.out.println("Add Transaction 1: " + addTransaction1);
        boolean addTransaction2 = bank.addCustomerTransaction("Adelaide", "Tim", 12.44);
        System.out.println("Add Transaction 2: " + addTransaction2);
        boolean addTransaction3 = bank.addCustomerTransaction("Adelaide", "Mike", 1.65);
        System.out.println("Add Transaction 3: " + addTransaction3);

        boolean listCustomersTrue = bank.listCustomers("Adelaide", true);
        System.out.println("Customers listed: " + listCustomersTrue);

        boolean listCustomersFalse = bank.listCustomers("Adelaide", false);
        System.out.println("Customers listed: " + listCustomersFalse);
    }
}