public class Accounts {
    private int idNumber;
    private int pinCode;
    private String fullName;
    private double balance;

    public Accounts(int idNumber, int pinCode, String fullName, double balance) {
        this.idNumber = idNumber;
        this.pinCode = pinCode;
        this.fullName = fullName;
        this.balance = balance;
    }

    public int getIdNumber() {
        return this.idNumber;
    }

    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }

    public int getPinCode() {
        return this.pinCode;
    }

    public void setPinCode(int pinCode) {
        this.pinCode = pinCode;
    }

    public String getFullName() {
        return this.fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public double getBalance() {
        return this.balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    
}
