package com.company;

import java.util.Date;
import java.util.List;

public class CellPhone extends Phone{

    public CellPhone(String ourCountryCode, boolean isCityCodeInsideDifferent, List<String> operators,
                     boolean hasCodsOfOperators, Description description, TypeOfConnection[] typeOfConnection) {
        super(ourCountryCode, isCityCodeInsideDifferent, operators, hasCodsOfOperators, description, typeOfConnection);
    }

    public final String makeCall(){
        return "Звонок";
    }
    public String makeCall(String name){
        return makeCall()+" от "+name;
    }
    public String makeCall(String name, Date date){
        return "Вам был "+makeCall(name)+" в "+date;
    }
}
