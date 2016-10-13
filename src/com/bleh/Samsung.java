package com.bleh;

/**
 * Created by colinbradley on 10/13/16.
 */
public class Samsung extends Remote {

    public Samsung(boolean needsBatteries, boolean supportsUSB) {
        super(needsBatteries, supportsUSB);
    }

    @Override
    public boolean isWaterProof() {
        return false;
    }

    @Override
    public void supportsBrands() {
        System.out.println("All brands");
    }

    @Override
    public boolean isRechargeable() {
        return true;
    }

    @Override
    public void channelUp() {

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
