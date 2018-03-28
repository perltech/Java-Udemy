public class Main {
    public static void main(String[] args) {
        Bank noah = new Bank(1234,1234,"noah", "email", 569708);
        Bank test = new Bank(768239);
        System.out.println(noah);
        System.out.println(test);
//
//        System.out.println(noah.getAccountNumber());
//        System.out.println(noah.getBalance());
//        System.out.println(noah.getCustomerName());
//        System.out.println(noah.getEmail());
//        System.out.println(noah.getPhoneNumber());
//        noah.deposit(1000);
//        System.out.println(noah.getBalance());
//        noah.withdraw(500);
//        System.out.println(noah.getBalance());
//        System.out.println(test.getBalance());
//        System.out.println(test.getAccountNumber());

        VipCustomer megan = new VipCustomer("megan", 250.00, "megan@email.com");
        VipCustomer noster = new VipCustomer("email@email.com");

        System.out.println(megan);
        System.out.println(noster);

        System.out.println(megan.getFieldName() + " " + megan.getCreditLimit() + " " + megan.getEmailAddress() );
        System.out.println(noster.getFieldName() + " " + noster.getCreditLimit() + " " + noster.getEmailAddress());
    }
}
