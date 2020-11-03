package com.wk.java.day14;

/**
 * @ClassName OuterClass
 * @Description TODO
 * @Author wangkai
 * @Date 2020/11/3
 **/
class OuterClass {
    public OuterClass() {
        System.out.println("OuterClassInit.");

    }
    protected static class InnerClass {
        public void sayHi(){
            System.out.println("Hi,InnerClass.");

        }

    }

}

class InnerClassTest {
    public static void main(String[] args){
        OuterClass.InnerClass
                innerClass = new OuterClass.InnerClass();
        innerClass.sayHi();


    }

}