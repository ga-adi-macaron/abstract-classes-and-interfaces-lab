package com.justin;

import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Remote remote1 = new Sony (false,true);
        Remote remote2 = new Samsung(false,true);
        Remote remote3 = new Bosch(true,false);

        List<Remote> remotes = new ArrayList<>();

        remotes.add(remote1);
        remotes.add(remote2);
        remotes.add(remote3);

        for (int i = 0; i < remotes.size();i++)
        {
            remotes.get(i).numberButtonPressed(i);
            remotes.get(i).channelUp();
            remotes.get(i).channelDown();
            remotes.get(i).volumeDown();
            remotes.get(i).volumeUp();
        }
    }
}
