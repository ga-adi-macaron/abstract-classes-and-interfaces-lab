package com.joelimyx;

/**
 * Created by Joe on 10/13/16.
 */
public class Sharp extends Remote {
    @Override
    public void supportsBrands() {
        System.out.println("Supporting ");
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
        System.out.println("Higher up we go.");
    }

    @Override
    public void channelDown() {
        System.out.println("The Lower we get.");
    }

    @Override
    public void volumeUp(){
        System.out.println("Increasing Volume.");
    }

    @Override
    public void volumeDown() {
        System.out.println("Decreasing Volume.");
    }

    public Sharp(boolean needsBatteries, boolean supportsUsb, String name) {
        super(needsBatteries, supportsUsb, name);
    }
}
