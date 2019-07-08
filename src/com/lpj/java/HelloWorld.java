package com.lpj.java;

import java.io.FileInputStream;
import java.util.ArrayList;

public class HelloWorld {
    public  static  void main(String[] args){
        System.out.println("HelloWorld");
        ArrayList list=new ArrayList( );
        list.add(123);
        list.add(123);
        list.add(123);list.add(123);
        for (Object o : list) {
            System.out.println(list);
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list);
        }


        String arr[]=new String[]{"limei","laipengjian","ppx"};


        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];
            System.out.println(s);
        }


    }


}
