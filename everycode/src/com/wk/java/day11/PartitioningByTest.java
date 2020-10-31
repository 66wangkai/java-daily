package com.wk.java.day11;

/**
 * @ClassName PartitioningByTest
 * @Description TODO
 * @Author wangkai
 * @Date 2020/10/31
 **/
public class PartitioningByTest {
    public static void main(String[] args) {
        //省略List<student> students的初始化
        Map<Boolean, List<Student>> listMap = students.stream().collect(
                Collectors.partitioningBy(student -> student.getSpecialities().
                        contains(SpecialityEnum.SING)));
    }
}
