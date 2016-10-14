package com.elysium;

/**
 * Created by jay on 10/14/16.
 */
public abstract class Remote {

    public boolean needsBatteries() {
        super(Batteries);
        needsBatteries = batteries;
        return true;
    }

    public boolean supportsUSB() {
        super(USB);
        supportsUSB = USB;
        return false;
    }


}
