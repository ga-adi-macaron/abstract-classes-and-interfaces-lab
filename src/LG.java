/**
 * Created by Scott Lindley on 10/13/2016.
 */
public class LG extends Remote{
    public LG(boolean needsBatteries, boolean supportsUsb) {
        super(needsBatteries, supportsUsb);
        supportsBrands();
    }

    @Override
    public void channelUp() {
        System.out.println("LG remote went up one channel");
    }

    @Override
    public void channelDown() {
        System.out.println("LG remote went down one channel");
    }

    @Override
    public void volumeUp() {
        System.out.println("LG remote turned the volume up");
    }

    @Override
    public void volumeDown() {
        System.out.println("LG remote turned the volume down");
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
        getSupportedBrands().add("LG");
        getSupportedBrands().add("Sharp");
        getSupportedBrands().add("Toshiba");
    }

    @Override
    public boolean isWaterProof() {
        return true;
    }
}
