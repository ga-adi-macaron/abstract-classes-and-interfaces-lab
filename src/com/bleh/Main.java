package com.bleh;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Remote> remotes = new ArrayList<>();

        remotes.add(new LG(true,false));
        remotes.add(new Panasonic(true,true));
        remotes.add(new Samsung(false,true));

        for (Remote remote: remotes){
            System.out.println(remote.powerButtonPressed());
            remote.channelDown();
            remote.channelUp();
            remote.volumeDown();
            remote.volumeUp();
            for (int numButton = 0; numButton < 10; numButton++) {
                System.out.println(remote.numberButtonPressed(numButton));
            }
            System.out.println("\n");
        }








    }

}
