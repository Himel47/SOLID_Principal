package SolidPrinciples;

import java.util.Scanner;


public class MobileNotification implements Notification{
    
    Scanner sc = new Scanner(System.in);
    
    @Override
    public void sendOTP(String medium){
        System.out.println("Provide mobile number:");
        String mobile = sc.nextLine();
        System.out.println("Sending OTP via " + mobile);
    }
}
