# 第1周作业


参见 我的教室 -> 本周作业

## 作业内容


> Week01 作业题目：

1.（选做）自己写一个简单的 Hello.java，里面需要涉及基本类型，四则运行，if 和 for，然后自己分析一下对应的字节码，有问题群里讨论。

Last modified 2021-4-29; size 702 bytes
  MD5 checksum b78b63e446e55f49a98e8e4e3e519d6c
  Compiled from "Hello.java"
public class Hello
  minor version: 0
  major version: 52
  flags: ACC_PUBLIC, ACC_SUPER
Constant pool:
   #1 = Methodref          #8.#25         // java/lang/Object."<init>":()V
   #2 = Class              #26            // Hello
   #3 = Methodref          #2.#25         // Hello."<init>":()V
   #4 = Methodref          #2.#27         // Hello.add:(II)I
   #5 = Methodref          #2.#28         // Hello.sub:(II)I
   #6 = Methodref          #2.#29         // Hello.mul:(II)I
   #7 = Methodref          #2.#30         // Hello.div:(II)I
   #8 = Class              #31            // java/lang/Object
   #9 = Utf8               <init>
  #10 = Utf8               ()V
  #11 = Utf8               Code
  #12 = Utf8               LineNumberTable
  #13 = Utf8               main
  #14 = Utf8               ([Ljava/lang/String;)V
  #15 = Utf8               StackMapTable
  #16 = Class              #32            // "[Ljava/lang/String;"
  #17 = Class              #26            // Hello
  #18 = Utf8               add
  #19 = Utf8               (II)I
  #20 = Utf8               sub
  #21 = Utf8               mul
  #22 = Utf8               div
  #23 = Utf8               SourceFile
  #24 = Utf8               Hello.java
  #25 = NameAndType        #9:#10         // "<init>":()V
  #26 = Utf8               Hello
  #27 = NameAndType        #18:#19        // add:(II)I
  #28 = NameAndType        #20:#19        // sub:(II)I
  #29 = NameAndType        #21:#19        // mul:(II)I
  #30 = NameAndType        #22:#19        // div:(II)I
  #31 = Utf8               java/lang/Object
  #32 = Utf8               [Ljava/lang/String;
{
  public Hello();
    descriptor: ()V
    flags: ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: return
      LineNumberTable:
        line 1: 0

  public static void main(java.lang.String[]);
    descriptor: ([Ljava/lang/String;)V
    flags: ACC_PUBLIC, ACC_STATIC
    Code:
      stack=3, locals=8, args_size=1            栈的深度为3，变量为8，方法参数为1
         0: new           #2                  // class Hello 新建hello对象
         3: dup
         4: invokespecial #3                  // Method "<init>":()V 调用初始化方法
         7: astore_1                            取出栈顶hello对象放入变量1中
         8: iconst_2                            把2放入栈顶（当int取值-1~5采用iconst指令，取值-128~127采用bipush指令，取值-32768~32767采用sipush指令，取值-2147483648~2147483647采用 ldc 指令）
         9: istore_2                            取出栈顶元素放入变量2中
        10: iconst_3                            把3放入栈顶
        11: istore_3                            取出栈顶元素放入变量3中
        12: iconst_4                            把4放入栈顶
        13: istore        4                     取出栈顶元素放入变量4中
        15: bipush        10                    把10放入栈顶
        17: istore        5                     取出栈顶元素放入变量5中
        19: iconst_5                            把5放入栈顶
        20: istore        6                     取出栈顶元素放入变量6中
        22: aload_1                             把变量1放入栈顶
        23: iload_3                             把变量3放入栈顶
        24: iload_2                             把变量2放入栈顶
        25: invokevirtual #4                  // Method add:(II)I 调用add方法
        28: istore_3                            把栈顶结果放入变量3中
        29: aload_1                             把变量1放入栈顶
        30: iload         4                     把变量4放入栈顶
        32: iload_2                             把变量2放入栈顶
        33: invokevirtual #5                  // Method sub:(II)I 调用sub方法
        36: istore        4                     把栈顶结果放入变量4中
        38: aload_1                             把变量1放入栈顶
        39: iload         6                     把变量6放入栈顶
        41: iload_2                             把变量2放入栈顶
        42: invokevirtual #6                  // Method mul:(II)I 调用mul方法
        45: istore        6                     把栈顶结果放入变量6
        47: iload         6                     把变量6放入栈顶
        49: iload         5                     把变量5放入栈顶
        51: if_icmpne     76                    比较栈顶两int型数值大小，当两值不相等时跳转
        54: iconst_0                            把0放入栈顶
        55: istore        7                     取出栈顶元素放入变量7中
        57: iload         7                     把变量7放入栈顶
        59: iconst_2                            把2放入栈顶
        60: if_icmpge     76                    比较栈顶两int型数值大小，当前值大于等于后值时跳转
        63: aload_1                             把变量1放入栈顶
        64: iload_3                             把变量3放入栈顶
        65: iload_2                             把变量2放入栈顶
        66: invokevirtual #7                  // Method div:(II)I 调用div方法
        69: istore_3                            把栈顶结果放入变量3
        70: iinc          7, 1                  对变量7做自增
        73: goto          57                    跳转57行
        76: return                              程序返回
      LineNumberTable:
        line 3: 0
        line 4: 8
        line 5: 10
        line 6: 12
        line 7: 15
        line 8: 19
        line 9: 22
        line 10: 29
        line 11: 38
        line 12: 47
        line 13: 54
        line 14: 63
        line 13: 70
        line 17: 76
      StackMapTable: number_of_entries = 2
        frame_type = 255 /* full_frame */
          offset_delta = 57
          locals = [ class "[Ljava/lang/String;", class Hello, int, int, int, int, int, int ]
          stack = []
        frame_type = 250 /* chop */
          offset_delta = 18

  public int add(int, int);
    descriptor: (II)I
    flags: ACC_PUBLIC
    Code:
      stack=2, locals=3, args_size=3
         0: iload_1                     变量1压入栈顶
         1: iload_2                     变量2压入栈顶
         2: iadd                        栈顶2个int类型相加
         3: ireturn                     返回栈顶int类型结果
      LineNumberTable:
        line 20: 0

  public int sub(int, int);
    descriptor: (II)I
    flags: ACC_PUBLIC
    Code:
      stack=2, locals=3, args_size=3
         0: iload_1                     变量1压入栈顶
         1: iload_2                     变量2压入栈顶
         2: isub                        栈顶2个int类型相减
         3: ireturn                     返回栈顶int类型结果
      LineNumberTable:
        line 23: 0

  public int mul(int, int);
    descriptor: (II)I
    flags: ACC_PUBLIC
    Code:
      stack=2, locals=3, args_size=3
         0: iload_1                     变量1压入栈顶
         1: iload_2                     变量2压入栈顶
         2: imul                        栈顶2个int类型相乘
         3: ireturn                     返回栈顶int类型结果
      LineNumberTable:
        line 26: 0

  public int div(int, int);
    descriptor: (II)I
    flags: ACC_PUBLIC
    Code:
      stack=2, locals=3, args_size=3
         0: iload_1                     变量1压入栈顶
         1: iload_2                     变量2压入栈顶
         2: idiv                        栈顶2个int类型相除
         3: ireturn                     返回栈顶int类型结果
      LineNumberTable:
        line 29: 0
}


2.（必做）自定义一个 Classloader，加载一个 Hello.xlass 文件，执行 hello 方法，此文件内容是一个 Hello.class 文件所有字节（x=255-x）处理后的文件。文件群里提供。

可执行文件为MyClassloader

3.（必做）画一张图，展示 Xmx、Xms、Xmn、Meta、DirectMemory、Xss 这些内存参数的关系。

位于resources目录下的jvm.png

4.（选做）检查一下自己维护的业务系统的 JVM 参数配置，用 jstat 和 jstack、jmap 查看一下详情，并且自己独立分析一下大概情况，思考有没有不合理的地方，如何改进。

注意：如果没有线上系统，可以自己 run 一个 web/java 项目。

5.（选做）本机使用 G1 GC 启动一个程序，仿照课上案例分析一下 JVM 情况。



## 操作步骤


### 作业1（选做）

1. 编写代码, 根据自己的意愿随意编写, 可参考: [Hello.java](./Hello.java)
2. 编译代码, 执行命令： `javac -g Hello.java`
3. 查看反编译的代码。
  - 3.1 可以安装并使用idea的jclasslib插件, 选中 [Hello.java](./Hello.java) 文件, 选择 `View --> Show Bytecode With jclasslib` 即可。
  - 3.2 或者直接通过命令行工具 javap, 执行命令: `javap -v Hello.class`
4. 分析相关的字节码。【此步骤需要各位同学自己进行分析】


### 作业2（必做）

1. 打开 Spring 官网: https://spring.io/
2. 找到 Projects --> Spring Initializr:  https://start.spring.io/
3. 填写项目信息, 生成 maven 项目; 下载并解压。
4. Idea或者Eclipse从已有的Source导入Maven项目。
5. 从课件资料中找到资源 Hello.xlass 文件并复制到 src/main/resources 目录。
6. 编写代码，实现 findClass 方法，以及对应的解码方法
7. 编写main方法，调用 loadClass 方法；
8. 创建实例，以及调用方法
9. 执行.

具体代码可参考: [XlassLoader.java](./XlassLoader.java)


### 作业3（必做）

对应的图片需要各位同学自己绘制，可以部分参考PPT课件。

提示:

- Xms 设置堆内存的初始值
- Xmx 设置堆内存的最大值
- Xmn 设置堆内存中的年轻代的最大值
- Meta 区不属于堆内存, 归属为非堆
- DirectMemory 直接内存, 属于 JVM 内存中开辟出来的本地内存空间。
- Xss设置的是单个线程栈的最大空间;

JVM进程空间中的内存一般来说包括以下这些部分:

- 堆内存(Xms ~ Xmx) = 年轻代(~Xmn) + 老年代
- 非堆 = Meta + CodeCache + ...
- Native内存 = 直接内存 + Native + ...
- 栈内存 = n * Xss

另外，注意区分规范与实现的区别, 需要根据具体实现以及版本, 才能确定。 一般来说，我们的目的是为了排查故障和诊断问题，大致弄清楚这些参数和空间的关系即可。 具体设置时还需要留一些冗余量。


### 4.（选做）

这个是具体案例分析, 请各位同学自己分析。

比如我们一个生产系统应用的启动参数为:

```
JAVA_OPTS=-Xmx200g -Xms200g -XX:+UnlockExperimentalVMOptions -XX:+UseZGC -XX:ZCollectionInterval=30 -XX:ZAllocationSpikeTolerance=5 -XX:ReservedCodeCacheSize=2g -XX:InitialCodeCacheSize=2g -XX:ConcGCThreads=8 -XX:ParallelGCThreads=16
```

另一个系统的启动参数为:

```
JAVA_OPTS=-Xmx4g -Xms4g -XX:+UseG1GC -XX:MaxGCPauseMillis=50
```

具体如何设置, 需要考虑的因素包括:

- 系统容量: 业务规模, 并发, 成本预算; 需要兼顾性能与成本;
- 延迟要求: 最坏情况下能接受多少时间的延迟尖刺。
- 吞吐量:  根据业务特征来确定, 比如, 网关, 大数据底层平台, 批处理作业系统, 在线实时应用, 他们最重要的需求不一样。
- 系统架构: 比如拆分为小内存更多节点, 还是大内存少量节点。
- 其他...


### 5.（选做）

例如使用以下命令:

```
# 编译
javac -g GCLogAnalysis.java
# JDK8 启动程序
java -Xmx2g -Xms2g -XX:+UseG1GC -verbose:gc -XX:+PrintGCDateStamps -XX:+PrintGCDetails -Xloggc:gc.log  GCLogAnalysis
```

尝试使用课程中介绍的各种工具JDK命令行和图形工具来进行分析。

其中 [GCLogAnalysis.java](./GCLogAnalysis.java) 文件也可以从课件资料zip中找到.

## 更多资料

更多中英文的技术文章和参考资料: <https://github.com/cncounter/translation>

