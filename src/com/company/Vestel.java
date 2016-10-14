package com.company;

/**
 * Created by Serkan on 13/10/16.
 */
public class Vestel extends Remote implements WaterProof, Rechargeable, Universal {

    public Vestel(boolean needsBatteries, boolean supportsUsb) {
        super(needsBatteries, supportsUsb);
    }

    @Override
    public void volumeUp() {
        System.out.println("Vestel's volume is up");
    }

    @Override
    public void volumeDown() {
        System.out.println("Vestel's volume is down");
    }

    @Override
    public void channelUp() {
        System.out.println("Vestel's channel is up");
    }

    @Override
    public void channelDown() {
        System.out.println("Vestel's channel is down");
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
        return true;
    }
}