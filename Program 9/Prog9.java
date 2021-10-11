package com.company;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import static java.lang.System.*;

public class Prog9 {
    static public void main (String args[]){
        ArrayList<String> list = new ArrayList<>();
        Scanner sc = new Scanner(in);
        int n;
        out.print("Enter the no. of colours to add : ");
        n = sc.nextInt();
        out.println("Enter them :- ");
        for (int i = 0; i < n; i++)
            list.add(sc.next());
        out.println("\nArrayList = " + list);
        String []arr = new String[100];
        list.toArray(arr);
        out.println("\nConverting to String array : ");
        for (int i = 0; i < n; i++)
            out.print(arr[i] + ", ");
        out.println();
        Collections.reverse(list);
        out.println("\nAfter reversing array list : " + list);
        out.println("\nEnter the starting and ending index for sublist : ");
        int x = sc.nextInt();   int y = sc.nextInt();
        out.println("SubList = " + list.subList(x,y));
        Collections.sort(list);
        out.println("\nArray list after sorting = " + list);
        ArrayList<String> list2;
        list2 = (ArrayList<String>) list.clone();
        out.println("\nClone of ArrayList = " + list2);
    }
}