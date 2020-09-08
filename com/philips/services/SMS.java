package com.philips.services;

public class SMS implements IReport {
    @Override
    public void action(String VName, String msg) {
        System.out.println("SMS");
        System.out.println(VName + " - " + msg);

    }
}
