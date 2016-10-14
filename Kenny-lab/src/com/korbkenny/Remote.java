package com.korbkenny;

/**
 * Created by KorbBookProReturns on 10/13/16.
 */
public abstract class Remote implements Waterproof, Rechargeable, Universal {
    private boolean mNeedsBatteries;
    private boolean mSupportsUsb;

    public Remote(boolean needsBatteries, boolean supportsUsb) {
        mNeedsBatteries = needsBatteries;
        mSupportsUsb = supportsUsb;
    }

    public void setNeedsBatteries(boolean needsBatteries) {
        mNeedsBatteries = needsBatteries;
    }

    public void setSupportsUsb(boolean supportsUsb) {
        mSupportsUsb = supportsUsb;
    }

    public boolean isNeedsBatteries() {
        return mNeedsBatteries;

    }

    public boolean isSupportsUsb() {
        return mSupportsUsb;
    }

    public abstract void getName();

    public abstract void channelUp();
    public abstract void channelDown();
    public abstract void volumeUp();
    public abstract void volumeDown();

    public void powerButtonPressed(){
        System.out.println("The power button has been pressed.");
    }

    public void numberButtonPressed(int numberButton){
        System.out.println("Changing channel to "+numberButton);
    }
}
