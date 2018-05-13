package com.fengzhu;

public interface In {
    void func();
    In in1 = (

    )->{};//这基本上最简单的Lambda表达式的写法了，实现的方法将什么都不会做
    In in2 = ()->System.out.println("Func");//这里实现的方法将会输出一个字符串
    In in3 = ()->{
        System.out.println("Func1");
        System.out.println("Func2");
    };//使用{}来使用多个语句
}
