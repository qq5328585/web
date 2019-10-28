package com.tj.pattern.proxyPattern.dynamicProxy.jdkProxy;

import com.tj.pattern.proxyPattern.Person;
import sun.misc.ProxyGenerator;

import java.io.FileOutputStream;
import java.lang.reflect.Method;

/**
 * 2019/10/27
 * author:ljh
 */
public class JdkProxyTest {
    public static void main(String[] args) {
        try {
            Person person =  (Person)new JdkMeipo().getInstance(new Girl());
            //通过反射寻找方法,如果person对象是Object会提示$proxy0无findLove方法
//            Method method = person.getClass().getMethod("findLove", null);
//            method.invoke(person);
            person.findLove();

            BoyInterface boy = (BoyInterface)new JdkMeipo().getInstance(new Boy());
            boy.findJob();


//            byte[] bytes = ProxyGenerator.generateProxyClass("$proxy0", new Class[]{Person.class});
//            FileOutputStream os = new FileOutputStream("D://JAVA//jad//$proxy0.class");
//            os.write(bytes);
//            os.flush();
//            os.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
