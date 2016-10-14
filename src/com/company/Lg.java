package com.company;

/**
 * Created by Serkan on 13/10/16.
 */
public class Lg extends Remote implements WaterProof, Rechargeable, Universal{

    public Lg(boolean needsBatteries, boolean supportsUsb) {
        super(needsBatteries, supportsUsb);
    }

    @Override
    public void volumeUp() {
        System.out.println("LG's volume is up");
    }

    @Override
    public void volumeDown() {
        System.out.println("LG's volume is down");
    }

    @Override
    public void channelUp() {
        System.out.println("LG's channel is up");
    }

    @Override
    public void channelDown() {
        System.out.println("LG's channel is down");
    }

    @Override
    public boolean isWaterProof() {
        System.out.println("LG isn't waterproof!");
        return false;
    }

    @Override
    public boolean isRechargeable() {
        System.out.println("LG is rechargeable!");
        return true;
    }

    @Override
    public void supportsBrands() {
        System.out.println("LG supports other brands!");
    }
}
