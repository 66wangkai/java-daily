package com.wk.java.day9;

/**
 * @ClassName test2
 * @Description TODO
 * @Author wangkai
 * @Date 2020/10/28
 **/
public class test2 {
    public static void main(String[] args){
        int[] arr = {10,20,30,40,50,60,66,70,80,99};
        printNum(arr);



    }

    public static void printNum(int[] arr) {
        System.out.println("您的大乐透号码为：");
        for (int i = 0; i < arr.length; i ++){
        System.out.println(arr[i]+"");
        }

    }
}
