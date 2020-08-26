package java0825.com.abstracts.demo;

/**
 * Java中的类是单根继承方式 ，一个类只能被一个类继承
 * 1、必须实现抽象类中的方法
 */
public class ChinaUFO  extends  AbstractUFO {

    @Override  // 注解 :代表该方法被重写
    public  void fly(){
        super.fly();
        System.out.println("环形飞行");
    }

    @Override
    public void driven() {
        System.out.println("开车");
    }
}
