package com.bleh;

/**
 * Created by colinbradley on 10/13/16.
 */
public abstract class Remote implements Rechargeable, WaterProof, SupportsBrands{
    boolean mNeedsBatteries;
    boolean mSupportsUSB;


    public Remote(boolean needsBatteries, boolean supportsUSB) {
        mNeedsBatteries = needsBatteries;
        mSupportsUSB = supportsUSB;
    }

    public boolean isNeedsBatteries() {
        return mNeedsBatteries;
    }

    public void setNeedsBatteries(boolean needsBatteries) {
        mNeedsBatteries = needsBatteries;
    }

    public boolean isSupportsUSB() {
        return mSupportsUSB;
    }

    public void setSupportsUSB(boolean supportsUSB) {
        mSupportsUSB = supportsUSB;
    }

    public abstract void channelUp();

    public abstract void channelDown();

    public abstract void volumeUp();

    public abstract void volumeDown();

    public String powerButtonPressed(){
        return "Power Button Pressed";
    }

    public String numberButtonPressed(int numButton){
        return "Changing channel to " + numButton;
    }

}
