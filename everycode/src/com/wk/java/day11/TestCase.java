package com.wk.java.day11;

/**
 * @ClassName TestCase
 * @Description TODO
 * @Author wangkai
 * @Date 2020/10/31
 **/
public class TestCase {
    public static void main(String[] args) {
        List<Student> studentList = Stream.of(new Student("路飞", 22, 175),
                new Student("红发", 40, 180),
                new Student("白胡子", 50, 185)).collect(Collectors.toList());
        System.out.println(studentList);
    }
}
