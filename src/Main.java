import java.util.ArrayList;
import java.util.List;

/**
 * Created by Scott Lindley on 10/13/2016.
 */
public class Main {
    public static void main(String[] args) {

        List<Remote> remotes = new ArrayList<>();
        remotes.add(new LG(true,false));
        remotes.add(new Panasonic(true,true));
        remotes.add(new Samsung(false,false));
        remotes.add(new Sharp(false,true));
        remotes.add(new Sony(true,false));
        remotes.add(new Toshiba(false,false));

        for (Remote r : remotes){
            System.out.println("Remote type: "+r.getClass().getSimpleName());
            System.out.println("Supported brands: "+r.getSupportedBrands());
            r.numberButtonPressed(remotes.indexOf(r));
            r.channelUp();
            r.channelDown();
            r.volumeDown();
            r.volumeUp();
            System.out.println("Is waterproof?: "+r.isWaterProof());
            System.out.println("Is rechargeable?: "+r.isRechargeable());
            if(r.getClass().equals(Samsung.class)){
                Samsung s = (Samsung)r;
                s.explode();
            }
            System.out.println("****************");
        }
    }
}
