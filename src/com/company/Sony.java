package com.company;

/**
 * Created by student on 10/13/16.
 */
public class Sony extends Remote {

    public Sony(boolean needsBatteries, boolean supportsUsb) {
        super(needsBatteries, supportsUsb);
    }

    @Override
    public void channelUp() {
        System.out.println("Sony: Channel up");
    }

    @Override
    public void channelDown() {
        System.out.println("Sony: Channel down");
    }

    @Override
    public void volumeUp() {
        System.out.println("Sony: Volume up");
    }

    @Override
    public void volumeDown() {
        System.out.println("Sony: Volume down");
    }

    @Override
    public boolean isRechargeable() {
        return false;
    }

    @Override
    public void supportsBrands() {
        System.out.println("Supports Sony");
    }

    @Override
    public boolean isWaterProof() {
        return true;
    }
}
