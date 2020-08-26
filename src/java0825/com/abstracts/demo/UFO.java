package java0825.com.abstracts.demo;

/**
 * 定义一个抽象类
 * private只能被本类直接访问
 * 如果private修饰需要提供外部进行访问就需要提供对应的setter和getter方法组
 * 快捷键：
 *  alt + insert
 */
public  abstract class UFO {
    private String sharp;
    private  String color;

    public String getSharp() {
        return sharp;
    }

    public void setSharp(String sharp) {
        this.sharp = sharp;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public  void setcolor(String color){
        System.out.println("我是抽象类中具体方法");
    }


    //定义2个抽象方法
    public  abstract void fly();
    public  abstract void driven();
}
