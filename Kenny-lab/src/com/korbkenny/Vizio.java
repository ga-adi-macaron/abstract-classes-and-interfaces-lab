package com.korbkenny;

import java.lang.reflect.Array;

/**
 * Created by KorbBookProReturns on 10/13/16.
 */
public class Vizio extends Remote {

    public Vizio(boolean needsBatteries, boolean supportsUsb) {
        super(needsBatteries, supportsUsb);
    }

    @Override
    public void getName() {
        System.out.println("~~~~~ This dynamic(see:random) remote is the Vizio ~~~~~");
    }

    @Override
    public void channelUp() {
        int randomNumber = (int)(Math.random()*10);
        System.out.println("The channel went up by "+randomNumber+" channels.");
    }

    @Override
    public void channelDown() {
        int randomNumber = (int)(Math.random()*10);
        System.out.println("The channel went down by "+randomNumber+" channels.");

    }

    @Override
    public void volumeUp() {
        int randomNumber = (int)(Math.random()*1000);
        System.out.println("The volume went up by "+randomNumber+" decibals.");
    }

    @Override
    public void volumeDown() {
        int randomNumber = (int)(Math.random()*1000);
        System.out.println("The volume went down by "+randomNumber+" decibals.");
    }

    @Override
    public void supportsBrands() {
        String[] theBrands = {"Sony","Apple","Android","Samsung","LG","Panasonic"};
        int r = (int)(Math.random()*6);
        System.out.println("Today due to a programming error, Vizio only supports "+theBrands[r]+".");
    }

    @Override
    public boolean isWaterProof() {
        System.out.println("Hardly.");
        return true;
    }

    @Override
    public boolean isRechargeable() {
        System.out.println("Hardly.");
        return true;
    }
}
