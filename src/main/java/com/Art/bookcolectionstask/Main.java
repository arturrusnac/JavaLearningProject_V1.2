package com.Art.bookcolectionstask;

public class Main {
    public static void main(String[] args) {
        int [] tablouDeDateInt = {9, 8, 7, 6, 5, 4, 3, 2, 1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        System.out.println(IntArrayManager.getTheMinValueOfArray(tablouDeDateInt));
        System.out.println(IntArrayManager.getTheMinIndexOfArray(tablouDeDateInt));
        System.out.println(IntArrayManager.getTheAverageOfArray(tablouDeDateInt));
    }
}
