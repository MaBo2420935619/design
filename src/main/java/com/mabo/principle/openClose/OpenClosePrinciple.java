package com.mabo.principle.openClose;

/**
 * @Author mabo
 * @Description   开闭原则
 */
public class OpenClosePrinciple {
    static abstract class Sharp{
        public abstract void paint();
    }
     static class DrawingEditor{
        public void draw(Sharp sharp){
            sharp.paint();
        }
    }

    static class Rectangle extends Sharp{

        @Override
        public void paint() {
            System.out.println("画一个矩形");
        }
    }
     static class Circle extends Sharp{

        @Override
        public void paint() {
            System.out.println("画一个圆形");
        }
    }

    public static void main(String[] args) {
        DrawingEditor drawingEditor=new DrawingEditor();
        drawingEditor.draw(new Circle());
        drawingEditor.draw(new Rectangle());
    }

}
