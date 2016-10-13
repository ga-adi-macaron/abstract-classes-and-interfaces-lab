package com.company;

/**
 * Created by Serkan on 13/10/16.
 */
public class Sony extends Remote implements WaterProof, Rechargeable, Universal{

    public Sony(boolean needsBatteries, boolean supportsUsb) {
        super(needsBatteries, supportsUsb);
    }

    @Override
    public void volumeUp() {
        System.out.println("Sony's volume is up");
    }

    @Override
    public void volumeDown() {
        System.out.println("Sony's volume is down");
    }

    @Override
    public void channelUp() {
        System.out.println("Sony's channel is up");
    }

    @Override
    public void channelDown() {
        System.out.println("Sony's channel is down");
    }

    @Override
    public boolean isWaterProof() {
        System.out.println("Sony isn't waterproof!");
        return false;
    }

    @Override
    public boolean isRechargeable() {
        System.out.println("Sony isn't rechargeable!");
        return false;
    }

    @Override
    public void supportsBrands() {
        System.out.println("Sony doesn't support other brands.");
    }
}
