package com.github.curriculeon;


import com.sun.tools.javac.code.Attribute;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

// Two arrays
// an integer
// Identify the number of times the integer occurs in both arrays total.
public class LeonProblem {
    public Integer LeonProblem(ArrayList<Integer> array1, ArrayList<Integer> array2, Integer mysteryNumber){
        Integer occurences = 0;
        for (int i = 0; i < array1.size(); i++) {
            if(array1.contains(mysteryNumber))
                occurences++;
        }
        for (int i = 0; i < array2.size(); i++) {
            if(array2.contains(mysteryNumber))
                occurences++;
        }
        return occurences;
    }

    //Given a string, identify the number of groups* characters which are adjacent to an identical character
    // "aabbbbcccadseadesa"
    public int LeonProblem2(String input){
        int occurrences = 0;
        char[] inputArray = input.toCharArray();
        for (int i = 0; i < inputArray.length - 1; i++) {
            if (inputArray[i] == inputArray[i+1]){
                occurrences++;
                while( i < inputArray.length - 1 && inputArray[i] == inputArray[i + 1]){
                    i++;
                }
            }
        }
        return occurrences;
    }
}
