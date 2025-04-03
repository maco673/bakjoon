package com.example.bak_out;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());
        String b = br.readLine();

        String[] x = b.split("");

        for(int i = x.length; i  > 0; i--){
            int y = Integer.parseInt(x[i-1]);
            System.out.println(a * y);
        }

        System.out.println(a * Integer.parseInt(b));
    }

}
