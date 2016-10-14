package com.company;

/**
 * Created by student on 10/13/16.
 */
public abstract class Remote implements WaterProof, Rechargeable, Universal{
    private boolean mNeedsBatteries;
    private boolean mSupportsUsb;

    public Remote(boolean needsBatteries, boolean supportsUsb) {
        mNeedsBatteries = needsBatteries;
        mSupportsUsb = supportsUsb;
    }

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

    public abstract void channelUp();

    public abstract void channelDown();

    public abstract void volumeUp();

    public abstract void volumeDown();

    public void powerButtonPressed(){
        System.out.println("Power button has been pressed");
    }

    public void numberButtonPressed(int num){
        System.out.println("Changing channel to "+num);
    }
}
