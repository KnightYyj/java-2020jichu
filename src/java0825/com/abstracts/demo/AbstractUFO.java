package java0825.com.abstracts.demo;

/**
 * 1、抽象类继承抽象类可以不用实现抽象的方法
 */
public abstract class AbstractUFO extends UFO {
    public  void ufoFly(){
        driven();
        fly();
    }

    @Override  // 注解 :代表该方法被重写
    public  void fly(){
        System.out.println("AbstractUFO环形飞行");
    }
}
