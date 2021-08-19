package com.wdd.foundation;

public class Operation {
    public static void main(String[] args) {
        //二元运算符
        //Ctrl + D 复制当前行到下一行
        int a = 10;
        int b = 10;
        int c = 10;
        int d = 10;
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/(double)b);
        System.out.println("---------------------------------");
        //关系运算符的返回结果：正确 错误 布尔值

        System.out.println(a>b);
        System.out.println(a<b);
        System.out.println(a==b);
        System.out.println(a!=b);

        System.out.println("---------------------------------");
        //模运算
        System.out.println(a%b);

        System.out.println("---------------------------------");
        //++ --自增自减 一元运算符
        int a1=2;
        int b1 = a++;
        int c1 = ++a;
        System.out.println(a1);
        System.out.println(a1);
        System.out.println(b1);
        System.out.println(c1);
        System.out.println(c1);

        System.out.println("---------------------------------");

        //幂运算 2^3  很多运算 会采用工具类来操作
        double pow = Math.pow(2,3);
        System.out.println(pow);

        System.out.println("---------------------------------");
        //逻辑运算符 与  或  非
        boolean a2 = true;
        boolean b2 = false;
        System.out.println("a2 && b2 :"+(a2&&b2));//逻辑与 两个都为真结果为true
        System.out.println("a2 || b2 :"+(a2||b2));//逻辑或 两个变量一个为真 结果为true
        System.out.println("!(a2 && b2 :)"+!(a2&&b2));//如果是真，则变为假，如果是假 则变为真

        //短路运算
        int c2=5;
        boolean d2 = (c2<4)&&(c++<4);
        System.out.println(d2);
        System.out.println(c2);


        System.out.println("---------------------------------");
        //位运算
        /*
        A=0011 1100
        B=0000 1101
        A&B = 0000 1100
        A|B = 0011 1101
        A^B = 0011 0001
        ~B  = 1111 0010
        2*8 = 16 2*2*2*2
        <<  *2
        >>  /2
        0000 0000    0
        0000 0001    1
        0000 0010    2
        0000 0011    3
        0000 0100    4
        0000 1000    8
        0001 0000    16

         */
        System.out.println(2<<3);//16

        System.out.println("---------------------------------");
        //
        int a4 = 10;
        int b4 = 10;
        a+=b;
        a-=b;
        System.out.println(a);
        System.out.println("---------------------------------");

        //字符串连接符 + , String
        System.out.println(""+a+b);
        System.out.println(a+b+"");

        System.out.println("---------------------------------");
        //三元运算符 x？y ：z
        //如果x==true 则结果为y，否则为z
        int score = 80;
        String type = score<60?"不及格":"及格";
        System.out.println(type);







    }
}
