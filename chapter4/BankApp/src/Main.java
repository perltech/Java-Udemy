public class Main {
    public static void main(String[] args) {
        Bank noah = new Bank();

        noah.setAccountNumber(123);
        System.out.println(noah.getAccountNumber());
        noah.setBalance(1000.56);
        System.out.println(noah.getBalance());
        noah.setCustomerName("Noah");
        System.out.println(noah.getCustomerName());
        noah.setEmail("email@email.com");
        System.out.println(noah.getEmail());
        noah.setPhoneNumber(7207929);
        System.out.println(noah.getPhoneNumber());
        noah.deposit(1000);
        System.out.println(noah.getBalance());
        noah.withdraw(500);
        System.out.println(noah.getBalance());
    }
}
