package com.joelimyx;

/**
 * Created by Joe on 10/13/16.
 */
public class Xiaomi extends Remote {
    @Override
    public void supportsBrands() {
        System.out.println("This remote only supprts Chinese Brands");
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
        System.out.println("Round it UP");
    }

    @Override
    public void channelDown() {
        System.out.println("Lets see whats down there.");
    }

    @Override
    public void volumeUp() {
        System.out.println("I'm deaf. Please turn it up");
    }

    @Override
    public void volumeDown() {
        System.out.println("That's enough. Turn it down.");
    }

    public Xiaomi(boolean needsBatteries, boolean supportsUsb, String name) {
        super(needsBatteries, supportsUsb, name);
    }
}
