package com.jlieblich;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Remote sony = new Sony(false, true, 15);
        Remote samsung = new Samsung(false, true, 100);
        Remote bestRemote = new BestTvBrand(false, false);

        List<Remote> remotes = new ArrayList<>();
        remotes.add(sony);
        remotes.add(samsung);
        remotes.add(bestRemote);

        for (Remote remote : remotes) {
            remote.printCurrentChannel();
            remote.numberButtonPressed(200);
            remote.channelUp();
            remote.channelDown();
            remote.volumeUp();
            remote.volumeDown();
        }
    }
}
