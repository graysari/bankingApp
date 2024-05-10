import java.util.*;
public class Main{
    private int sel;    
    static ArrayList<Accounts> accts = new ArrayList<Accounts>();

    public int getSel() {
        return this.sel;
    }

    public void setSel(int sel) {
       this.sel = sel;
    }

    public static void main(String[] args) {
        Main main = new Main();
        accts.add(new Accounts(001, 123, "Reb", 552.50));
        accts.add(new Accounts(002, 456, "Jegs", 477.25));
        accts.add(new Accounts(003, 789, "Carj", 350.33));
        accts.add(new Accounts(004, 000, "Nick", 10.50));

        showRecords();
        accts.get(1).setBalance(55);
        System.out.println(accts.get(1).getBalance());

        

        

        boolean select = true;
        do{
        main.mainScr();
        main.select();
        switch (main.getSel()) {
            case 1: 
                    main.newScr();
                    main.logInScr();
                    main.select();
                        switch (main.getSel()) {
                            case 1:
                                System.out.println("enter password");
                                main.newScr();
                                break;
                            case 2:
                                System.out.println("case2");
                                main.newScr();
                                break;
                        
                            default:break;
                        }
                    break;
            case 2: new CreateAccount();
                    break;
            case 3: System.out.println("This is Exit");
                    select = false;
                    break;                
        
            default:
                    main.newScr();
                    System.out.println("Invalid Number. Please select a number again.");
                    main.mainScr();
                    break;
        }
    }while(select);


        
        
}


public void newScr(){
    System.out.println("\n*******************************************************************\n");
}
Scanner inp = new Scanner(System.in);
public void select(){    
    System.out.print("\nPlease Select: ");

    setSel(inp.nextInt());
}
public void mainScr(){
    System.out.println("1. Login");        
    System.out.println("2. Create account");        
    System.out.println("3. Exit");
}

public void logInScr(){
    System.out.println("1. Enter your ID number and Pin code");
    System.out.println("2. Back");
}


public static void showRecords(){
    int x=1;
    for(Accounts acct: accts)
    {
        System.out.println("account"+x++);
        System.out.println("Name: "+acct.getFullName());
        System.out.println("ID: "+acct.getIdNumber());
        System.out.println("Pin: "+acct.getPinCode());
        System.out.println("Balance: "+acct.getBalance());
        System.out.println();
    }

    }
}


class Accounts {
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
