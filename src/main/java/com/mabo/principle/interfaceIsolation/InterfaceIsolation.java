package com.mabo.principle.interfaceIsolation;
/**
 * @Author mabo
 * @Description   接口隔离原则
 */
public class InterfaceIsolation {
    //吃
    interface Eat{
        public void eat();
    }
    //走路
    interface Walk{
        public void walk();
    }
    //游动
    interface Swim {
        public void swim();
    }

    //马在吃和走路
    class Horse implements Eat , Walk{

        @Override
        public void eat() {
            System.out.println("马在吃");
        }

        @Override
        public void walk() {
            System.out.println("马在走");
        }
    }
    //鱼在吃和游
    class Fish implements Eat ,Swim{
        @Override
        public void eat() {
            System.out.println("鱼在吃");
        }

        @Override
        public void swim() {
            System.out.println("鱼在游");
        }
    }
}
