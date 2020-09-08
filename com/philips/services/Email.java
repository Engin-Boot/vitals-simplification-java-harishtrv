package com.philips.services;

public class Email implements IReport {
    @Override
    public void action(String VName, String msg) {
        System.out.println("Email alert");
        System.out.println(VName + " - " + msg);
    }
}
