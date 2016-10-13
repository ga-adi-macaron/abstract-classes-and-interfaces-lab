package NikitaS;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Remote> allRemotes = new ArrayList<>();

        allRemotes.add(new HTC(false, true));
        allRemotes.add(new Panasonic(true, false));
        allRemotes.add(new Samsung(false, true));

        int i = 0;
        for (Remote remote:allRemotes) {
            System.out.println("\n");
            remote.printAllInfo();
            System.out.println("\n");
            remote.channelUp();
            remote.channelDown();
            remote.volumeUp();
            remote.volumeDown();
            i++;
            remote.numberButtonPressed(i);
            System.out.println("---------------------");
        }
    }
}


//
//        Implement the methods defined by those interfaces. You can choose what to do, but at the minimum print something out to the terminal.
//
//        Main Java Class
//
//        Create a List of Remote objects.
//
//        Populate the List of Remote objects with new instances of the concrete classes you created.
//
//        Create a loop that loops as many times as there are items in the List of Remote objects. (You choose the kind of loop)
//
//        Inside the loop call the numberButtonPressed method on each object and pass it the current iteration value of the loop.
//
//        Inside the loop call the channelUp, channelDown, volumeUp, volumeDown methods on each object.
//
//        Bonus:
//
//        Create 3 more concrete classes that extend Remote and use them in the loop.
//        Deliverable
//
//        Pull request from forked Project on GitHub that contains your implementation of the Remote abstract class, the WaterProof, Rechargeable, and Universal interface classes, and the main program that uses the classes you created.