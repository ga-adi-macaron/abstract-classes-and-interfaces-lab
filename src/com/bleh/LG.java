package com.bleh;

/**
 * Created by colinbradley on 10/13/16.
 */
public class LG extends Remote{
    public LG(boolean needsBatteries, boolean supportsUSB) {
        super(needsBatteries, supportsUSB);
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


    @Override
    public boolean isWaterProof() {
        return true;
    }

    @Override
    public void supportsBrands() {
        System.out.println("LG, Samsung, and Sony");

    }

    @Override
    public boolean isRechargeable() {
        return false;
    }
}
