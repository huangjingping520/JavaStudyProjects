<!-- TOC -->

- [Java 的主要版本](#java-的主要版本)
- [特点](#特点)
- [JDK、JRE、JVM](#jdkjrejvm)
- [JDK语言运行机制](#jdk语言运行机制)
- [基础](#基础)
    - [注释](#注释)
    - [标识符](#标识符)
    - [数据类型](#数据类型)
    - [类型转换](#类型转换)
    - [变量](#变量)
        - [变量作用域](#变量作用域)
    - [常量(Constant)](#常量constant)
    - [基本运算符](#基本运算符)
    - [包机制](#包机制)
- [Scanner类的使用](#scanner类的使用)
- [方法](#方法)
    - [Java方法是语句的结合，它们一起执行一个功能](#java方法是语句的结合它们一起执行一个功能)
    - [设计原则](#设计原则)
    - [方法的重载](#方法的重载)
        - [定义](#定义)
        - [规则](#规则)
- [数组](#数组)
    - [定义](#定义-1)
    - [基本特点](#基本特点)
    - [使用](#使用)
    - [多维数组](#多维数组)
    - [Arrays类](#arrays类)
        - [功能](#功能)

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

### 注释
<font color=red>书写注释是一个良好的习惯</font>

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

#### 变量作用域

类变量

实例变量

局部变量

[示例](变量作用域.java)

### 常量(Constant)

初始化后不能在改变的值，不会变动的值

```java
final 常量名 = 值;
final double PI = 3.14;
```

常量名一般使用大写字符

### 基本运算符

<img src="https://cdn.jsdelivr.net/gh/huangjingping520/PicGo/Java%E8%BF%90%E7%AE%97%E7%AC%A6.PNG" style="zoom:80%;" />

[示例](operator.java)

[自增自减](operator1.java)

[逻辑运算](LogicOperation.java)

[位运算](BitOperation.java)

### 包机制

包的本质就是文件夹

## Scanner类的使用

[示例](Scanner/InputInfo.java)

使用步骤：
    导入包
        `import java.util.scanner;`
    创建Scanner对象
        `Scanner input = new Scanner(Syetem.in);`
    调用Scanner对象的方法，实现读取

`next()`与`nextLine()`的区别
    `next()`
        不包含有效字符前的空格
        在键入有效字符之后，将其后输入的空格键，Tab键或者Enter键等是为间隔符或者结束符

​		**`next()`不能得到带有空格的字符串**

​    `nextLine()`
​        包含有效字符前的空格
​        结束符只是Enter键

[求和案例](Scanner/Sum.java)

[九九乘法表](CycleFor2.java)

## 方法

### Java方法是语句的结合，它们一起执行一个功能

1. 方法是解决一类问题的步骤的有序结合
2. 方法包含在类或者对象中
3. 方法在程序中被创建，在其它地方被引用

### 设计原则

方法的本意是功能块，就是实现某个功能的语句块的集合。设计方法的时候，最好保证方法的**原子性**，即一个方法只完成一个功能。

### 方法的重载

#### 定义

重载就是在一个类中，有相同的函数名称，但是形参不同的函数。

#### 规则

1. 方法的名称必须相同
2. 参数列表必须不同（个数、类型、参数排列顺序不同）

3. 方法的返回类型可以相同也可以不相同
4. 仅返回值不同不足以称为方法的重载

## 数组

### 定义

1. 数组是相同类型数据的有序集合
2. 数组描述的是相同类型的若干个数据，按照一定的先后次序排列组合而成
3. 其中，每一个数据称作一个数组元素，每个数组元素可以通过一个下标来访问它们

### 基本特点

1. 长度是确定的

2. 元素必须是相同类型，不允许出现混合类型

3. 元素可以是任何数据类型，包括基本类型和引用类型

4. 数组变量属引用类型，数组也可以看成是对象，数组中的每个元素相当于该对象的成员变量。

   数组本身就是对象，Java中对象是在堆中的，因此数组无论保存原始类型还是其他对象类型，<font color=red>数组对象本身是在堆中的</font>

### 使用

[基本用法](ArrayDemo3.java)

1. For循环
2. For-Each循环
3. 数组作方法入参
4. 数组作返回值

[使用方法](ArrayDemo4.java)

### 多维数组

[二维数组的遍历](ArrayDemo5.java)

### Arrays类

1. 数组的工具类`java.util.Arrays`

2. 由于数组对象本身并没有什么方法供我们调用，但API中提供了一个工具类Arrays供我们使用，从而可以对数据对象进行一些基本操作

3. Arrasy类中的方法都是static修饰的静态方法，在使用的时候可以直接使用类名惊醒调用，而不用使用对象来调用

#### 功能
[示例](ArrayDemo6.java)
1. 给数组赋值：通过`fill`方法
2. 对数组排序：通过`sort`方法，按升序
3. 比较数组：通过`equals`方法比较数组中元素值是否相等
4. 查找数组元素：通过`binarySearch`方法能对排序号的数组进行二分查找法操作

[冒泡排序](ArrayDemo7.java)

[稀疏数组](ArrayDemo8.java)

## 面向对象

<font color=red>Java的核心思想就是OOP</font>