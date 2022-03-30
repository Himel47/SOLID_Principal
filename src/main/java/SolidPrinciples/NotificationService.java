package SolidPrinciples;

import java.util.Scanner;


public class NotificationService {
    //single3
    
    EmailNotification email = new EmailNotification();
    MobileNotification mobile = new MobileNotification();
    
    Scanner sc = new Scanner(System.in);
    public void sendNotification(String medium){
        
        if(medium.equals("email")){
            email.sendOTP(medium);          //using 2nd principle
        }
        else if(medium.equals("mobile")){
            mobile.sendOTP(medium);         //using 2nd principle
        }
    }
}
