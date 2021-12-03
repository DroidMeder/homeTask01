package com.company;

import java.util.List;

public class Phone {
    private final String  ourCountryCode;
    private final boolean isCityCodeInsideDifferent;
    private final List<String> operators;
    private final boolean hasCodsOfOperators;
    private final Description description;
    private final TypeOfConnection[] typeOfConnection;


    public Phone(String ourCountryCode, boolean isCityCodeInsideDifferent, List<String> operators,
                 boolean hasCodsOfOperators, Description description, TypeOfConnection[] typeOfConnection) {
        this.ourCountryCode = ourCountryCode;
        this.isCityCodeInsideDifferent = isCityCodeInsideDifferent;
        this.operators = operators;
        this.hasCodsOfOperators = hasCodsOfOperators;
        this.typeOfConnection = typeOfConnection;
        this.description = description;
    }

    public String getOurCountryCode() {
        return ourCountryCode;
    }

    public boolean isCityCodeInsideDifferent() {
        return isCityCodeInsideDifferent;
    }

    public List<String> getOperators() {
        return operators;
    }

    public boolean isHasCodsOfOperators() {
        return hasCodsOfOperators;
    }

    public Description getDescription() {
        return description;
    }

    public TypeOfConnection[] getTypeOfConnection() {
        return typeOfConnection;
    }

}
