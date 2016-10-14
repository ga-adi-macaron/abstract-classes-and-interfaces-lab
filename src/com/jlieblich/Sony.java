package com.jlieblich;

/**
 * Created by jonlieblich on 10/13/16.
 */
public class Sony extends Remote {
    private int mCurrentChannel;

    public Sony(boolean needsBattery, boolean supportsUsb, int currentChannel) {
        super(needsBattery, supportsUsb);
        mCurrentChannel = currentChannel;
    }

    @Override
    public void numberButtonPressed(int n) {
        System.out.println("Showing channel " + n);
        mCurrentChannel = n;
    }

    @Override
    public void printCurrentChannel() {
        System.out.println("Welcome, now showing " + mCurrentChannel);
    }

    @Override
    public void channelUp() {
        System.out.println("Channel: +1");
        mCurrentChannel++;
        System.out.println("Now showing channel " + mCurrentChannel);
    }

    @Override
    public void channelDown() {
        System.out.println("Channel: -1");
        mCurrentChannel--;
        System.out.println("Now showing channel " + mCurrentChannel);
    }

    @Override
    public void volumeUp() {
        System.out.println("Volume increased");
    }

    @Override
    public void volumeDown() {
        System.out.println("Volume decreased");
    }

    @Override
    public void supportsBrands() {
        System.out.println("This remote supports Sony, Samsung, and LG TVs, or any TV running Android.");
    }

    @Override
    public boolean isWaterproof() {
        return false;
    }

    @Override
    public boolean isRechargeable() {
        return true;
    }
}
