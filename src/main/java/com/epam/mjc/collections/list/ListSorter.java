package com.epam.mjc.collections.list;

import java.util.Comparator;
import java.util.List;

public class ListSorter {
    public void sort(List<String> sourceList) {
        sourceList.sort(new ListComparator());
    }
}

class ListComparator implements Comparator<String> {
    @Override
    public int compare(String a, String b) {
        int numberA = Integer.parseInt(a);
        int numberB = Integer.parseInt(b);
        int resultA = 5 * (int) Math.pow(numberA, 2) + 3;
        int resultB = 5 * (int) Math.pow(numberB, 2) + 3;
        return resultA == resultB ? numberA - numberB : resultA - resultB;
    }
}
