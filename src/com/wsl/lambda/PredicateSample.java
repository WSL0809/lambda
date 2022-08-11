package com.wsl.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateSample {
    public static void main(String[] args) {
        Predicate<Integer> predicate = n -> n > 4;
        System.out.println(predicate.test(3));
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
//        filter(list, n -> n%2 == 0);
        filter(list, n -> n%2 == 1 && n > 5);
    }

    public static void filter(List<Integer> list, Predicate<Integer> predicate) {
        for (Integer num : list) {
            if (predicate.test(num)){
                System.out.println(num + " ");
            }
        }
    }
}
