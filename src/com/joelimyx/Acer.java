package com.joelimyx;

/**
 * Created by Joe on 10/13/16.
 */
public class Acer extends Remote {
    public Acer(boolean needsBatteries, boolean supportsUsb, String name) {
        super(needsBatteries, supportsUsb, name);
    }

    @Override
    public void supportsBrands() {
        System.out.println("This remote only supports Acer and ASUS.");
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
    public void channelUp() {
        System.out.println();
    }

    @Override
    public void channelDown() {

    }

    @Override
    public void volumeUp() {

    }

    @Override
    public void volumeDown() {

    }
}
