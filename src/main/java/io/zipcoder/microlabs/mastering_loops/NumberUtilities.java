package io.zipcoder.microlabs.mastering_loops;


public class NumberUtilities {
    public static String getEvenNumbers(int start, int stop) {
        StringBuilder str = new StringBuilder();
        for (int i = start; i < stop; i++) {
            if (i % 2 == 0) {
                str.append(i);
            }
        }
        String result = str.toString();
        return result;
    }


    public static String getOddNumbers(int start, int stop) {

        StringBuilder str = new StringBuilder();
        for (int i = start; i < stop; i++) {
            if (i % 2 != 0) {
                str.append(i);
            }
        }
        String result = str.toString();
        return result;
    }


    public static String getSquareNumbers(int start, int stop, int step) {
        return NumberUtilities.getExponentiations(start, stop, step, 2);
    }

    public static String getRange(int stop) {
        return NumberUtilities.getRange (0, stop);

//        String result = "";
//        int numToPrint = 0;
//        for (int i = 0; i < stop; i++) {
//            result += numToPrint;
//            numToPrint++;
//        }
//
//        return result;
    }

    public static String getRange(int start, int stop) {
       return NumberUtilities.getRange (start, stop, 1);
//        String result = "";
//        int numToPrint = start;
//        for (int i = start; i < stop; i++) {
//            result += numToPrint;
//            numToPrint++;
//        }
//        return result;
    }


    public static String getRange(int start, int stop, int step) {
//        String result = "";
//        int numToPrint = start;
//        for (int i = start; i < stop; i += step) {
//            result += numToPrint;
//            numToPrint += step;
//        }
//        return result;

        //String builder method
        StringBuilder str = new StringBuilder();
        for (int i = start; i < stop; i += step) {
            str.append(i);
        }
        String result = str.toString();
        return result;
    }


    public static String getExponentiations(int start, int stop, int step, int exponent) {
        StringBuilder str = new StringBuilder();
        for (int i = start; i < stop; i += step) {
            Integer numToAppend = (int) Math.pow(i, exponent);
            str.append(numToAppend);
        }
        String result = str.toString();
        return result;
    }
}
