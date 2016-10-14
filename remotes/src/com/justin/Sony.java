package com.justin;



/**
 * Created by justinwells on 10/13/16.
 */
public class Sony extends Remote {



    public Sony(boolean needsBatteries, boolean supportsUsb)  {
        super(needsBatteries, supportsUsb);
    }

    @Override
    public boolean isUniversal() {
        return true;
    }

    @Override
    public boolean isWaterProof() {
        return false;
    }

    @Override
    public boolean isRechargeable() {
        return super.supportsUsb();
    }

    @Override
    public void channelUp() {
        System.out.println("チャンネルアップ");
    }

    @Override
    public void channelDown() {
        System.out.println("ダウンチャンネル");
    }

    @Override
    public void volumeUp() {
        System.out.println("ボリュームを上げます");
    }

    @Override
    public void volumeDown() {
        System.out.println("ボリュームダウン");
    }
}
