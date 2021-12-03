package com.company;

import java.util.*;

public final class SmartPhone extends CellPhone{
    private final Map<String, String> messagers;
    public SmartPhone(String ourCountryCode, boolean isCityCodeInsideDifferent, List<String> operators,
                      boolean hasCodsOfOperators, Description description1, TypeOfConnection[] typeOfConnection,
                      Map<String, String> messagers) {
        super(ourCountryCode, isCityCodeInsideDifferent, operators, hasCodsOfOperators, description1, typeOfConnection);
        this.messagers = messagers;
    }

    public Map<String, String> getMessagers() {
        return messagers;
    }


    @Override
    public String makeCall(String name, Date date) {
        Map<String, String> messager = new HashMap<>(getMessagers());
        String key = "";
        String value = "";
        for (Map.Entry<String, String> pair : messager.entrySet()
             ) {
            key = pair.getKey();
            value= pair.getValue();
        }
        return super.makeCall(name, date) + " "+ value +" по "+key;
    }
}
