package com.epam.mjc;

import java.util.ArrayList;

public class InterfaceCreator {

    public Operation<Integer> divideBy(Integer divider) {

        return (list) -> {
            ArrayList<Integer> result = new ArrayList<>();
            for (Integer dividend : list) {
                result.add(dividend / divider);
            }
            return result;
        };
    }
}
