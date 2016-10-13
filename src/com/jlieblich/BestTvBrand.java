package com.jlieblich;

/**
 * Created by jonlieblich on 10/13/16.
 */
public class BestTvBrand extends Remote {
    private final String mCurrentChannel = "Glorious Supreme Leader Channel";

    public BestTvBrand(boolean needsBattery, boolean supportsUsb) {
        super(needsBattery, supportsUsb);
    }

    public void printCurrentChannel() {
        System.out.println("Leader is happy you turned on " + mCurrentChannel);
    }

    @Override
    public void channelUp() {
        System.out.println("NO OTHER CHANNEL AVAILABLE. CONTINUE ENJOYING " + mCurrentChannel);
    }

    @Override
    public void channelDown() {
        System.out.println("NO OTHER CHANNEL AVAILABLE. CONTINUE ENJOYING " + mCurrentChannel);
    }

    @Override
    public void volumeUp() {
        System.out.println("Glorious Leader's voice is now louder!");
    }

    @Override
    public void volumeDown() {
        System.out.println("GLORIOUS LEADER'S VOICE NOW MAX VOLUME.");
    }

    @Override
    public void supportsBrands() {
        System.out.println("Only works with a TV our Glorious Supreme Leader has created with his own hands");
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
    public void numberButtonPressed(int n) {
        System.out.println("NOT AVAILABLE");
    }
}
