package com.kalomiris;

import java.util.List;

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

    public String sort(List<Integer> input) {
        int temp;
        for (int j = 1; j <= input.size()-1; j++) {
            for (int i = 0; i < input.size()-j; i++) {
                if (compare(input.get(i), input.get(i+1)) == 1) {
                    temp = input.get(i);
                    input.set(i,input.get(i+1));
                    input.set(i+1,temp);
                }
            }
        }
        return input.toString();

    }


}
