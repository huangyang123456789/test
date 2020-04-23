package com.neusoft.array.teach;

import java.util.Arrays;

/**
 * @Author: wwb
 * @Date: 2020/4/16 10:50
 */
public class ArrayTest {
    public static void main(String[] args) {
        //声明数组
        int[] intArr;
        int arr[];

        //创建数组
        intArr = new int[3];
//        System.out.println(Arrays.toString(intArr));
        //赋值
        intArr[0] = 123;
        intArr[1] = 12;
        intArr[2] = 1;

        //创建加赋值
        intArr = new int[]{123,12,1};

        //声明加创建
        int[] intArr1 = new int[3];
//        System.out.println(intArr.length);
        //声明创建赋值
        int[] intArr2 = {123,12,1};
        list(intArr2);
        int[] intAtrr3 = reverse(intArr2);
        System.out.println(Arrays.toString(intAtrr3));
        //声明创建赋值
        int[] intArr3 = new int[]{1,2,3};
//      21323

//        int[] intArr2;
//        intArr2 = {123,12,1};//这种方式编译不通过

        int a[][] = new int[2][3]; //二维数组 a 可以看成一个两行三列的数组。
        int[][] m = new int[][]{{1,2,3},{2,3,4}};

        String s[][] = new String[2][];
        s[0] = new String[2];
        s[1] = new String[3];
        s[0][0] = new String("Good");
        s[0][1] = new String("Luck");
        s[1][0] = new String("to");
        s[1][1] = new String("you");
        s[1][2] = new String("!");

        int[] temp = new int[]{1,2,3,4,5,4,6,1};
        int[] newArr1 = Arrays.copyOf(temp,temp.length + 4);
        System.out.println(Arrays.toString(newArr1));

        System.out.println(Arrays.toString(Arrays.copyOfRange(temp, 1, 5)));
        //并行排序
        Arrays.parallelSort(temp);
        System.out.println(Arrays.toString(temp));
    }

    public static void list(int[] array) {
        for(int element: array){
            System.out.println(element);
        }
    }

    //返回逆向数组
    public static int[] reverse(int[] list) {
        int[] result = new int[list.length];
        for (int i = 0, j = result.length - 1; i < list.length; i++, j--) {
            result[j] = list[i];
        }
        return result;
    }
}
