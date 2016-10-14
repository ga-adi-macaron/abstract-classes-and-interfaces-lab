package ly.generalassemb.remotes;

import ly.generalassemb.remotes.interfaces.Rechargeable;
import ly.generalassemb.remotes.interfaces.Universal;
import ly.generalassemb.remotes.interfaces.WaterProof;

/**
 * Created by charlie on 10/14/16.
 */
public class Samsung extends Remote implements WaterProof, Rechargeable, Universal {

    // Constructor - calls the constructor for the superclass
    public Samsung(boolean needsBatteries, boolean supportsUsb) {
        super(needsBatteries, supportsUsb);
    }

    // These are the methods declared in Remote that need to be implemented here in the concrete subclass
    @Override
    public void channelUp() {
        System.out.println("Samsung: channel up");
    }

    @Override
    public void channelDown() {
        System.out.println("Samsung: channel down");
    }

    @Override
    public void volumeUp() {
        System.out.println("Samsung: volume up");
    }

    @Override
    public void volumeDown() {
        System.out.println("Samsung: volume down");
    }

    // Method declared in Universal interface
    @Override
    public void supportsBrands() {
        System.out.println("Supports only Samsung");
    }

    // Method declared in WaterProof interface
    @Override
    public boolean isWaterProof() {
        System.out.println("Samsung: not waterproof");
        return false;
    }

    // Method declared in Rechargeable interface
    @Override
    public boolean isRechargeable() {
        System.out.println("Samsung: not rechargeable");
        return false;
    }
}
