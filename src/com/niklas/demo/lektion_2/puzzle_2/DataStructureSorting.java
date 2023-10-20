package com.niklas.demo.lektion_2.puzzle_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class DataStructureSorting {

    List<Integer> unsortedList = new ArrayList<>(
            Arrays.asList(10, 9, 8, 7, 6, 5, 4, 3, 2, 1)
    );

    public void sort() {
        Collections.sort(unsortedList);
        System.out.println(unsortedList);
    }
}
