package NikitaS;

/**
 * Created by NikitaShuvalov on 10/13/16.
 */
public class SonicScrewdriver extends Remote implements Universal, Rechargable, WaterProof {
    private int mChannel=42;
    private int mVolume =42;
    public SonicScrewdriver(boolean needsBatteries, boolean supportsUsb) {
        super(needsBatteries, supportsUsb);
    }

    @Override
    public void supportsBrand() {
        System.out.println("Supports all brands of tvs and every other object.");
    }

    @Override
    public boolean isWaterProof() {
        return true;
    }

    @Override
    public boolean isRechargable() {
        return false;
    }

    @Override
    public void channelUp() {
        mChannel++;
        System.out.println(String.format("Channel increased to %s", mChannel));
    }

    @Override
    public void channelDown() {
        mChannel--;
        System.out.println(String.format("Channel decreased to %s", mChannel));
    }

    @Override
    public void volumeUp() {
        mVolume++;
        System.out.println(String.format("Volume increased to %s", mVolume));
    }

    @Override
    public void volumeDown() {
        mVolume--;
        System.out.println(String.format("Volume decreased to %s", mVolume));

    }

    @Override
    public void printAllInfo() {
        System.out.println("Does everything.\nRequires no charging or batteries.\nWaterproof, fireproof, dalekproof.");
    }
}
