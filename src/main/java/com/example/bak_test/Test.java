package com.example.bak_test;

import java.io.IOException;

public class Test {
    public static void main(String[] args) throws IOException{
        int a = 472;
        String b = "385";

        String[] x = b.split("");
        for(int i = x.length; i  > 0; i--){
            int y = Integer.parseInt(x[i-1]);
            System.out.println(a * y);
        }

        System.out.println(a * Integer.parseInt(b));
    }
}
