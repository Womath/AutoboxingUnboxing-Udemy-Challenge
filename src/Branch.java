import java.util.ArrayList;

public class Branch {
    private String name;
    private ArrayList<Customer> customers;

    public Branch(String name) {
        this.name = name;
        this.customers = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public boolean newCustomer(String name, double amount) {
        Customer customer = findCustomer(name);

        if (customer == null) {
            customers.add(new Customer(name, amount));
            return true;
        } else {
            return false;
        }
    }

    public boolean addCustomerTransaction(String name, double amount) {
        Customer customer = findCustomer(name);

        if (customer == null) {
            return false;
        } else {
            customer.addTransaction(amount);
            return true;
        }
    }

    private Customer findCustomer(String name) {
        for (Customer customer : customers) {
            if (customer.getName().equals(name)) {
                return customer;
            }
        }

        return null;
    }
}
