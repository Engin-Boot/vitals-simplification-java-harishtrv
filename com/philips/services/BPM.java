package com.philips.services;

public class BPM implements IVitals {
    @Override
    public boolean validateVital(int val) {
        if(val<70 || val>150){
            IReport rep = new SMS();
            rep.action("BPM", "BPM value " + val + " is abnormal");
        }
        return false;
    }
}
