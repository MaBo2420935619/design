package com.mabo.principle.dependencyInversion;

/**
 * @Author mabo
 * @Description     依赖倒转
 * @Description     setter方法传入接口
 */
public class DependencyInversion3 {
    private interface Animal{
        public void run();
    }

    private static class Action{
        private Animal animal;

        public void setAnimal(Animal animal) {
            this.animal = animal;
        }
        //通过构造方法传入接口
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
        Action dogAction=new Action();
        dogAction.setAnimal(new Dog());
        dogAction.go();
        Action catAction=new Action();
        catAction.setAnimal(new Cat());
        catAction.go();
    }
}
