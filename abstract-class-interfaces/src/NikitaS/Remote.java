package NikitaS;

/**
 * Created by NikitaShuvalov on 10/13/16.
 */
public abstract class Remote {
    private boolean mNeedsBatteries;
    private boolean mSupportsUsb;

    public Remote(boolean needsBatteries, boolean supportsUsb) {
        mNeedsBatteries = needsBatteries;
        mSupportsUsb = supportsUsb;
    }

    public boolean needsBatteries() {
        return mNeedsBatteries;
    }

    public void setNeedsBatteries(boolean needsBatteries) {
        mNeedsBatteries = needsBatteries;
    }

    public boolean supportsUsb() {
        return mSupportsUsb;
    }

    public void setSupportsUsb(boolean supportsUsb) {
        mSupportsUsb = supportsUsb;
    }

    public abstract void channelUp();
    public abstract void channelDown();
    public abstract void volumeUp();
    public abstract void volumeDown();
    public void powerButtonPressed(){
        System.out.println("The power button was pressed.");
    }
    public void numberButtonPressed(int numButt){
        System.out.println(String.format("Changing channel to %s",numButt));
    }
    public abstract void printAllInfo();
}