import java.util.*;
public class Main{
    private int sel;
    Accounts accts[] = new Accounts[4];
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
    main.mainScr();
}
}
