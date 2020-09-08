package com.philips.factory;

import com.philips.services.IVitals;

import java.util.HashMap;
import java.util.Map;
import java.util.ResourceBundle;
import java.util.Set;

public class GenerateVitals {
    public static Map<String,IVitals> map = new HashMap<>();
    static {
        ResourceBundle rb = ResourceBundle.getBundle("vitals");
        Set<String> keys = rb.keySet();
        for(String str:keys) {
            try {
                Class cls = Class.forName(rb.getString(str));
                IVitals obj = (IVitals) cls.newInstance();
                map.put(str,obj);
            }
            catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
    }
    public static IVitals getVital(String vital){
        return map.get(vital);
    }
    public static Set<String> getSet(){
        return map.keySet();
    }
}
