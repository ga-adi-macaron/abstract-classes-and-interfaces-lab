/**
 * Created by Scott Lindley on 10/13/2016.
 */
public class Sony extends Remote {
    public Sony(boolean needsBatteries, boolean supportsUsb) {
        super(needsBatteries, supportsUsb);
        supportsBrands();
    }

    @Override
    public void channelUp() {
        System.out.println("Sony remote went up one channel");
    }

    @Override
    public void channelDown() {
        System.out.println("Sony remote went down one channel");
    }

    @Override
    public void volumeUp() {
        System.out.println("Sony remote turned the volume up");
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
    }

    @Override
    public boolean isWaterProof() {
        return false;
    }
}
