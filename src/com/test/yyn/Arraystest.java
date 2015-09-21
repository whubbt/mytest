package com.test.yyn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by apple on 15/9/20.
 */
public class Arraystest {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(13,12,12)  ;
       //can't remove a element from a fixed-size list
       // list.remove(12);
        List<Integer> list2= new ArrayList<Integer>(list);
        list2.remove(0);
        System.out.println(list2);
        List<Integer> list3 = new LinkedList<>();
        list3.add(3);
        list3.add(2);
        System.out.println(list3.get(0));
    }
}
