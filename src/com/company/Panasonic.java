package com.company;

/**
 * Created by student on 10/13/16.
 */
public class Panasonic extends Remote {

    public Panasonic(boolean needsBatteries, boolean supportsUsb) {
        super(needsBatteries, supportsUsb);
    }

    @Override
    public void channelUp() {
        System.out.println("Panasonic: Channel up");
    }

    @Override
    public void channelDown() {
        System.out.println("Panasonic: Channel down");
    }

    @Override
    public void volumeUp() {
        System.out.println("Panasonic: Volume up");
    }

    @Override
    public void volumeDown() {
        System.out.println("Panasonic: Volume down");
    }

    @Override
    public boolean isRechargeable() {
        return true;
    }

    @Override
    public void supportsBrands() {
        System.out.println("Supports Panasonic");
    }

    @Override
    public boolean isWaterProof() {
        return false;
    }
}
