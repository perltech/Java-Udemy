public class Bank {
    private int accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private int phoneNumber;


    public Bank() {
        this(5678, 2.50, "Default Name", "Default email", 1234);
    }

    public Bank(int accountNumber, double balance, String customerName, String email, int phoneNumber) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public Bank(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getEmail() {
        return email;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public double deposit(double amount) {
        this.balance += amount;
        return this.balance;
    }

    public double withdraw (double amount) {
        if(this.balance - amount >= 0) {
            this.balance -= amount;
            return this.balance;
        }
        System.out.println("Insufficient funds.");
        return -1;
    }

}
