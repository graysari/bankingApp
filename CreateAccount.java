import java.util.Scanner;
public class CreateAccount{

   public CreateAccount(){
    Main main = new Main();
    Scanner scn = new Scanner(System.in);
    System.out.print("\nEnter ID number: ");
    int id = scn.nextInt();
    System.out.print("\nEnter Pin Code: ");
    int pin = scn.nextInt();
    System.out.print("\nEnter Fullname: ");
    String fullname = scn.next();
    System.out.print("\nEnter Initial deposite: ");
    double balance = scn.nextDouble();

    System.out.println(main.accts.length);
    main.accts[0]= new Accounts(id, pin,fullname,balance);
    main.newScr();
    System.out.println("Record added successfully failed!");
    main.mainScr();
   }
}
