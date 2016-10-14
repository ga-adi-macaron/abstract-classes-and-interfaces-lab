package com.justin;

/**
 * Created by justinwells on 10/13/16.
 */
public class Bosch extends Remote {
    public Bosch(boolean needsBatteries, boolean supportsUsb) {
        super(needsBatteries, supportsUsb);
    }

    @Override
    public boolean isUniversal() {
        return false;
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
        System.out.println("KANAL NACH OBEN!");
    }

    @Override
    public void channelDown() {
        System.out.println("KANAL NACH UNTEN!");
    }

    @Override
    public void volumeUp() {
        System.out.println("LAUTER!");
    }

    @Override
    public void volumeDown() {
        System.out.println("ES IST ZU LAUT!");
    }
}
