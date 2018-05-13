package com.fengzhu;

import org.junit.Test;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class TestLambad {

    @Test
    public void test1(){
        String[] atp = {"Rafael Nadal", "Novak Djokovic",
                "Stanislas Wawrinka",
                "David Ferrer","Roger Federer",
                "Andy Murray","Tomas Berdych",
                "Juan Martin Del Potro"};

        List<String> players =  Arrays.asList(atp);
        long t1 = System.currentTimeMillis();
        // 以前的循环方式
        for (String player : players) {
            System.out.print(player + "; ");
        }

        long t2 = System.currentTimeMillis();
        System.out.println();
        System.out.println("运行时间=="+(t2 - t1));

    }


    @Test
    public void testListSort(){
        String[] players = {"Rafael Nadal", "Novak Djokovic",
                "Stanislas Wawrinka", "David Ferrer",
                "Roger Federer", "Andy Murray",
                "Tomas Berdych", "Juan Martin Del Potro",
                "Richard Gasquet", "John Isner"};

        // 1.1 使用匿名内部类根据 name 排序 players
        Arrays.sort(players, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return (s1.compareTo(s2));
            }
        });
    }
}
