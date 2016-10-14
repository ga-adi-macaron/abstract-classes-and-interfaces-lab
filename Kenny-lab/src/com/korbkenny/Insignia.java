package com.korbkenny;

/**
 * Created by KorbBookProReturns on 10/13/16.
 */
public class Insignia extends Remote {
    public Insignia(boolean needsBatteries, boolean supportsUsb) {
        super(needsBatteries, supportsUsb);


    }

    @Override
    public void getName() {
        System.out.println("~~~~~ This delicate flower of a remote is the Insignia ~~~~~");
    }

    @Override
    public void channelUp() {
        int randomNumber = (int)(Math.random()*3);
        if(randomNumber == 1){
            System.out.println("The button is broken.");
        } else{
            System.out.println("The channel went up.");
        }
    }

    @Override
    public void channelDown() {
        int randomNumber = (int)(Math.random()*3);
        if(randomNumber == 1){
            System.out.println("The button is broken.");
        } else{
            System.out.println("The channel went down.");
        }
    }

    @Override
    public void volumeUp() {
        int randomNumber = (int)(Math.random()*3);
        if(randomNumber == 1){
            System.out.println("The button is broken.");
        } else{
            System.out.println("The volume went up.");
        }
    }

    @Override
    public void volumeDown() {
        int randomNumber = (int)(Math.random()*3);
        if(randomNumber == 1){
            System.out.println("The button is broken.");
        } else{
            System.out.println("The volume went up.");
        }
    }

    @Override
    public void supportsBrands() {
        System.out.println("Insignia supports Insignia.");
    }

    @Override
    public boolean isWaterProof() {
        System.out.println("A clammy hand will break this device.");
        return false;
    }

    @Override
    public boolean isRechargeable() {
        System.out.println("20 minutes of battery life, 3 hours to full charge.");
        return true;
    }
}
