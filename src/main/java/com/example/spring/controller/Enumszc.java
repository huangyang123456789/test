package com.example.spring.controller;

/**
 * @Author: szc
 * @Date: 2020/5/4 14:29
 */
public class Enumszc {
    public static void main(String[] args) {
        Result divide = divide(10, 2);
        System.out.println(divide);

    }
    public static Result divide(int a,int b)
    {
        try {
            int c=a/b;
            return Result.SUCCESS;

        }catch (Exception e)
        {
            return Result.FAIL;
        }


    }

}

enum Result {
    SUCCESS,FAIL
}