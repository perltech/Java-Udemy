public class Bank {
    int accountNumber;
    double balance;
    String customerName;
    String email;
    int phoneNumber;

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
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
        if(this.balance - amount > 0) {
            this.balance -= amount;
            return this.balance;
        }
        System.out.println("Insufficient funds.");
        return -1;
    }

}
