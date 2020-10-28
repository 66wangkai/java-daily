package com.wk.java.day9;

/**
 * @ClassName test1
 * @Description TODO
 * @Author wangkai
 * @Date 2020/10/28
 **/
public class test1 {
    public static void main (String[] args){
        String a = new String ("ab");
        //a为一个引用
        String b = new String("ab");
        //B为另一个引用，对象的内容一样
        String aa = "ab";
        String bb = "ab";
        if (aa == bb)
            // true
            System.out.println("aa==bb");
        if (a == b)
            //false,非同一对象
            System.out.println("a==b");
        if (a.equals(b))
            //true
            System.out.println("aEQb");
        if ( 42 == 42.0 ) {
            //true
            System.out.println("true");
        }


    }
}
