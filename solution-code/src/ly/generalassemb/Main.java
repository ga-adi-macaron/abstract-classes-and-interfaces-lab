package ly.generalassemb;

import ly.generalassemb.remotes.Panasonic;
import ly.generalassemb.remotes.Remote;
import ly.generalassemb.remotes.Samsung;
import ly.generalassemb.remotes.Sony;
import ly.generalassemb.remotes.interfaces.Rechargeable;
import ly.generalassemb.remotes.interfaces.Universal;
import ly.generalassemb.remotes.interfaces.WaterProof;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        // Create and populate a list of remotes
        List<Remote> remotes = new ArrayList<Remote>();
        remotes.add(new Samsung(true, false));
        remotes.add(new Panasonic(false, false));
        remotes.add(new Sony(true, true));

        // Call methods from each remote
        System.out.println("\nTesting each remote...\n");

        for (int i = 0; i < remotes.size(); i++) {

            System.out.println("\nRemote #" + i);

            Remote remote = remotes.get(i);
            remote.numberButtonPressed(i);
            remote.channelUp();
            remote.channelDown();
            remote.volumeUp();
            remote.volumeDown();

            // If this object implements the WaterProof interface, call the method from that interface
            if (remote instanceof WaterProof) {
                // The variable `remote` was declared as type Remote, so must cast it to type `WaterProof` before
                // calling a method declared in the WaterProof interface
                ((WaterProof) remote).isWaterProof();
            }

            // If this object implements the Rechargeable interface, call the method from that interface
            if (remote instanceof Rechargeable) {
                // The variable `remote` was declared as type Remote, so must cast it to type `Rechargeable` before
                // calling a method declared in the Rechargeable interface
                ((Rechargeable) remote).isRechargeable();
            }

            // If this object implements the Universal interface, call the method from that interface
            if (remote instanceof Universal) {
                // The variable `remote` was declared as type Remote, so must cast it to type `Universal` before
                // calling a method declared in the Universal interface
                ((Universal) remote).supportsBrands();
            }
        }
    }
}
