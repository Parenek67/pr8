package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
    ArrayList<String> list = new ArrayList<>();
    list.add("эту строку я удалю");
    list.add("строка");
    list.add("а эту не удалю");
    WaitList<String> ob = new WaitList<>(list);
    ob.add("вторая строка");
    ob.add("третья строка");
    ob.remove();
    System.out.println(ob.toString());
    System.out.println(ob.constains("строка"));
    System.out.println(ob.constains("а эту не удалю"));

    UnfairWaitList<Integer> ob1 = new UnfairWaitList<>();
    for(int i = 0;i<10;i++)
        ob1.add(i);
    ob1.MoveToBack(7);
    System.out.println(ob1.toString());

    BoundedWaitList<Integer> ob2 = new BoundedWaitList<>(2);
    ob2.add(1);
    ob2.add(2);
    ob2.add(3);
    System.out.println(ob2.toString());
    }
}
