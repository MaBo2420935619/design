package com.mabo.principle.richterSubstitution;
/**
 * @Author mabo
 * @Description   里氏置换原则
 */
public class RichterSubstitutionPrinciple {
    public static void main(String[] args) {
        Bird bird1 = new Swallow();
        Bird bird2 = new Sparrow();
        bird1.setSpeed(120);
        bird2.setSpeed(120);
        System.out.println("如果飞行300公里：");
        try {
            System.out.println("燕子将飞行" + bird1.getFlyTime(300) + "小时.");
            System.out.println("几维鸟将飞行" + bird2.getFlyTime(300) + "小时。");
        } catch (Exception err) {
            System.out.println("发生错误了!");
        }
    }
    //鸟类
    public static class Bird {
        double flySpeed;
        public void setSpeed(double speed) {
            flySpeed = speed;
        }
        public double getFlyTime(double distance) {
            return (distance / flySpeed);
        }
    }
    //燕子类
    public static class Swallow extends Bird {
    }
    //麻雀
    public static class Sparrow extends Bird {
        //不应该重写父类方法
//        public void setSpeed(double speed) {
//            flySpeed = 0;
//        }
       public  void getFar(double distance){
           System.out.println(distance);
       }
    }
}
