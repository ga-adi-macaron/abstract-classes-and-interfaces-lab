package NikitaS;

/**
 * Created by NikitaShuvalov on 10/13/16.
 */
public class HTC extends Remote implements Universal, Rechargable, WaterProof {
    private int mChannel;
    private int mVolume;

    public HTC(boolean needsBatteries, boolean supportsUsb) {
        super(needsBatteries, supportsUsb);
        mChannel =5;
        mVolume = 40;
    }

    @Override
    public void supportsBrand() {
        System.out.println("Supports all major brands.");
    }

    @Override
    public boolean isWaterProof() {
        return false;
    }

    @Override
    public boolean isRechargable() {
        return true;
    }

    @Override
    public void channelUp() {
        mChannel++;
        System.out.println(String.format("Changed to channel %s", mChannel));
    }

    @Override
    public void channelDown() {
        mChannel--;
        System.out.println(String.format("Changd to channel %s", mChannel));
    }

    @Override
    public void volumeUp() {
        mVolume+=5;
        if(mChannel>100){
            mVolume=100;
        }
        System.out.println(String.format("Volume: %s", mVolume));
    }

    @Override
    public void volumeDown() {
        mVolume-=5;
        if(mVolume<0){
            mVolume=0;
            System.out.println("Muted");
        }
        System.out.println(String.format("Volume: %s", mVolume));

    }
    public void printAllInfo(){
        String[] info = new String[4];
        if (needsBatteries()){
            info[0]="Requires AA batteries.";
        }else{
            info[0]="No batteries required.";
        }
        if(supportsUsb()){
            info[1]="Has full USB support.";
        }else{
            info[1]="Does not have a USB port.";
        }
        if(isWaterProof()){
            info[2]="Feel free to watch your shows from the tub because this remote is waterproof.";
        }else{
            info[2]="Any fluids on or near this remote will result in loss of functionality.";
        }
        if(isRechargable()){
            info[3]="Use the handy recharge cable to recharge this remote.";
        }else{
            info[3]="You can't recharge this remote.";
        }
        for (String string:info) {
            System.out.println(string);
        }
        supportsBrand();
    }
}
