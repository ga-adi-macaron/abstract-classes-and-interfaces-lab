package com.joelimyx;

/**
 * Created by Joe on 10/13/16.
 */
public class Philips extends Remote{
    @Override
    public void supportsBrands() {
        System.out.println("This remote support Philips screwdrivers.");
    }

    @Override
    public boolean isWaterProof() {
        return false;
    }

    @Override
    public boolean isRechargeable() {
        return true;
    }

    @Override
    public void channelUp() {
        System.out.println("Turning up.");
    }

    @Override
    public void channelDown() {
        System.out.println("Turning down.");

    }

    @Override
    public void volumeUp() {
        System.out.println("Volume up.");
    }

    @Override
    public void volumeDown() {
        System.out.println("Volume down.");
    }

    public Philips(boolean needsBatteries, boolean supportsUsb, String name) {
        super(needsBatteries, supportsUsb, name);
    }
}
