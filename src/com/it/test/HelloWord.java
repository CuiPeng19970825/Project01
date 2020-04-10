package com.it.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/*
* 快捷键
* 1、向下开始新的一行：shift+enter
* 2、向上开始新的一行：ctrl+shift+enter
* 3、删除一行：ctrl+d
* 4、查看源码：ctrl+选中指定的结构 或 ctrl+shift+t
* 5、万能解错/生成返回值变量：alt+enter
* 6、退回到前一个编辑的页面：alt+left
* 7、进入到下一个编辑的页面: alt+right
* 8、查看类继承关系图：ctrl+alt+u
* 9、查看类继承关系：ctrl+t
* 10、选中数行整体往后移动：tab
* 11、选中数行整体往前移动：shift+tab
* 12、查看类的结构：ctrl+o
* 13、重构：修改变量名与方法名：alt+shift+r
* 14、大写转小写/小写转大写：ctrl+shift+y
* 15、生成构造器/get/set/toString:alt+shift+s
* 16、收起所有方法：alt+shift+c
* 17、打开所有方法：alt+shift+x
* 18、生成try-catch等：alt+shift+z
* 19、局部变量抽取为成员变量：alt+shift+f
* 20、查找/替换(当前)：ctrl+f
* 21、查找文件：连续按两次shift
* 22、查看类的继承结构图：ctrl+shift+u
* 23、打开最近修改的文件：ctrl+e
* 24、快速搜索类中的错误信息：ctrl+shift+q
* 25、选择要粘贴的内容：ctrl+shift+v
* 26、查找方法在哪里被调用：ctrl+shift+h
* */
public class HelloWord {
    public static void main(String args[]){
       // System.out.println("Hello World!!");
        ArrayList A=new ArrayList();
        HelloWord h1=new HelloWord();
        T t1=new T();
        T t2=new T();
        A.add(h1);
        A.add(t1);
        A.add(t2);
        System.out.println(A);
        Collections.reverse(A);
        System.out.println(A);
        Iterator i1=A.iterator();
        while(i1.hasNext()){
           System.out.println(i1.next());
        }
        for(Iterator i2=A.iterator();i2.hasNext(); ){
            System.out.println(i2.next());
        }
    }
}

class T{
    public T() {
    }
}
