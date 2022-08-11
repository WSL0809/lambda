package com.wsl.lambda;

public class LambdaSample {
    public static void main(String[] args) {
        //1.标准使用方式
        Mathop addition = (Integer a, Integer b) ->{
            System.out.println("add op");
            return a + b + 0f;
        };
        System.out.println(addition.operate(5,4));
    }
}
