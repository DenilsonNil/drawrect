package br.com.kualit.printrect.core;

import java.util.ArrayList;
import java.util.List;

public final class Math {

    private static final int MAX_FIGURES = 5;
    private static final int MAX_LIST_SIZE = 2;

    public List<Integer> getDimensions(int operator) {
        List<Integer> dimensions = new ArrayList<>();

        for (int i = 0; i < 99999; i++) {
            int mult = operator * i;

            if (Long.toString(mult).length() == MAX_FIGURES) {
                dimensions.add(mult);
                if (dimensions.size() == MAX_LIST_SIZE) break;
            }
        }
        return dimensions;
    }
}
