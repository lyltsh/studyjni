package com.studyjni.hello;

import com.sun.org.apache.bcel.internal.util.ClassPath;

import java.lang.reflect.Field;

/**
 * @author: leiyulin
 * @description:
 * @date:2018/10/3010:37 AM
 */
public class HelloJNI {
    static {
        try {
            System.out.println("before change:" + System.getProperty("java.library.path"));
//            System.out.println("classpath:" + ClassPath.getClassPath());
//            System.setProperty("java.library.path", System.getProperty("java.library.path") + ":/Users/leiyl/Documents/code/github/studyjni");
//            System.out.println("after change:" + System.getProperty("java.library.path"));

//            Field fieldSysPath = ClassLoader.class.getDeclaredField("sys_paths");
//            Field fieldUsrPath = ClassLoader.class.getDeclaredField("usr_paths");
//
//            fieldSysPath.setAccessible(true);
//            fieldSysPath.set(null, null);

            //libhello.so
            System.load("/Users/leiyl/Documents/code/github/studyjni/lib/libHelloJNI.so");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private native void sayHello();

    public static void main(String[] args) {
        new HelloJNI().sayHello();
    }
}
