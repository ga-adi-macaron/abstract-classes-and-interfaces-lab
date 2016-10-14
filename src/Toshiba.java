/**
 * Created by Scott Lindley on 10/13/2016.
 */
public class Toshiba extends Remote{
    public Toshiba(boolean needsBatteries, boolean supportsUsb) {
        super(needsBatteries, supportsUsb);
        supportsBrands();
    }

    @Override
    public void channelUp() {
        System.out.println("Toshiba remote went up one channel");
    }

    @Override
    public void channelDown() {
        System.out.println("Toshiba remote went down one channel");
    }

    @Override
    public void volumeUp() {
        System.out.println("Toshiba remote turned the volume up");
    }

    @Override
    public void volumeDown() {
        System.out.println("Toshiba remote turned the volume down");
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
        getSupportedBrands().add("Toshiba");
    }

    @Override
    public boolean isWaterProof() {
        return false;
    }
}
