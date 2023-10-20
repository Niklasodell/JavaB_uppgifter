package com.niklas.demo;

// import com.niklas.demo.lektion_1.uppgift_1.Counter;

import com.niklas.demo.lektion_2.puzzle_2.DataStructureSorting;
import com.niklas.demo.lektion_2.puzzle_3.SwitchPlacesDataStructure;
import com.niklas.demo.lektion_2.puzzle_4.NoNegative;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        //Exercise 1_1
        /*
        Counter counter = new Counter();

        counter.counter();
        counterStatic();
        */

        //Exercise 1_2
        /*
        Counter counterOne = new Counter();
        Counter counterTwo = new Counter();
        Counter counterThree = new Counter();

        counterOne.counter();
        counterTwo.counterStatic();
        counterThree.counterStatic();
        */

        //Exercise 2_2
        /*
        DataStructureTraining dataStructureTraining = new DataStructureTraining();
        dataStructureTraining.myLinkedList();
        */

        //Exercise 2_3
        /*
        DataStructureTraining dataStructureTraining = new DataStructureTraining();
        dataStructureTraining.myLinkedList();
        */

        //Exercise 2_4
        /*
        List<Student> studentList = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            Student benny = new Student("Benny"+i, 15+i);

            studentList.add(benny);

        }

        // Anonymous object example
        for (int i = 0; i < 10; i++) {
        studentList.add(
                new Student("Benny"+i, 15+i)
            );
        }
        */

        //Puzzle 2_2
        /*
        DataStructureSorting dataStructureSorting = new DataStructureSorting();
        dataStructureSorting.sort();
        */

        //Puzzle 2_3
        /*
        SwitchPlacesDataStructure switchPlacesDataStructure = new SwitchPlacesDataStructure();
        switchPlacesDataStructure.myArrayList();
        */

        //Puzzle 2_4
        NoNegative noNegative = new NoNegative();

        noNegative.noNeg(new ArrayList<>
                (Arrays.asList(0, 5, -1)
        ));
    }

}


