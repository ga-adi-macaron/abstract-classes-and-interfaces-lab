package com.company;

/**
 * Created by Serkan on 13/10/16.
 */
public class Samsung extends Remote implements WaterProof,Rechargeable,Universal {

    public Samsung(boolean needsBatteries, boolean supportsUsb) {
        super(needsBatteries, supportsUsb);
    }

    @Override
    public void volumeUp() {
        System.out.println("Samsung's volume is up");
    }

    @Override
    public void volumeDown() {
        System.out.println("Samsung's volume is down");
    }

    @Override
    public void channelUp() {
        System.out.println("Samsung's channel is up");
    }

    @Override
    public void channelDown() {
        System.out.println("Samsung's channel is down");
    }

    @Override
    public boolean isWaterProof() {
        System.out.println("Samsung is waterproof!");
        return true;
    }

    @Override
    public boolean isRechargeable() {
        System.out.println("Samsung is rechargeable!");
        return true;
    }

    @Override
    public void supportsBrands() {
        System.out.println("Samsung support other brands.");
    }
}