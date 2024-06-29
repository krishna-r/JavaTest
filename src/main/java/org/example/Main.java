package org.example;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedList;
import java.util.PriorityQueue;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    static int[] wt = {1, 4, 9, 6};
    static int[] val = {7, 96, 1, 45};
    static int w = 10;
    static int n = wt.length;


    public static void main(String[] args) {
        knapsack ks=new knapsack();
        System.out.println(ks.matrix(wt, val, w, n));
        System.out.println(ks.rec(n,w,wt,val));
        System.out.println(ks.memoization(n,w,wt,val));
    }





}




