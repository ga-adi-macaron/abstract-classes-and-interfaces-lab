package com.company;

/**
 * Created by Serkan on 13/10/16.
 */
public abstract class Remote {
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

    public abstract void volumeUp();
    public abstract void volumeDown();
    public abstract void channelUp();
    public abstract void channelDown();

    public void powerButtonPressed() {
        System.out.println("Power button was pressed");
    }

    public void numberButtonPressed(int num) {
        System.out.println("Changing channel to: " + num);
    }
}
