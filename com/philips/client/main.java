package com.philips.client;

import com.philips.factory.GenerateVitals;
import com.philips.services.IVitals;

import java.util.Scanner;
import java.util.Set;

public class main {
    public static void main(String[] args){
        String opt = null;
        do {
            Set<String> s = GenerateVitals.getSet();
            System.out.println("Vitals menu items :");
            for (String str : s) {
                System.out.println(str);
            }
            Scanner scan = new Scanner(System.in);
            String vital = scan.next();
            if(s.contains(vital)) {
                IVitals obj = GenerateVitals.getVital(vital);
                System.out.println("Enter Vital value");
                int val = scan.nextInt();
                obj.validateVital(val);
            }
            else
                System.out.println("please enter valid vital name");
            System.out.println("Enter y to check again");
            opt = scan.next();
        }while(opt.equals("y"));
        }
    }
