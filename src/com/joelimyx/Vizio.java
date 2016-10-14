package com.joelimyx;

/**
 * Created by Joe on 10/13/16.
 */
public class Vizio extends Remote {
    @Override
    public void supportsBrands() {
        System.out.println("This remote supports LG, Sony, Vizio and Fire Tv.");
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
        System.out.println("Changing one channel up.");
    }

    @Override
    public void channelDown() {
        System.out.println("Changing one channel down");
    }

    @Override
    public void volumeUp() {
        System.out.println("Volume +++ by Vizio");
    }

    @Override
    public void volumeDown() {
        System.out.println("Volume - - - by Vizio.");
    }

    public Vizio(boolean needsBatteries, boolean supportsUsb, String name) {
        super(needsBatteries, supportsUsb, name);
    }
}
