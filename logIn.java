
public class logIn {
    public logIn(){
        Main main = new Main();
        System.out.println("1. Enter your ID number and Pin code");
        System.out.println("2. Back");

        main.select();

        switch (main.getSel()) {
            case 1:
                System.out.println("Please enter you ID number: ");
                
                break;
            case 2:
                main.newScr();
                main.mainScr();
                break;
        
            default:
                main.newScr();
                System.out.println("Invalid Number please select again.");
                new logIn();
                main.select();
                break;
        }
    }
}
