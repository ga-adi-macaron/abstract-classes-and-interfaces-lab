package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Remote> remote = new ArrayList<>();
        Remote lg = new Lg(true, false);
        Remote samsung = new Samsung(true, true);
        Remote sony = new Sony(false, true);
        Remote arcelik = new Arcelik(false, false);
        Remote vestel = new Vestel(false, true);
        Remote beko = new Beko(true, true);

        remote.add(lg);
        remote.add(samsung);
        remote.add(sony);
        remote.add(arcelik);
        remote.add(vestel);
        remote.add(beko);

        for (int i = 0; i < remote.size(); i++) {
            remote.get(i).numberButtonPressed(i);
            remote.get(i).channelDown();
            remote.get(i).channelUp();
            remote.get(i).volumeDown();
            remote.get(i).volumeUp();
        }
    }
}
