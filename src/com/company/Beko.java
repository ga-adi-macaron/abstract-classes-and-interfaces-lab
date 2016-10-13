package com.company;

/**
 * Created by Serkan on 13/10/16.
 */
public class Beko extends Remote implements WaterProof, Rechargeable, Universal {

    public Beko(boolean needsBatteries, boolean supportsUsb) {
        super(needsBatteries, supportsUsb);
    }

    @Override
    public void volumeUp() {
        System.out.println("Beko's volume is up");
    }

    @Override
    public void volumeDown() {
        System.out.println("Beko's volume is down");
    }

    @Override
    public void channelUp() {
        System.out.println("Beko's channel is up");
    }

    @Override
    public void channelDown() {
        System.out.println("Beko's channel is down");
    }


    @Override
    public void supportsBrands() {

    }

    @Override
    public boolean isWaterProof() {
        return true;
    }

    @Override
    public boolean isRechargeable() {
        return true;
    }
}
