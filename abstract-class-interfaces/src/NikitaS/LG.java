package NikitaS;

/**
 * Created by NikitaShuvalov on 10/13/16.
 */
public class LG extends Remote implements Universal, WaterProof, Rechargable {
    private String mLanguage;

    public LG(boolean needsBatteries, boolean supportsUsb) {
        super(needsBatteries, supportsUsb);
        mLanguage="german";
    }

    @Override
    public void supportsBrand() {
        System.out.println("Supports LG brand TVs and refrigerators");
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
        System.out.println("Fernsehprogramm Zuwachs (+)");
    }

    @Override
    public void channelDown() {
        System.out.println("Fersehprogramm Verringern (-)");
    }

    @Override
    public void volumeUp() {
        System.out.println("Lautstarke Zuwachs");
    }

    @Override
    public void volumeDown() {
        System.out.println("Lautstarke Verringern");
    }

    public String getLanguage() {
        return mLanguage;
    }

    public void setLanguage(String language) {
        mLanguage = language;
    }

    @Override
    public void printAllInfo(){
        String[] info = new String[4];
        System.out.println("Current language: "+getLanguage());
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
