<!-- TOC -->

- [Java 的主要版本](#java-的主要版本)
- [特点](#特点)
- [JDK、JRE、JVM](#jdkjrejvm)
- [JDK语言运行机制](#jdk语言运行机制)
- [数据类型](#数据类型)
- [类型转换](#类型转换)
- [Scanner类的使用](#scanner类的使用)

<!-- /TOC -->

## Java 的主要版本
    SE：标准版
        开发桌面应用程序
    EE：
        Java平台企业版
        用于编写B（Browser）/S（Server）架构
    ME：
        Java平台微型版
        随着Android系统的普及已经走向淘汰

1995年，原属于sun公司，后被Oracle（甲骨文）公司收购
## 特点
1. 跨平台（write once run anythere）
    Java的跨平台是通过Java虚拟机（JVM/Java Virtual Machine）来实现的
![](https://cdn.jsdelivr.net/gh/huangjingping520/PicGo/JVM.drawio.png)

## JDK、JRE、JVM
    JDk：Java Development Kit 开发工具包
    JRE：Java Runtime Environment 运行环境
    JVM：Jave Virtual Machine Java虚拟机
    
    JDK包含JRE，JRE包含JVM

## JDK语言运行机制
    javac -- Java语言编译器
    java -- Java语言解释器
![](https://cdn.jsdelivr.net/gh/huangjingping520/PicGo/运行机制.drawio.png)

![](https://cdn.jsdelivr.net/gh/huangjingping520/PicGo/1.jpg)

## 基础

### 注释：<font color=red>书写注释是一个良好的习惯</font>

1. 单行注释

   使用`//`进行注释

   ```java
   public class hello {
       public static void main(String[] args) {
           //输出HelloWorld
           System.out.println("Hello World");
       }
   }
   ```

   

2. 多行注释

   使用`/* 注释内容*/`进行注释

   ```java
   public class hello {
       public static void main(String[] args) {
           /*
           print 
           HelloWorld
           */
           System.out.println("Hello World");
       }
   }
   ```

   

3. 文档注释

   ```java
   public class hello {
       public static void main(String[] args) {
           /**
           * JavaDoc 
           * @Description HelloWorld
           * @Author MerlinAlex
           */
           System.out.println("Hello World")；
       }
   }
   ```

### 标识符

​	Java所有的组成部分都需要名字。类名、变量名以及方法名都被称为标识符

​	注意点：

		1.  所有标识符都应该以字母、美元符`$`、或者下划线`_`开始
		2.  首字符之后可以是字母、美元符`$`、下划线`_`或者数字的任何字符组合
		3.  **<font color=red>不能用关键字作为变量名或方法名</font>**
		4.  标识符是<font color=red>**大小写敏感的**</font>
		5.  

- 关键字

  ![](https://cdn.jsdelivr.net/gh/huangjingping520/PicGo/%E5%85%B3%E9%94%AE%E5%AD%97.PNG)

  

### 数据类型

**强类型语言**

​	要求变量的使用严格符合规定，所有变量都必须先定义后才能使用

1. 基本数据类型(primitive type)
    整型：

    ​	byte(8位、1个字节)

    ​	short(16位)

    ​	int(32位)

    ​	long(64位)
    
    >进制： 二进制0b 八进制0 十六进制0x
    
    浮点型：
    ​    float(32位)需要用F/f进行标明，即float number = 1.5f
    ​    double(64位)不需要
​        double number = 5.25
    字符型：char(采用Unicode编码方式、占两个字节)
    布尔型：boolean
    
2. 引用数据类型(reference type)
    数组、类、接口、枚举（特殊的类）、标注（特殊的接口）

### 类型转换

1. 基本类型间转换
    自动类型转换（隐式）

    - 由低级向搞级的类型转换

    强制类型转换（显示）

    - 由高级别类型强制向低级别类型的转换
    - （类型）变量名

![](https://cdn.jsdelivr.net/gh/huangjingping520/PicGo/类型转换.drawio.png)

2. 引用类型间转换
    向上转型
    向下转型
3. 基本类型和引用类型间转换
    自动装箱
    自动拆箱
4. <font color=red>**注意点**</font>
    1. 不能对布尔值转换
    2. 不能把对象类型转换为不相干的类型
    3. 把高容量转换到低容量的时候，强制转换
    4. 转换的时候可能存在内存溢出或者精度问题

### 变量

Java变量是程序中最基本的存储单元，其要素包括变量名、变量类型和作用域

>注意：
>
>​	每个变量都必须有类型，类型可以是基本类型也可以是引用类型
>
>​	变量名必须是合法的标识符
>
>​	变量声明是一条完整的语句，因此每一个声明都必须以分号结束

## Hello World

```java
public class hello {

    public static void main(String[] args) {
        System.out.println("Hello World");
    }
}
```



## Scanner类的使用

使用步骤：
    导入包
        import java.util.scanner;
    创建Scanner对象
        Scanner input = new Scanner(Syetem.in);
    调用Scanner对象的方法，实现读取

next()与nextLine()的区别
    next()
        不包含有效字符前的空格
        在键入有效字符之后，将其后输入的空格键，Tab键或者Enter键等是为间隔符或者结束符
    nextLine()
        包含有效字符前的空格
        结束符只是Enter键