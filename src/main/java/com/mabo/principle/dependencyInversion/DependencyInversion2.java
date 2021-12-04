package com.mabo.principle.dependencyInversion;

/**
 * @Author mabo
 * @Description     依赖倒转
 * @Description     类参数为接口
 */
public class DependencyInversion2 {
    private interface Animal{
        public void run();
    }

    private static class Action{
        private Animal animal;
        /**
         * @Author mabo
         * @Description   通过构造方法传入接口
         */
        public Action(Animal animal) {
            this.animal=animal;
        }
        public void go() {
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
     Action dogAction=new Action(new Dog());
     dogAction.go();
     Action catAction=new Action(new Cat());
     catAction.go();
    }

}
