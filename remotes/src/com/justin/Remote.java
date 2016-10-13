package com.justin;

/**
 * Created by justinwells on 10/13/16.
 */
public abstract class Remote implements WaterProof,Rechargeable,Universal{
    private boolean needsBatteries, supportsUsb;

    public Remote(boolean needsBatteries, boolean supportsUsb) {
        this.needsBatteries = needsBatteries;
        this.supportsUsb = supportsUsb;
    }

    public boolean needsBatteries() {
        return needsBatteries;
    }

    public void setNeedsBatteries(boolean needsBatteries) {
        this.needsBatteries = needsBatteries;
    }

    public boolean supportsUsb() {
        return supportsUsb;
    }

    public void setSupportsUsb(boolean supportsUsb) {
        this.supportsUsb = supportsUsb;
    }

    public abstract void channelUp();

    public abstract void channelDown();

    public abstract void volumeUp();

    public abstract void volumeDown();

    public void powerButtonPressed () {
        System.out.println("Power button pressed");
    }

    public void numberButtonPressed (int channel) {
        System.out.println("Changing channel to " + channel);
    }
}
