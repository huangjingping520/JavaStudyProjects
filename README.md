## Java 的主要版本
    SE：
        开发桌面应用程序
    EE：
        Java平台企业版
        用于编写B（Browser）/S（Server）架构
    ME：
        Java平台微型版
        随着Android系统的普及已经走向淘汰

1995年，原属于sun公司，后被Oracle（甲骨文）公司收购
## 特点
1. 跨平台（write once run anythere）</br>
    Java的跨平台是通过Java虚拟机（JVM/Java Virtual Machine）来实现的
![](https://cdn.jsdelivr.net/gh/huangjingping520/PicGo/JVM.drawio.png)

## JDK、JRE、JVM
    JDk：开发工具包
    JRE：运行环境
    JVM：Java虚拟机

    JDK包含JRE，JRE包含JVM

## JDK语言运行机制
    javac -- Java语言编译器
    java -- Java语言解释器
![](https://cdn.jsdelivr.net/gh/huangjingping520/PicGo/运行机制.drawio.png)

## 数据类型
    1. 基本数据类型
        整型：byte(8位、1个字节)、short(16位)、int(32位)、long(64位)
        浮点型：
            float(32位)需要用F/f进行标明，即
                float number = 1.5f
            double(64位)不需要
                double number = 5.25
        字符型：char(采用Unicode编码方式、占两个字节)
        布尔型：boolean
    2. 引用数据类型
        数组、类、接口、枚举（特殊的类）、标注（特殊的接口）

## 类型转换
    1. 基本类型间转换
        自动类型转换（隐式）
        - 由低级向搞级的类型转换
        强制类型转换（显示）
        - 由高级别类型强制向低级别类型的转换
![](https://cdn.jsdelivr.net/gh/huangjingping520/PicGo/类型转换.drawio.png)

    2. 引用类型间转换
        向上转型
        向下转型
    3. 基本类型和引用类型间转换
        自动装箱
        自动拆箱