package com.github.curriculeon;

public class TriangleUtilities {

    public static String getTriangle(int numberOfRows) {
        //Create a variable to store the 'result' to return later
        String result = "";
            // Start looping 'numberOfRow' times
        for (int i = 0; i < numberOfRows; i++) {
        
            // within each iteration create a row with 'iteration number' of star
            String row = getRow(numberOfRows);
            // add the newly created row to the 'result'
            result += row + "\n";
            //finish loop
        }
                // return result
        return result;
    }

    public static String getRow(int numberOfStars) {
        // create a result(Variable) to add stars too
        String result = "";
        String star = "*";
            // Have a loop to add to the result a string '*' to then store in result
        for (int i = 0; i < numberOfStars; i++) {
            result += star;
        }

        return result;
    }

    public static String getSmallTriangle() {

        return getTriangle(4);
    }

    public static String getLargeTriangle() {
        return getTriangle(9);
    }
}
