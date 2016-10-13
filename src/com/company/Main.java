package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Remote> remote = new ArrayList<>();
        Remote lg = new Lg(true, false);
        Remote samsung = new Samsung(true, true);
        Remote sony = new Sony(false, true);

        remote.add(lg);
        remote.add(samsung);
        remote.add(sony);

        for (int i = 0; i < remote.size(); i++) {
            remote.get(i).numberButtonPressed(i);
            remote.get(i).channelDown();
            remote.get(i).channelUp();
            remote.get(i).volumeDown();
            remote.get(i).volumeUp();
        }
    }
}
