package com.test.yyn;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * Created by apple on 15/9/20.
 */
public class TreeMapTest {
    public static void main(String[] args) {
        TreeMap<String,String> treeMap = new TreeMap<String,String>();
        treeMap.put("fda", "fdasd");
        treeMap.put("faa", "def");
        treeMap.put("b","fdasd");
        treeMap.put("a","def");
        treeMap.put("g","adf") ;
       // System.out.println(treeMap);
        for(Map.Entry test:treeMap.entrySet()){
            System.out.println(test.getKey()+" "+test.getValue());
        }
        //just println
        System.out.println(treeMap);
        HashMap<String,String> hashMap = new HashMap<String,String>();
        hashMap.put("b","fdasd");
        hashMap.put("a", "def");
        hashMap.put("g","adf") ;
        hashMap.put("d","afd");
        System.out.println("***hashmap***");
        for(Map.Entry test2:hashMap.entrySet()){
            System.out.println(test2.getKey()+":hashcode"+test2.getKey().hashCode()+" "+test2.getValue()+"");
        }
        System.out.println(hashMap);
    }
}
