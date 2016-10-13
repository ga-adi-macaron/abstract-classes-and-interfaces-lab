package com.jlieblich;

/**
 * Created by jonlieblich on 10/13/16.
 */
public class Samsung extends Remote {
    private int mCurrentChannel;

    public Samsung(boolean needsBattery, boolean supportsUsb, int currentChannel) {
        super(needsBattery, supportsUsb);
        mCurrentChannel = currentChannel;
    }

    @Override
    public void numberButtonPressed(int n) {
        System.out.println("Changing channel to " + n);
        mCurrentChannel = n;
    }

    public void printCurrentChannel() {
        System.out.println("Welcome to the Samsung experience of channel " + mCurrentChannel);
    }

    @Override
    public void supportsBrands() {
        System.out.println("This remote is only compatible with licensed Samsung TVs.");
    }

    @Override
    public boolean isWaterproof() {
        return true;
    }

    @Override
    public boolean isRechargeable() {
        return true;
    }

    @Override
    public void channelUp() {
        System.out.println(mCurrentChannel + " is now changing...");
        mCurrentChannel++;
        System.out.println("Your Samsung TV is now showing channel " + mCurrentChannel);
    }

    @Override
    public void channelDown() {
        System.out.println(mCurrentChannel + " is now changing...");
        mCurrentChannel--;
        System.out.println("Your Samsung TV is now showing channel " + mCurrentChannel);
    }

    @Override
    public void volumeUp() {
        System.out.println("Changing volume may result in exploding batteries. Volume control disabled.");
    }

    @Override
    public void volumeDown() {
        System.out.println("Changing volume may result in exploding batteries. Volume control disabled.");
    }
}
