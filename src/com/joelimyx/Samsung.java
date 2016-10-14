package com.joelimyx;

/**
 * Created by Joe on 10/13/16.
 */
public class Samsung extends Remote{
    @Override
    public void supportsBrands() {
        System.out.println("This remote supports Samsung, Android TV, Sony and Panasonic.");
    }

    @Override
    public boolean isWaterProof() {
        return true;
    }

    @Override
    public boolean isRechargeable() {
        return true;
    }

    @Override
    public void channelUp() {
        System.out.println("UP UP WE GO");
    }

    @Override
    public void channelDown() {
        System.out.println("DOWN WE GO.");
    }

    @Override
    public void volumeUp() {
        System.out.println("We can't hear you.");
    }

    @Override
    public void volumeDown() {
        System.out.println("OK, Tone it down.");
    }

    public Samsung(boolean needsBatteries, boolean supportsUsb, String name) {
        super(needsBatteries, supportsUsb, name);
    }
}
