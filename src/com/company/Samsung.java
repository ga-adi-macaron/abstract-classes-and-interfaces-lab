package com.company;

/**
 * Created by student on 10/13/16.
 */
public class Samsung extends Remote{

    public Samsung(boolean needsBatteries, boolean supportsUsb) {
        super(needsBatteries, supportsUsb);
    }

    @Override
    public void channelUp() {
        System.out.println("Samsung: Channel up");
    }

    @Override
    public void channelDown() {
        System.out.println("Samsung: Channel down");
    }

    @Override
    public void volumeUp() {
        System.out.println("Samsung: Volume up");
    }

    @Override
    public void volumeDown() {
        System.out.println("Samsung: Volume down");
    }

    @Override
    public boolean isRechargeable() {
        return true;
    }

    @Override
    public void supportsBrands() {
        System.out.println("Supports Samsung");
    }

    @Override
    public boolean isWaterProof() {
        return true;
    }
}
