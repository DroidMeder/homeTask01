package com.company;

import java.util.ArrayList;
import java.util.List;

public class Description {
    private List<String> dialingMethods;
    private boolean isInternationalCallCheap;
    private String baseFor;

    public Description(List<String> dialingMethods, boolean isInternationalCallCheap, String baseFor) {
        this.dialingMethods = dialingMethods;
        this.isInternationalCallCheap = isInternationalCallCheap;
        this.baseFor = baseFor;
    }

    public List<String> getDialingMethods() {
        return dialingMethods;
    }

    public boolean isInternationalCallCheap() {
        return isInternationalCallCheap;
    }

    public String getBaseFor() {
        return baseFor;
    }
}
