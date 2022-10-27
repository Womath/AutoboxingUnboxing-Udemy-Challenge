import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Branch> branches;

    public Bank(String name) {
        this.name = name;
        branches = new ArrayList<>();
    }

    public boolean addBranch(String name) {
        Branch branch = findBranch(name);
        if (branch == null) {
            branches.add(new Branch(name));
            return true;
        } else {
            return false;
        }
    }

    public boolean addCustomer(String branchName, String customerName, double amount) {
        Branch branch = findBranch(branchName);
        if (branch == null) {
            return false;
        } else {
            return branch.newCustomer(customerName, amount);
        }
    }

    public boolean addCustomerTransaction(String branchName, String customerName, double amount) {
        Branch branch = findBranch(branchName);
        if (branch == null) {
            return false;
        } else {
            return branch.addCustomerTransaction(customerName, amount);
        }
    }

    private Branch findBranch(String name) {
        for (Branch branch : branches) {
            if (branch.getName().equals(name)) {
                return branch;
            }
        }
        return null;
    }

    public boolean listCustomers(String branchName, boolean printTransactions) {
        Branch branch = findBranch(branchName);
        if (branch == null) {
            return false;
        } else {
            System.out.println("Customer details for branch " + branch.getName());
            ArrayList<Customer> customers = branch.getCustomers();
            if (printTransactions) {
                for (Customer customer : customers) {
                    System.out.println("Customer: " + customer.getName() + "[" + (customers.indexOf(customer) + 1) + "]");
                    ArrayList<Double> transactions = customer.getTransactions();
                    System.out.println("Transactions");
                    for (Double amount : transactions) {
                        System.out.println("[" + (transactions.indexOf(amount) + 1) + "] Amount " + amount);
                    }

                }
            } else {
                for (Customer customer : customers) {
                    System.out.println("Customer: " + customer.getName() + "[" + (customers.indexOf(customer) + 1) + "]");
                }
            }
        }
        return true;
    }
}
