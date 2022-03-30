package SolidPrinciples;

import java.util.Scanner;

public class AccountService {
    //single1

    AccountRepo accountrepo = new AccountRepo();
    NotificationService notification = new NotificationService();

    Scanner sc = new Scanner(System.in);
    
    public void openAccount() {
        System.out.println("Fill in All info");
        
        String medium;
        System.out.println("Send out Welcome message medium");
        medium = sc.nextLine();

        accountrepo.create();
        notification.sendNotification(medium);
    }

}
