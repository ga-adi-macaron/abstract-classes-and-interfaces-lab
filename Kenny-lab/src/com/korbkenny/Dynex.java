package com.korbkenny;

/**
 * Created by KorbBookProReturns on 10/13/16.
 */
public class Dynex extends Remote {

    public Dynex(boolean needsBatteries, boolean supportsUsb) {
        super(needsBatteries, supportsUsb);
    }

    @Override
    public void getName() {
        System.out.println("~~~~~ This puzzling remote is the Dynex ~~~~~");
    }


    @Override
    public void channelUp() {
        System.out.println("The channel went up by 2 channels for some reason.");
    }

    @Override
    public void channelDown() {
        System.out.println("The channel went down by 3 channels for some reason.");
    }

    @Override
    public void volumeUp() {
        System.out.println("The volume is now at the maximum volume.");
    }

    @Override
    public void volumeDown() {
        System.out.println("The volume is now at the minimum volume.");
    }

    @Override
    public void supportsBrands() {
        System.out.println("Does not support any brands at the moment.");
    }

    @Override
    public boolean isWaterProof() {
        System.out.println("Waterproof up to 3 seconds in a light mist.");
        return true;
    }

    @Override
    public boolean isRechargeable() {
        System.out.println("Not rechargable, takes 8 AAA batteries.");
        return false;
    }
}
