package com.pcy.service;

import com.pcy.bean.Course;
import com.pcy.util.GPACalculator;
import org.springframework.boot.autoconfigure.groovy.template.GroovyTemplateAvailabilityProvider;

import java.util.ArrayList;
import java.util.List;

public class GPAService {


    List<Course> addData(){

        List<Course> courses = new ArrayList<>();

        //大一上
        courses.add(new Course("思修",91,3.0));
        courses.add(new Course("行政",97,0.25));
        courses.add(new Course("高数",96,6.0));
        courses.add(new Course("英语2",89,3.0));
        courses.add(new Course("体育1",90,0.75));
        courses.add(new Course("大学生心理健康",90,1.5));
        courses.add(new Course("军训",82,2.0));

        //大一下
        courses.add(new Course("大物",93,5.0));
        courses.add(new Course("马原",77,3.0));
        courses.add(new Course("行政",97,0.25));
        courses.add(new Course("高数",94,6.0));
        courses.add(new Course("英语3",86,3.0));
        courses.add(new Course("军理",87,1.5));
        courses.add(new Course("军训",82,2.0));

        //大二上
        courses.add(new Course("近代史",83,2.5));
        courses.add(new Course("毛概",83,3.0));
        courses.add(new Course("行政",92,0.25));
        courses.add(new Course("线代",88,2.5));
        courses.add(new Course("概率论",93,3.0));
        courses.add(new Course("英语4",82,2.5));
        courses.add(new Course("离散",89,2.5));
        courses.add(new Course("程序设计",79,1.0));
        courses.add(new Course("软工导论",82,2.0));
        courses.add(new Course("软工实训",93,1.0));
        courses.add(new Course("数媒",85,2.0));
        courses.add(new Course("C++",80,5.0));
        courses.add(new Course("电路",88,3.0));
        courses.add(new Course("数字逻辑",90,2.5));
        courses.add(new Course("体育3",82,0.75));
        courses.add(new Course("电路",88,3.0));

        //大二下
        courses.add(new Course("毛概",95,2.5));
        courses.add(new Course("行政",93,0.25));
        courses.add(new Course("Java",89,3.0));
        courses.add(new Course("Linux",92,2.0));
        courses.add(new Course("离散",87,2.0));
        courses.add(new Course("数据结构",91,5.0));
        courses.add(new Course("用户界面",84,2.5));
        courses.add(new Course("汇编",90,3.0));
        courses.add(new Course("计组",78,4.5));
        courses.add(new Course("操作系统",84,3.5));
        courses.add(new Course("数据库",80,3.5));
        courses.add(new Course("计算机拆装",90,1.0));
        courses.add(new Course("操作系统",84,3.5));
        courses.add(new Course("数据库",80,3.5));
        courses.add(new Course("体育4",84,0.75));

        //大三上
        courses.add(new Course("工程经济学",92,2.0));
        courses.add(new Course("需求分析",89,2.0));
        courses.add(new Course("UML",88,2.0));
        courses.add(new Course("体系结构",87,2.5));
        courses.add(new Course("网络",90,3.5));
        courses.add(new Course("软件构造",85,2.5));
        courses.add(new Course("用户界面",84,2.5));
        courses.add(new Course("行政",100,0.25));


        return courses;
    }

    public static void main(String[] args) {
        GPAService gpaService = new GPAService();
        List<Course> courses = gpaService.addData();
        double result = GPACalculator.calculate(courses);
        System.out.println(result);
    }
}
