package com.kalomiris;

import java.util.List;

public class LargestCombination {
/*Input two integers from sort method.*/
/*Convert them to string and compare their sum with inversion sum.*/
    public int compare(int a,int b){
        String strA = Integer.toString(a);
        String strB = Integer.toString(b);

        String sumA = strA + strB;
        //Convert string to int for the comparison.
        int sumAA = Integer.parseInt(sumA);
        String sumB = strB + strA;
        //Convert string to int for the comparison.
        int sumBB = Integer.parseInt(sumB);

        if(sumAA >= sumBB){
            return 0;
        } else {
            return 1;
        }
    }
/*Input a list of numbers and sort them with double loop.*/
    public String sort(List<Integer> input) {
        int temp;
        String output = "";
        for (int j = 1; j <= input.size()-1; j++) {
            for (int i = 0; i < input.size()-j; i++) {
                if (compare(input.get(i), input.get(i+1)) == 1) {
                    temp = input.get(i);
                    input.set(i,input.get(i+1));
                    input.set(i+1,temp);
                }
            }
        }
        /* the final conversion, int to string. */
        for (Integer element:input){
            output = output + element.toString();
        }

        return output;

    }


}
