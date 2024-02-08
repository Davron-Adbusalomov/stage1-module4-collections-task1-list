package com.epam.mjc.collections.list;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class ListSorter {
    public void sort(List<String> sourceList) {
        List<String> stringList = new LinkedList<>(sourceList);
        stringList.sort(new ListComparator());
        sourceList.clear();
        sourceList.addAll(stringList);
    }
}

class ListComparator implements Comparator<String> {
    @Override
    public int compare(String a, String b) {
        int absA = Math.abs(Integer.parseInt(a));
        int absB = Math.abs(Integer.parseInt(b));

        if (absA != absB) {
            return Integer.compare(absA, absB);
        } else {
            // If absolute values are equal, compare the original values
            return Integer.compare(Integer.parseInt(a), Integer.parseInt(b));
        }
    }
}
