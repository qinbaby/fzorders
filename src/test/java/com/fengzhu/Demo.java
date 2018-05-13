package com.fengzhu;

import java.util.Arrays;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
//        Person p = new Child();
//        p.eat();

        /*String[] ary = {"a","b","c","d","e","f"};
        List<String> list = Arrays.asList(ary);
        //list.forEach((l) -> System.out.println(l + "; "));
        list.forEach(System.out::println);*/
        new Thread(() -> System.out.println("Hello world !")).start();
    }
}
