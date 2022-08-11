package com.wsl.lambda;

public class LambdaSample {
    public static void main(String[] args) {
        //1.标准使用方式
        Mathop addition = (Integer a, Integer b) ->{
            System.out.println("add op");
            return a + b + 0f;
        };
        System.out.println(addition.operate(5,4));

        //2.忽略参数类型
        Mathop substraction = (a, b) ->{
            System.out.println("substraction op");
            return a - b + 0f;
        };
        System.out.println(substraction.operate(5,4));
    }
}
