package com.wsl.lambda;

import java.util.function.Consumer;

public class ConsumerSample {
    public static void output(Consumer<String> consumer){
        String text = "you are handsome!";
        consumer.accept(text);
    }

    public static void main(String[] args) {
        output(s -> System.out.println(s));
    }
}
