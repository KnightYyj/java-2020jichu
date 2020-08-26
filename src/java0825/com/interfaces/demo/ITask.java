package java0825.com.interfaces.demo;

/**
 * 快捷键 ctrl + D 向下复制
 * 1、定义在接口中的方法都是公共的抽象的方法
 * 2、接口对其实现了该接口类必须行为约束
 */
public interface ITask {
    public  abstract  void task1();
    public  abstract  void task2();
    void task3();



    //jdk8及8之后 接口中是允许有具体实现的方法
    default void hello(){
        System.out.println("ITask中具体方法");
    }
}
