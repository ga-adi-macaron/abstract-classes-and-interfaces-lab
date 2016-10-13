package com.joelimyx;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
        List<Remote> remoteList = new ArrayList<>();
        remoteList.add(new Vizio(false, true, "Vizio"));
        remoteList.add(new Acer(true, true, "Acer"));
        remoteList.add(new Samsung(false, false, "Samsung"));

        for (Remote remote : remoteList) {

            System.out.println(remote.getName()+ ": ");
            for (int i = 1; i <=5; i++) {
                remote.numberButtonPressed(i);
            }
            remote.channelDown();
            remote.channelUp();
            remote.volumeDown();
            remote.volumeUp();
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~");
        }

    }
}
