package com.joelimyx;

/**
 * Created by Joe on 10/13/16.
 */
public abstract class Remote implements Rechargeable, Universal, WaterProof{
    private boolean mNeedsBatteries;
    private boolean mSupportsUsb;
    private String mName;

    public Remote(boolean needsBatteries, boolean supportsUsb, String name) {
        mNeedsBatteries = needsBatteries;
        mSupportsUsb = supportsUsb;
        mName=name;
    }

    public String getName() {
        return mName;
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

    public void powerButtonPressed(){
        System.out.println("Power Button Pressed");
    }

    public void numberButtonPressed(int num){
        System.out.println("Changing channel to "+ num);
    }

    public abstract void channelUp();
    public abstract void channelDown();
    public abstract void volumeUp();
    public abstract void volumeDown();
}
