import java.util.*;
public class Main{
    private int sel;    
    static ArrayList<Accounts> accts = new ArrayList<Accounts>();




    public Main(){
        
        accts.add(new Accounts(001, 123, "Reb", 552.50));
        accts.add(new Accounts(002, 456, "Jegs", 477.25));
        accts.add(new Accounts(003, 789, "Carj", 350.33));
        accts.add(new Accounts(004, 000, "Nick", 10.50));

    }

    public int getSel() {
        return this.sel;
    }

    public void setSel(int sel) {
       this.sel = sel;
    }

    public void newScr(){
        System.out.println("\n*******************************************************************\n");
    }
    public void select(){
        Scanner inp = new Scanner(System.in);
        
        System.out.print("\nPlease Select: ");

        setSel(inp.nextInt());
    }

    public void mainScr(){
        System.out.println("1. Login");        
        System.out.println("2. Create account");        
        System.out.println("3. Exit");

        select();
        
        System.out.println(getSel());
    
    switch (getSel()) {
        case 1: 
                newScr();
                new logIn();
                break;
        case 2: new CreateAccount();
                break;
        case 3: System.out.println("This is Exit");
            
                break;                
    
        default:
                newScr();
                System.out.println("Invalid Number. Please select a number again.");
                mainScr();
                break;
    }
    
    }
    public static void main(String[] args) {
       
        Main main = new Main();
        showRecords();
        accts.get(1).setBalance(55);
        System.out.println(accts.get(1).getBalance());
        main.mainScr();
        
        
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
