package com.mabo.principle.demeter;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author mabo
 * @Description   迪米特法则
 * @Description   直接朋友 要求依赖的类是成员变量，方法参数，方法返回值
 * @Description   最好将自己依赖的类作为成员变量，叫做类之间是朋友关系
 * @Description   对自己依赖的类，最好直接调用类的方法，而不是将类作为局部变量
 */
public class DemeterBadExample {
    private static class Student{
        private List list=new ArrayList();
        public List getList() {
            return list;
        }
        public void setList(List list) {
            this.list = list;
        }
        public void addList(){
            list.add(1);
        }
    }

    public static void main(String[] args) {
        Student student=new Student();
        student.addList();
        List list = student.getList();
        int size = list.size();
        System.out.println(size);
    }
}
