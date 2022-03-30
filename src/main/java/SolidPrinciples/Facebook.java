package SolidPrinciples;

public class Facebook implements ChatMedia,Calling,FileSharing{
    
    @Override
    public void chat() {
        System.out.println("Chating Code will be implemented here.");
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void fileSharing() {
        System.out.println("File Sharing Code will be implemented here.");
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void videoCalling() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void audioCalling() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
