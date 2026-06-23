package Projects.BankAccount;

public class Main {
    public static void main(String[] args) {

        Login login = new Login();
        DisplayScreen displayScreen = new DisplayScreen();

        login.login();
        displayScreen.displayMenu();

    }
}
