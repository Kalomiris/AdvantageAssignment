package com.kalomiris;

public class LargestCombination {

    public int compare(int a,int b){
        String strA = Integer.toString(a);
        String strB = Integer.toString(b);

        String sumA = strA + strB;
        int sumAA = Integer.parseInt(sumA);
        String sumB = strB + strA;
        int sumBB = Integer.parseInt(sumB);

        if(sumAA >= sumBB){
            return 0;
        } else {
            return 1;
        }
    }
}
