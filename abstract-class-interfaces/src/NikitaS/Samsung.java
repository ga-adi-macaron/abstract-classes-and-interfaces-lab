package NikitaS;

/**
 * Created by NikitaShuvalov on 10/13/16.
 */
public class Samsung extends Remote implements Universal, Rechargable, WaterProof {
    private int mChannel;
    private int mVolume;

    public Samsung(boolean needsBatteries, boolean supportsUsb) {
        super(needsBatteries, supportsUsb);
        mChannel = 99;
        mVolume=6;
    }

    @Override
    public void supportsBrand() {
        System.out.println("Supports Samsung as well as several other brands. Refer to manual for list of compatible tv sets.");
    }

    @Override
    public boolean isWaterProof() {
        return true;
    }

    @Override
    public boolean isRechargable() {
        return true;
    }

    @Override
    public void channelUp() {
        mChannel++;
        if (mChannel==100){
            mChannel =1;
        }
        System.out.println(String.format("Channel: %s", mChannel));
    }

    @Override
    public void channelDown() {
        mChannel--;
        if(mChannel==0){
            mChannel=99;
        }
        System.out.println(String.format("Channel: %s", mChannel));
    }

    @Override
    public void volumeUp() {
        mVolume++;
        if(mVolume==11){
            System.out.println("Max Volume");
            mVolume=10;
        }else{
            System.out.println(String.format("Volume: %s", mVolume));
        }

    }

    @Override
    public void volumeDown() {
        mVolume--;
        if (mVolume < 0) {
            System.out.println("Muted");
            mVolume = 0;
        } else {
            System.out.println(String.format("Volume: %s", mVolume));
        }
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
