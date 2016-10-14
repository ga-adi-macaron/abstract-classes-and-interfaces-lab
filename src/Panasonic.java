import java.util.ArrayList;

/**
 * Created by Scott Lindley on 10/13/2016.
 */
public class Panasonic extends Remote{

    public Panasonic(boolean needsBatteries, boolean supportsUsb) {
        super(needsBatteries, supportsUsb);
        supportsBrands();
    }

    @Override
    public void channelUp() {
        System.out.println("Panasonic remote went up one channel");
    }

    @Override
    public void channelDown() {
        System.out.println("Panasonic remote went down one channel");
    }

    @Override
    public void volumeUp() {
        System.out.println("Panasonic remote turned the volume up");
    }

    @Override
    public void volumeDown() {
        System.out.println("Panasonic remote turned the volume down");
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
        getSupportedBrands().add("Panasonic");
        getSupportedBrands().add("Sharp");
        getSupportedBrands().add("LG");
    }

    @Override
    public boolean isWaterProof() {
        return false;
    }
}
