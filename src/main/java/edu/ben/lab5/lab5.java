package edu.ben.lab5;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class lab5 {

    public static void main(String[] args)
    {

        List<String> myAlist = new ArrayList<>();
        myAlist.add("A");
        myAlist.add("B");
        myAlist.add("C");
        myAlist.add("D");
        myAlist.add("E");
        myAlist.add("F");
        myAlist.add("G");
        myAlist.add("H");
        myAlist.add("I");
        myAlist.add("J");
        myAlist.remove("A");
        System.out.println("New ArrayList : " + myAlist);
        myAlist.remove("B");
        System.out.println("New ArrayList : " + myAlist);
        myAlist.remove("C");
        System.out.println("New ArrayList : " + myAlist);
        myAlist.clear();
        System.out.println("New ArrayList : " + myAlist);


        List<String>  myLlist = new LinkedList<String>();

        myLlist.add("A");
        myLlist.add("B");
        myLlist.add("C");
        myLlist.add("D");
        myLlist.add("E");
        myLlist.add("F");
        myLlist.add("G");
        myLlist.add("H");
        myLlist.add("I");
        myLlist.add("J");
        myLlist.remove("A");
        System.out.println("New LinkedList : " + myLlist);
        myLlist.remove("B");
        System.out.println("New LinkedList : " + myLlist);
        myLlist.remove("C");
        System.out.println("New LinkedList : " + myLlist);
        myLlist.clear();
        System.out.println("New LinkedList : " + myLlist);
    }
}
// No difference for adding data in LL and Arraylist, Linked list and array list were both able to delete data at any given point in list
