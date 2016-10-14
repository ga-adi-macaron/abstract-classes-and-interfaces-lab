package com.company;

/**
 * Created by Serkan on 13/10/16.
 */
public class Arcelik extends Remote implements WaterProof, Rechargeable, Universal {

    public Arcelik(boolean needsBatteries, boolean supportsUsb) {
        super(needsBatteries, supportsUsb);
    }

    @Override
    public void supportsBrands() {

    }

    @Override
    public boolean isWaterProof() {
        return false;
    }

    @Override
    public boolean isRechargeable() {
        return false;
    }

    @Override
    public void volumeUp() {
        System.out.println("Arcelik's volume is up");
    }

    @Override
    public void volumeDown() {
        System.out.println("Arcelik's volume is down");
    }

    @Override
    public void channelUp() {
        System.out.println("Arcelik's channel is up");
    }

    @Override
    public void channelDown() {
        System.out.println("Arcelik's channel is down");
    }
}
