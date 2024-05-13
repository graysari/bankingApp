import java.util.*;
public class Main{
    private int sel;    
    private int session;
    static ArrayList<Accounts> accts = new ArrayList<Accounts>();
    Scanner inp = new Scanner(System.in);
    static boolean select = true;


    public static void main(String[] args) {
        Main main = new Main();

        accts.add(new Accounts(2024001, 123, "Reb", 552.50));
        accts.add(new Accounts(2024002, 456, "Jegs", 477.25));
        accts.add(new Accounts(2024003, 789, "Carj", 350.33));
        accts.add(new Accounts(2024004, 000, "Nick", 10.50));

        showRecords();

        int a = 2024004;

        System.out.println(accts.get(main.getIndexOfIDNumber(a)).getFullName());

        main.mainScr();        

        if (main.getSession() == 0) {
            System.out.println("There is no current session");
        }
        else 
        {
            
        System.out.println("\nHello "+accts.get(main.getIndexOfIDNumber(main.getSession())).getFullName()+". Welcome to Sltcfi Banking application");
        main.userScr();
        
        }

}

public void select(){    
    System.out.print("\nPlease Select: ");
    setSel(inp.nextInt());
}
public void mainScr(){
    do{
        newScr();
        System.out.println("1. Login");        
        System.out.println("2. Create account");        
        System.out.println("3. Exit");
        select();
        switch (getSel()) {
            case 1: 
                    logInScr();                    
                    break;
            case 2: 
                    createAccountScr();
                    break;
            case 3: System.out.println("This is Exit");
                    select = false;
                    inp.close();
                    break;                
        
            default:
                    newScr();
                    System.out.println("Invalid Number. Please select a number again.");
                    break;
        }
    }while(select);

}

public void logInScr(){
    newScr();
    System.out.println("1. Enter your ID number and Pin code");
    System.out.println("2. Back");
    select();
    switch (getSel()) {
        case 1:
            newScr();
            int id;
            int pin;
            System.out.print("\nEnter your ID: ");id = inp.nextInt();
            System.out.print("\nEnter your Pin: ");pin = inp.nextInt();
            if (pin == getPinOfId(getIndexOfIDNumber(id))) {
                System.out.println("\nLog in success");
                select = false;
                setSession(id);
            }
            else{
                System.out.println("Invalid User Id and/or Pin");
            }
            break;
        case 2:
            break;
    
        default:break;
    }
}

public void createAccountScr(){
    newScr();

    String name; 
    int pin;
    double depo;
    System.out.print("Enter Name: ");   
    name = inp.next();
    System.out.print("Enter 4-pin Code: ");
    pin = inp.nextInt();   
    System.out.print("Enter initial deposite: ");
    depo = inp.nextDouble();

    accts.add(new Accounts(2024005, pin, name, depo));
    System.out.println("record added successfully failed!");
    showRecords();
}
public void userScr(){
    newScr();
    System.out.println("1. Check Balance");
    System.out.println("2. Withdraw");
    System.out.println("3. Transfer Balance");
    System.out.println("4. Log out");
}
public int getPinOfId(int id){
    return accts.get(id).getPinCode();
}
public static void showRecords()
{
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
public int getIndexOfIDNumber(int a){
    int iOf=-1;
    int f=0;
    for(Accounts acct: accts)
    {
        if (a == acct.getIdNumber()) {
            iOf = f;
        }
        f++;
    }

return iOf;
}
public void newScr(){
    System.out.println("\n*******************************************************************\n");
}
public int getSession(){
    return this.session;
}
public void setSession(int session){
    this.session = session;
}
public int getSel() 
{
    return this.sel;
}
public void setSel(int sel) 
{
   this.sel = sel;
}
}
