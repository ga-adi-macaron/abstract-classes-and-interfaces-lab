package com.jlieblich;

/**
 * Created by jonlieblich on 10/13/16.
 */
public abstract class Remote implements Waterproof, Rechargeable, Universal{
    private boolean mNeedsBattery;
    private boolean mSupportsUsb;

    public Remote(boolean needsBattery, boolean supportsUsb) {
        mNeedsBattery = needsBattery;
        mSupportsUsb = supportsUsb;
    }

    public void setNeedsBattery(boolean needsBattery) {
        mNeedsBattery = needsBattery;
    }

    public void setSupportsUsb(boolean supportsUsb) {
        mSupportsUsb = supportsUsb;
    }

    public boolean isNeedsBattery() {

        return mNeedsBattery;
    }

    public boolean isSupportsUsb() {
        return mSupportsUsb;
    }

    public void powerButtonPressed() {
        System.out.println("The power button was pressed.");
    }

    public void numberButtonPressed(int n) {
        System.out.println("Changing channel to " + n);
    }

    public abstract void channelUp();
    public abstract void channelDown();
    public abstract void volumeUp();
    public abstract void volumeDown();
    public abstract void printCurrentChannel();
}
