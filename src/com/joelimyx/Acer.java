package com.joelimyx;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

/**
 * Created by Joe on 10/13/16.
 */
public class Acer extends Remote {
    public Acer(boolean needsBatteries, boolean supportsUsb, String name) {
        super(needsBatteries, supportsUsb, name);
    }

    @Override
    public void supportsBrands() {
        System.out.println("This remote only supports Acer and ASUS.");
    }

    @Override
    public boolean isWaterProof() {
        return false;
    }

    @Override
    public boolean isRechargeable() {
        return false;
    }

    @Override
    public void channelUp() {
        System.out.println("Acer Moving Right UP.");
    }

    @Override
    public void channelDown() {
        System.out.println("Acer Moving DOWN.");

    }

    @Override
    public void volumeUp() {
        System.out.println("LOUDER PLEASE!!");
    }

    @Override
    public void volumeDown() {
        System.out.println("Please keep it down.");
    }
}
