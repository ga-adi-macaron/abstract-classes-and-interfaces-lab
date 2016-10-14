/**
 * Created by Scott Lindley on 10/13/2016.
 */
public class Samsung extends Remote implements Explosive{
    public Samsung(boolean needsBatteries, boolean supportsUsb) {
        super(needsBatteries, supportsUsb);
        supportsBrands();
    }

    @Override
    public void explode() {
        //Because it's a Samsung
        System.out.println("Look out! It's a Samsung!");
        System.out.println("BOOOOOM!");
    }

    @Override
    public void channelUp() {
        System.out.println("Samsung remote went up one channel");
    }

    @Override
    public void channelDown() {
        System.out.println("Samsung remote went down one channel");
    }

    @Override
    public void volumeUp() {
        System.out.println("Samsung remote turned the volume up");
    }

    @Override
    public void volumeDown() {
        System.out.println("Samsung remote turned the volume down");
    }

    @Override
    public boolean isRechargeable() {
        if(needsBatteries()){
            return false;
        }
        return true;
    }

    @Override
    public void supportsBrands() {
        getSupportedBrands().add("Sony");
        getSupportedBrands().add("Samsung");
        getSupportedBrands().add("LG");
    }

    @Override
    public boolean isWaterProof() {
        return true;
    }
}
