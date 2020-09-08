package com.philips.services;

public class SPO2 implements IVitals{
    @Override
    public boolean validateVital(int val) {
        if(val<90){
            IReport rep = new Email();
            rep.action("SPO2", "SPO2 value " + val + " is abnormal");
        }
        return false;
    }
}
