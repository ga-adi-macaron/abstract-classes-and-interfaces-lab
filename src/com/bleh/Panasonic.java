package com.bleh;

/**
 * Created by colinbradley on 10/13/16.
 */
public class Panasonic extends Remote {

    public Panasonic(boolean needsBatteries, boolean supportsUSB) {
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
        return false;
    }

    @Override
    public void supportsBrands() {
        System.out.println("Panasonic");

    }

    @Override
    public boolean isRechargeable() {
        return false;
    }
}
