package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Remote samsung = new Samsung(true, true);
        Remote panasonic = new Panasonic(false, true);
        Remote sony = new Sony(false, false);

        List<Remote> remotes = new ArrayList<>();
        remotes.add(samsung);
        remotes.add(panasonic);
        remotes.add(sony);

        for (Remote remote: remotes) {
            remote.numberButtonPressed(500);
            remote.channelUp();
            remote.channelDown();
            remote.volumeUp();
            remote.volumeDown();
        }
    }
}
