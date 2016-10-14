package com.justin;

/**
 * Created by justinwells on 10/13/16.
 */
public class Samsung extends Remote {
    public Samsung(boolean needsBatteries, boolean supportsUsb) {
        super(needsBatteries, supportsUsb);
    }

    @Override
    public boolean isUniversal() {
        return true;
    }

    @Override
    public boolean isWaterProof() {
        return false;
    }

    @Override
    public boolean isRechargeable() {
        return super.supportsUsb();
    }

    @Override
    public void channelUp() {
        System.out.println("Going up!");

    }

    @Override
    public void channelDown() {
        System.out.println("Going down!");
    }

    @Override
    public void volumeUp() {
        System.out.println("Louder!");

    }

    @Override
    public void volumeDown() {
        System.out.println("Quieter!");

    }
}
