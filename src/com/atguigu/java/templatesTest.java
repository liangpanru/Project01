package com.atguigu.java;

import java.util.ArrayList;

/**
 * @author liangpanru
 * @date 2019-05-04 - 10:24
 */
public class templatesTest {

    public static final int num=1;


    public static void main(String[] args) {
        System.out.println("args = [" + args + "]");
        System.out.println("abc");
        String[] string = new String[]{"liang","pan","ru"};




        for (int i = 0; i < string.length; i++) {
            System.out.println(string[i]);
        }
        for (String s : string) {
            System.out.println(s);
        }
        for (int i = 0; i < string.length; i++) {
            String s = string[i];
            System.out.println(s);
        }

        ArrayList list = new ArrayList();
        list.add(123);
        list.add(456);
        list.add(789);
        for (Object o : list) {
            
        }
        for (int i = 0; i < list.size(); i++) {
            
        }
        for (int i = list.size() - 1; i >= 0; i--) {
            
        }


    }
}
