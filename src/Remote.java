import java.util.ArrayList;

/**
 * Created by Scott Lindley on 10/13/2016.
 */
public abstract class Remote implements Rechargeable, WaterProof, Universal{
    private boolean mNeedsBatteries;
    private boolean mSupportsUsb;
    private ArrayList<String> mSupportedBrands;

    public Remote(boolean needsBatteries, boolean supportsUsb) {
        mSupportedBrands = new ArrayList<>();
        mNeedsBatteries = needsBatteries;
        mSupportsUsb = supportsUsb;
    }

    public void powerButtonPressed(){
        System.out.println("The power button was pressed");
    }

    public void numberButtonPressed(int channel){
        System.out.println("Changing channel to "+channel+".");
    }

    //Abstract methods

    public abstract void channelUp();

    public abstract void channelDown();

    public abstract void volumeUp();

    public abstract void volumeDown();

    //Getters and Setters

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

    public ArrayList<String> getSupportedBrands(){
        return mSupportedBrands;
    }
}
