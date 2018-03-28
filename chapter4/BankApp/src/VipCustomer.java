public class VipCustomer {
    private String fieldName;
    private double creditLimit;
    private String emailAddress;

    public VipCustomer() {
        this("Default field", 0.00, "email@email.com");
    }

    public VipCustomer(String fieldName, double creditLimit, String emailAddress) {
        this.fieldName = fieldName;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }

    VipCustomer(String emailAddress) {
        this("Secondary Default Field", 0.05, emailAddress);
    }

    public String getFieldName() {
        return fieldName;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
}
