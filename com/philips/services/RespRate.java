package com.philips.services;

public class RespRate implements IVitals {
    @Override
    public boolean validateVital(int val) {
        if(val<30 || val>95){
            IReport rep = new Email();
            rep.action("RespRate", "RespRate value " + val + " is abnormal");
        }
        return false;
    }
}
