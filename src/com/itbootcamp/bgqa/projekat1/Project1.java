package com.itbootcamp.bgqa.projekat1;

import java.util.ArrayList;
import java.util.Arrays;

public class Project1 {
    public static void main(String[] args) {
        int[] s = {1,2,3};
        System.out.println(powerSet(s));
    }

    public static ArrayList<ArrayList<Integer>> powerSet(int[] s) {
        ArrayList<ArrayList<Integer>> powerSet = new ArrayList<>();
        powerSet.add(new ArrayList<>());

        for (int elem : s) {
            ArrayList<ArrayList<Integer>> powerSetCopy = new ArrayList<>();

            powerSetCopy.addAll(powerSet);
            for (ArrayList<Integer> set : powerSetCopy) {
                set.add(elem);
            }
            powerSet.addAll(powerSetCopy);
        }

        return powerSet;
    }

    public static ArrayList<ArrayList<Integer>> powerSet(ArrayList<Integer> array) {
        ArrayList<ArrayList<Integer>> power = new ArrayList<>();
        power.add(new ArrayList<>());

        for (Integer element : array) {
            ArrayList<ArrayList<Integer>> powerCopy = new ArrayList<>();
            powerCopy.addAll(power);

            for (ArrayList<Integer> set : powerCopy) {
                set.add(element);
            }

            power.addAll(powerCopy);

        }

        return power;
    }
}
