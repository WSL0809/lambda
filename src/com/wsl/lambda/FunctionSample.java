package com.wsl.lambda;

import java.util.Random;
import java.util.function.Function;

//生成定长随机字符串
public class FunctionSample {
    public static void randomStringFunction(int t) {
        Function<Integer,String> randomString = l -> {
          String chars = "qwertyuioplkjhgfdsazxcvbnm!?1234567890_";
          StringBuffer sb = new StringBuffer();
            Random random = new Random();
            for (int i = 0; i < l; i++) {
                int pos = random.nextInt(chars.length());
                sb.append(chars.charAt(pos)) ;
            }
            return sb.toString();
        };
        String randomStr = randomString.apply(t);
        System.out.println(randomStr);
    }

    public static void main(String[] args) {
        randomStringFunction(16);
    }

}
