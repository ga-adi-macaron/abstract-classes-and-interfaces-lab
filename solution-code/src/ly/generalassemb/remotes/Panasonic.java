package ly.generalassemb.remotes;

import ly.generalassemb.remotes.Remote;
import ly.generalassemb.remotes.interfaces.Rechargeable;
import ly.generalassemb.remotes.interfaces.Universal;
import ly.generalassemb.remotes.interfaces.WaterProof;

/**
 * Created by charlie on 10/14/16.
 */
public class Panasonic extends Remote implements WaterProof, Rechargeable, Universal {

    // Constructor - calls the constructor for the superclass
    public Panasonic(boolean needsBatteries, boolean supportsUsb) {
        super(needsBatteries, supportsUsb);
    }

    // These are the methods declared in Remote that need to be implemented here in the concrete subclass
    @Override
    public void channelUp() {
        System.out.println("Panasonic: channel up");
    }

    @Override
    public void channelDown() {
        System.out.println("Panasonic: channel down");
    }

    @Override
    public void volumeUp() {
        System.out.println("Panasonic: volume up");
    }

    @Override
    public void volumeDown() {
        System.out.println("Panasonic: volume down");
    }

    // Method declared in Universal interface
    @Override
    public void supportsBrands() {
        System.out.println("Supports Panasonic, Samsung, and Sony");
    }

    // Method declared in WaterProof interface
    @Override
    public boolean isWaterProof() {
        System.out.println("Panasonic: not waterproof");
        return false;
    }

    // Method declared in Rechargeable interface
    @Override
    public boolean isRechargeable() {
        System.out.println("Panasonic: rechargeable!");
        return true;
    }
}
