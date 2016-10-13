package NikitaS;

/**
 * Created by NikitaShuvalov on 10/13/16.
 */
public class Sony extends Remote implements Universal, Rechargable, WaterProof {

    public Sony(boolean needsBatteries, boolean supportsUsb) {
        super(needsBatteries, supportsUsb);
    }

    @Override
    public void supportsBrand() {
        System.out.println("Sony-exclusive support");
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
        System.out.println("Canal aumentado");
    }

    @Override
    public void channelDown() {
        System.out.println("Canal disminuido");
    }

    @Override
    public void volumeUp() {
        System.out.println("Volumen aumentado");
    }

    @Override
    public void volumeDown() {
        System.out.println("Volumen disminuido");
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
