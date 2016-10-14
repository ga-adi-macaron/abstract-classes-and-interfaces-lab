package ly.generalassemb.remotes;

/**
 * Created by charlie on 10/14/16.
 */
public abstract class Remote {

    // Properties / Attributes / Fields / Member Variables
    private boolean mNeedsBatteries, mSupportsUsb;


    // Constructor
    public Remote(boolean needsBatteries, boolean supportsUsb) {
        mNeedsBatteries = needsBatteries;
        mSupportsUsb = supportsUsb;
    }


    // Getters and Setters
    // These methods are implemented here, so subclasses will inherit them and won't have to implement them
    // (subclasses could override these methods with a new implementation, but won't need to for this lab)
    public boolean isNeedsBatteries() {
        return mNeedsBatteries;
    }

    public void setNeedsBatteries(boolean needsBatteries) {
        mNeedsBatteries = needsBatteries;
    }

    public boolean isSupportsUsb() {
        return mSupportsUsb;
    }

    public void setSupportsUsb(boolean supportsUsb) {
        mSupportsUsb = supportsUsb;
    }


    // Abstract Methods
    // These are just declared and NOT implemented, so subclasses will need to implement them
    public abstract void channelUp();
    public abstract void channelDown();
    public abstract void volumeUp();
    public abstract void volumeDown();


    // Additional implemented methods
    // These methods are implemented here, so subclasses will inherit them and won't have to implement them
    // (subclasses could override these methods with a new implementation, but won't need to for this lab)
    public void powerButtonPressed() {
        System.out.println("The power button was pressed");
    }

    public void numberButtonPressed(int numberPressed) {
        System.out.println("Changing channel to " + numberPressed);
    }
}
