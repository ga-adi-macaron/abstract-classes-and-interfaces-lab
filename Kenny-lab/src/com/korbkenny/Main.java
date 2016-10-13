package com.korbkenny;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Remote visio = new Vizio(true, false);
        Remote dynex = new Dynex(true, true);
        Remote insignia = new Insignia(false, false);

        List<Remote> worldsBestRemotes = new ArrayList<>();
        worldsBestRemotes.add(visio);
        worldsBestRemotes.add(dynex);
        worldsBestRemotes.add(insignia);

        int i = 0;
        for (Remote remotes: worldsBestRemotes){
            //How does one print the name of a variable in a list?
            remotes.getName();
            remotes.numberButtonPressed(i+1);
            i++;
            remotes.channelUp();
            remotes.channelDown();
            remotes.volumeUp();
            remotes.volumeDown();
            System.out.println("");
        }


    }
}
