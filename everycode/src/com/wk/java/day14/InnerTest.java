package com.wk.java.day14;

/**
 * @ClassName InnerTest
 * @Description TODO
 * @Author wangkai
 * @Date 2020/11/3
 **/
 class InnerTest {
    public static void main(String[] args){
        Outer out = new Outer ();
        //创建成员内部类
        Outer.Inner inner =
                out.new Inner();
        inner.sayHi();
    }
}
class Outer{
     public Outer(){
         System.out.println("OuterClass.");
     }
     class Inner {
         public void sayHi() {
             System.out.println("Hi,Inner.");

         }


     }


}
