package com.mabo.principle.dependencyInversion;

/**
 * @Author mabo
 * @Description 依赖倒转
 * @Description 方法接口作为参数
 */
public class DependencyInversion1 {
    private interface Animal {
        public void run();
    }

    private static class Action {
        public void go(Animal animal) {
            animal.run();
        }
    }

    private static class Dog implements Animal {
        @Override
        public void run() {
            System.out.println("小狗在跑");
        }
    }

    private static class Cat implements Animal {
        @Override
        public void run() {
            System.out.println("猫在跑");
        }
    }


    public static void main(String[] args) {
        Action action = new Action();
        action.go(new Dog());
        action.go(new Cat());
    }
}
