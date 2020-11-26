package com.wk.java.day1123;

/**
 * @ClassName Excemple3_6
 * @Description TODO
 * @Author wangkai
 * @Date 2020/11/23
 **/
public class Excemple3_6 {
public static void main(String[] args){
    double sum = 0 , item = 1 ;
    int i = 1 , n = 20 ;
    while (i <= n){
        sum = sum + item;
        i = i + 1;
        item = item * (1.0/i);

    }
    System.out.println("sum = " + sum );

}
}
