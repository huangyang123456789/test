package com.neusoft.enums.teach;

/**
 * @Author: wwb
 */
public class Test {
    public static void main(String[] args) {
        System.out.println(AppResponseStatus.SERVER_EXCEPTION.code);
        for (AppResponseStatus responseStatus : AppResponseStatus.values()) {
            System.out.println(responseStatus);
        }
        System.out.println("--------------");
        System.out.println(AppResponseStatus.valueOf("SERVER_EXCEPTION"));
        System.out.println(AppResponseStatus.SERVER_EXCEPTION.compareTo(AppResponseStatus.NOT_FOUND));
        System.out.println(AppResponseStatus.SUCCESS.ordinal());

//        gitgitGGGGGGGGIIIIIITTTTTT
        //45345234

    }
}
