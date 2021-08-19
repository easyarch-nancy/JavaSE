package com.wdd.foundation;

public class Variable {
    //类变量 从属于类，会随着类一起消失
    static double salary = 3300;

    //常量  static 和final是修饰符，不存在先后顺序
    static  final double PI= 3.14;


    //实例变量：从属于对象,如果不自行初始化，这个类型的默认值 0  0.0
    //布尔值，默认false
    //除了基本类型 其余的默认值都是null
    String name;
    int age;

    //main方法
    public static void main(String[] args) {
        //局部变量：必须声明和初始化值,只在main方法中有效
        int i = 10;
        System.out.println(i);
        //变量类型 变量名字 = new Variable();
        Variable variable = new Variable();
        System.out.println(variable.age);//0
        System.out.println(variable.name);//null

        //类变量
        System.out.println(salary);

        //常量
        System.out.println(PI);
    }

    public void add() {

    }
}
