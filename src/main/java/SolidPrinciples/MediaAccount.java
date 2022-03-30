package SolidPrinciples;

public class MediaAccount {
    public static void main(String[] args){
        AccountService service = new AccountService();
        service.openAccount();
        
        //3rd principle and 4th principle 
        Facebook fbMedia = new Facebook();
        Instagram instaMedia = new Instagram();
        
        fbMedia.chat();
        fbMedia.audioCalling();
        instaMedia.fileSharing();

        
    }
}
