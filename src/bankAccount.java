public class bankAccount {
    private String accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public bankAccount(String accountNumber, double balance, String customerName, String email, String phoneNumber) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void deposit(double amount) {
        if (amount >= 0) {
            this.balance += amount;
            System.out.println(
                    this.customerName + " Deposited: " + amount + " To your AccountNumber: # " + this.accountNumber
                            + " Your new balance: P" + this.balance);
        } else {
            System.out.println(
                    "Invalid amount." + " if you have concern please use your email to contact us: " + this.email);
        }
    }

    public void withdraw(double amount) {
        if (amount <= this.balance) {
            this.balance -= amount;
            System.out.println(
                    this.customerName + " Withdrawn: P" + amount + " To your AccountNumber: # " + this.accountNumber
                            + " Your new balance: P" + this.balance);
        } else {
            System.out.println("Invalid amount or insufficient funds."
                    + " if you have concern please use your email to contact us: " + this.email);
        }
    }
}